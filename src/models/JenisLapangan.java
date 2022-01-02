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
public class JenisLapangan extends Model{
    private int id_jenis_lapangan;
    private String jenis_lapangan;

    public JenisLapangan() {
        super("jenis_lapangan");
    }
    
    public JenisLapangan(String jenis_lapangan) {
        super("jenis_lapangan");
        this.jenis_lapangan = jenis_lapangan;
    }
    /**
     * @return the id_jenis_lapangan
     */
    public int getId_jenis_lapangan() {
        return id_jenis_lapangan;
    }

    /**
     * @param id_jenis_lapangan the id_jenis_lapangan to set
     */
    public void setId_jenis_lapangan(int id_jenis_lapangan) {
        this.id_jenis_lapangan = id_jenis_lapangan;
    }

    /**
     * @return the jenis_lapangan
     */
    public String getJenis_lapangan() {
        return jenis_lapangan;
    }

    /**
     * @param jenis_lapangan the jenis_lapangan to set
     */
    public void setJenis_lapangan(String jenis_lapangan) {
        this.jenis_lapangan = jenis_lapangan;
    }

    @Override
    public void save() {
        try {
            this.dbConn.stm.execute(this.savePrefix
                    + String.format("`jenis_lapangan`) VALUES (%s)",
                            this.jenis_lapangan));
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
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

    @Override
    public boolean exist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
