/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import db.DBConnector;

/**
 *
 * @author 62821
 */
abstract class Model {
    String table = "null";
    String savePrefix;
    String deletePrefix;
    String updatePrefix;
    DBConnector dbConn = new DBConnector();
    
    Model(String table){
        this.table = table;
        this.savePrefix = "INSERT INTO " + this.table;
        this.deletePrefix = "DELETE FROM " + this.table + " ";
        this.updatePrefix = "UPDATE " + this.table + " SET ";
    }
    public abstract void save();
    public abstract void delete();
    public abstract void update();
    
}
