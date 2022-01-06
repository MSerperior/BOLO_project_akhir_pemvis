/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 62821
 */
public class HomeController {
    
    DBConnector dbConn = new DBConnector();
    
    /**
     * fungsi untuk mendapatkan pendapatan harian atau bulanan
     * @param r, 1=harian, 2=bulanan
     * @return resultset dari query, null jika kondisi salah
     */
    public ResultSet getRental(int r) throws SQLException{
        if(r == 1){
            return dbConn.stm.executeQuery("SELECT *,total_pembayaran pendapatan FROM rental ORDER BY waktu_pemesanan DESC LIMIT 14");
        }
        else if(r==2){
            return dbConn.stm.executeQuery("SELECT YEAR(waktu_pemesanan) tahun,MONTH(waktu_pemesanan) bulan,SUM(total_pembayaran) pendapatan FROM rental GROUP BY 1,2 ORDER BY waktu_pemesanan DESC LIMIT 12");
        }
        else{
            return null;
        }
    }
    /**
     * fungsi untuk mendapatkan riwayat top up harian atau bulanan
     * @param r, 1=harian, 2=bulanan
     * @return resultset dari query, null jika kondisi salah
     */
    public ResultSet getRiwayatTopUp(int r) throws SQLException{
        if(r == 1){
            return dbConn.stm.executeQuery("SELECT *, jumlah pendapatan FROM riwayat_top_up ORDER BY tanggal_top_up DESC LIMIT 14");
        }
        else if(r==2){
            return dbConn.stm.executeQuery("SELECT YEAR(tanggal_top_up) tahun,MONTH(tanggal_top_up) bulan,SUM(jumlah) pendapatan FROM riwayat_top_up GROUP BY 1,2 ORDER BY tanggal_top_up DESC LIMIT 12");
        }
        else{
            return null;
        }
    }
}
