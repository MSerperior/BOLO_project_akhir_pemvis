/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import models.Lapangan;

/**
 *
 * @author 62821
 */
public class HomeController {

    DBConnector dbConn = new DBConnector();

    /**
     * fungsi untuk mendapatkan pendapatan harian atau bulanan
     *
     * @param r, 1=harian, 2=bulanan
     * @return resultset dari query, null jika kondisi salah
     */
    public ResultSet getLapangan() throws SQLException {
        return dbConn.stm.executeQuery("SELECT * FROM lapangan "
                + "LEFT JOIN gambar USING (id_lapangan)"
                + "INNER JOIN jenis_lapangan USING (id_jenis_lapangan)");
    }

    /**
     * fungsi untuk mendapatkan riwayat top up harian atau bulanan
     *
     * @param r, 1=harian, 2=bulanan
     * @return resultset dari query, null jika kondisi salah
     */
    public ResultSet getRiwayatTopUp(int r) throws SQLException {
        if (r == 1) {
            return dbConn.stm.executeQuery("SELECT *, jumlah pendapatan FROM riwayat_top_up ORDER BY tanggal_top_up DESC LIMIT 14");
        } else if (r == 2) {
            return dbConn.stm.executeQuery("SELECT YEAR(tanggal_top_up) tahun,MONTH(tanggal_top_up) bulan,SUM(jumlah) pendapatan FROM riwayat_top_up GROUP BY 1,2 ORDER BY tanggal_top_up DESC LIMIT 12");
        } else {
            return null;
        }
    }

    public void pesanLapangan(int id_user, int id_lapangan, int durasi, String waktu_mulai) throws SQLException {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String waktu_pemesanan = myDateObj.format(myFormatObj);
        
        Lapangan lapangan = new Lapangan(id_lapangan);
        lapangan.exist();
        int total_pembayaran = lapangan.getHarga_per_jam()*durasi;
        dbConn.stm.execute("INSERT INTO rental(id_user, id_lapangan, durasi, waktu_pemesanan, waktu_mulai, total_pembayaran) VALUES"
                + String.format("(%d, %d, %d, '%s', '%s', %d)", id_user, id_lapangan, durasi, waktu_pemesanan, waktu_mulai, total_pembayaran));
        dbConn.stm.execute(String.format("UPDATE user SET saldo=saldo-%d WHERE id_user=%d",total_pembayaran,id_user));
    }

}
