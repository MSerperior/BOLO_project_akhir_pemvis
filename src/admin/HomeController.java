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
    
    //testing query
    public ResultSet test() throws SQLException{
        return dbConn.stm.executeQuery("Select * from houses");
    }
}
