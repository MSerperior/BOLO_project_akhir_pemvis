/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 62821
 */
public class User extends Model{

    public User(){
        super("user");
        this.saldo = 0;
    }
    public User(String nama, String email, String password){
        super("user");
//        this.id_user = id_user;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.saldo = 0;
    }

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    private int id_user;
    private String nama;
    private String email;
    private String password;
    private int saldo;

    @Override
    public void save() {
        try {
            this.dbConn.stm.execute(this.savePrefix +
                    String.format("(`nama`, `email`, `password`, `saldo`) VALUES ('%s','%s','%s',%d)",
                            this.nama,
                            this.email,
                            this.password,
                            this.saldo) );
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete() {
        try {
            this.dbConn.stm.execute(this.deletePrefix +
                    String.format("WHERE id_user=%d",
                            this.id_user) );
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update() {
        try {
            this.dbConn.stm.execute(this.updatePrefix +
                    String.format("nama='%s', email='%s', password='%s', saldo=%d WHERE id_user='%d'",
                            this.nama,
                            this.email,
                            this.password,
                            this.saldo,
                            this.id_user) );
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
