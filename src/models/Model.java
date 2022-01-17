/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import db.DBConnector;
import java.sql.SQLException;

/**
 *
 * @author 62821
 */
abstract class Model {
    String table = "null";
    String savePrefix;
    String deletePrefix;
    String updatePrefix;
    String selectPrefix;
    DBConnector dbConn = new DBConnector();
    
    Model(String table){
        this.table = table;
        this.savePrefix = "INSERT INTO " + this.table;
        this.deletePrefix = "DELETE FROM " + this.table + " ";
        this.updatePrefix = "UPDATE " + this.table + " SET ";
        this.selectPrefix = "SELECT * FROM " + this.table + " ";
    }
    public abstract void save();
    public abstract void delete() throws SQLException;
    public abstract void update();
    public abstract boolean exist();
}
