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
public class Lapangan extends Model{

    public Lapangan(){
        super("lapangan");
    }
    public Lapangan(int id_jenis_lapangan, String nama_lapangan, int harga_per_jam) {
        super("lapangan");
        this.id_jenis_lapangan = id_jenis_lapangan;
        this.nama_lapangan = nama_lapangan;
        this.harga_per_jam = harga_per_jam;
    }
    public Lapangan(int id_lapangan, int id_jenis_lapangan, String nama_lapangan, int harga_per_jam) {
        super("lapangan");
        this.id_lapangan = id_lapangan;
        this.id_jenis_lapangan = id_jenis_lapangan;
        this.nama_lapangan = nama_lapangan;
        this.harga_per_jam = harga_per_jam;
    }

    
    /**
     * @return the id_lapangan
     */
    public int getId_lapangan() {
        return id_lapangan;
    }

    /**
     * @param id_lapangan the id_lapangan to set
     */
    public void setId_lapangan(int id_lapangan) {
        this.id_lapangan = id_lapangan;
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
     * @return the nama_lapangan
     */
    public String getNama_lapangan() {
        return nama_lapangan;
    }

    /**
     * @param nama_lapangan the nama_lapangan to set
     */
    public void setNama_lapangan(String nama_lapangan) {
        this.nama_lapangan = nama_lapangan;
    }

    /**
     * @return the harga_per_jam
     */
    public int getHarga_per_jam() {
        return harga_per_jam;
    }

    /**
     * @param harga_per_jam the harga_per_jam to set
     */
    public void setHarga_per_jam(int harga_per_jam) {
        this.harga_per_jam = harga_per_jam;
    }
    private int id_lapangan;
    private int id_jenis_lapangan;
    private String nama_lapangan;
    private int harga_per_jam;

    @Override
    public void save() {
        try {
            this.dbConn.stm.execute(this.savePrefix
                    + String.format("(`id_jenis_lapangan`, `nama_lapangan`, `harga_per_jam`) VALUES (%d, '%s', %d)",
                            this.id_jenis_lapangan,
                            this.nama_lapangan,
                            this.harga_per_jam));
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete() {
        try {
            this.dbConn.stm.execute(this.deletePrefix
                    + String.format("WHERE id_lapangan=%d",
                            this.id_lapangan));
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update() {
        try {
            this.dbConn.stm.execute(this.updatePrefix
                    + String.format("nama_lapangan='%s', harga_per_jam=%d, id_jenis_lapangan=%d WHERE id_lapangan=%d",
                            this.nama_lapangan,
                            this.harga_per_jam,
                            this.id_jenis_lapangan,
                            this.id_lapangan));
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean exist() {
        try {
            return this.dbConn.stm.executeQuery(this.selectPrefix
                    + String.format("WHERE id_lapangan=%d",
                            this.id_lapangan)).next();
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
