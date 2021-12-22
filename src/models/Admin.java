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
public class Admin extends Model{
    
    public Admin(){
        super("admin");
    }
    public Admin(int id_admin, String nama, String email, String password){
        super("admin");
        this.id_admin = id_admin;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }
    /**
     * @return the id_admin
     */
    public int getId_admin() {
        return id_admin;
    }

    /**
     * @param id_admin the id_admin to set
     */
    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
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
    
    
    private int id_admin;
    private String nama;
    private String email;
    private String password;

    @Override
    public void save() {
        try {
            this.dbConn.stm.execute(this.savePrefix +
                    String.format("(`id_admin`, `nama`, `email`, `password`) VALUES (%d,'%s','%s','%s')",
                            this.id_admin,
                            this.nama,
                            this.email,
                            this.password) );
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
