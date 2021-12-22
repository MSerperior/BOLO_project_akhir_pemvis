/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author 62821
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        DBConnector dbConn = new DBConnector();
//        dbConn.koneksimysql();
        ResultSet rs = dbConn.stm.executeQuery("SELECT * FROM houses");
        while(rs.next())
        {
            System.out.println(rs.getBigDecimal("price"));
        }
//        conn.print();
    }
}
