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
    public void koneksimysql(){
        try {
            String url ="jdbc:mysql://localhost/web_property_v2";
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
