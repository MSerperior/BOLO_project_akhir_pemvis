/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.ResultSet;
import db.DBConnector;
import java.sql.SQLException;

/**
 *
 * @author 62821
 */
public class HomeController {

    DBConnector dbConn = new DBConnector();

    /**
     * Fungsi untuk mendapatkan pendapatan harian atau bulanan
     *
     * @param r, 0=harian, 1=bulanan
     * @return ResultSet dari query, null jika kondisi salah
     */
    public ResultSet getRental(int r) throws SQLException {
        if (r == 0) {

            return dbConn.stm.executeQuery("SELECT *,total_pembayaran pendapatan FROM rental ORDER BY waktu_pemesanan ASC LIMIT 14");
        } else if (r == 1) {
            return dbConn.stm.executeQuery("SELECT YEAR(waktu_pemesanan) tahun,MONTH(waktu_pemesanan) bulan,SUM(total_pembayaran) pendapatan FROM rental GROUP BY 1,2 ORDER BY waktu_pemesanan ASC LIMIT 12");
        } else {
            return null;
        }
    }

    /**
     * fungsi untuk mendapatkan riwayat top up harian atau bulanan
     *
     * @param r, 0=harian, 1=bulanan
     * @return resultset dari query, null jika kondisi salah
     */
    public ResultSet getRiwayatTopUp(int r) throws SQLException {
        if (r == 0) {
            return dbConn.stm.executeQuery("SELECT *, jumlah pendapatan FROM riwayat_top_up ORDER BY tanggal_top_up ASC LIMIT 14");
        } else if (r == 1) {
            return dbConn.stm.executeQuery("SELECT YEAR(tanggal_top_up) tahun,MONTH(tanggal_top_up) bulan,SUM(jumlah) pendapatan FROM riwayat_top_up GROUP BY 1,2 ORDER BY tanggal_top_up ASC LIMIT 12");
        } else {
            System.out.println("admin.HomeController.getRiwayatTopUp()");
            return null;
        }
    }

    public ResultSet getRiwayatTransaksi() throws SQLException {
        return dbConn.stm.executeQuery("SELECT * FROM rental "
                + "INNER JOIN lapangan USING (id_lapangan) "
                + "INNER JOIN user USING (id_user) "
                + "ORDER BY waktu_pemesanan DESC");
    }

    public ResultSet indexJenisLapangan() throws SQLException {
        return dbConn.stm.executeQuery("SELECT * FROM jenis_lapangan");
    }

    public void topUp(int id_user, int id_admin, int nominal) throws SQLException {
        dbConn.stm.execute(String.format("UPDATE user SET saldo=saldo+%d WHERE id_user=%s", nominal, id_user));
        dbConn.stm.execute(String.format("INSERT INTO riwayat_top_up(id_user, id_admin, jumlah, tanggal_top_up) VALUES(%d, %d, %d, NOW())", id_user, id_admin, nominal));
    }

}
