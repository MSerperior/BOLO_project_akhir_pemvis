package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62821
 */
public class DBConnector {
    public static Connection con;
    public static Statement stm;
    public DBConnector(){
        try {
            String url ="jdbc:mysql://localhost/reservasi_lapangan";
            String user="root";
            String pass="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,pass);
            stm = (Statement)con.createStatement();
            System.out.println("koneksi berhasil;");
            
        } catch (Exception e) {
            System.err.println("koneksi gagal " +e.getMessage());
        }
    }
}
