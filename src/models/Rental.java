/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 62821
 */
public class Rental extends Model {

    private int id_rental;
    private int id_user;
    private int id_lapangan;
    private int durasi;
    private Date waktu_pemesanan;
    private Date waktu_mulai;
    private int total_pembayaran;

    public Rental() {
        super("rental");
    }

    public Rental(int id_user, int id_lapangan, int durasi, Date waktu_pemesanan, Date waktu_mulai, int total_pembayaran) {
        super("rental");
        this.id_user = id_user;
        this.id_lapangan = id_lapangan;
        this.durasi = durasi;
        this.waktu_pemesanan = waktu_pemesanan;
        this.waktu_mulai = waktu_mulai;
        this.total_pembayaran = total_pembayaran;
    }

    /**
     * @return the id_rental
     */
    public int getId_rental() {
        return id_rental;
    }

    /**
     * @param id_rental the id_rental to set
     */
    public void setId_rental(int id_rental) {
        this.id_rental = id_rental;
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
     * @return the durasi
     */
    public int getDurasi() {
        return durasi;
    }

    /**
     * @param durasi the durasi to set
     */
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    /**
     * @return the waktu_pemesanan
     */
    public Date getWaktu_pemesanan() {
        return waktu_pemesanan;
    }

    /**
     * @param waktu_pemesanan the waktu_pemesanan to set
     */
    public void setWaktu_pemesanan(Date waktu_pemesanan) {
        this.waktu_pemesanan = waktu_pemesanan;
    }

    /**
     * @return the waktu_mulai
     */
    public Date getWaktu_mulai() {
        return waktu_mulai;
    }

    /**
     * @param waktu_mulai the waktu_mulai to set
     */
    public void setWaktu_mulai(Date waktu_mulai) {
        this.waktu_mulai = waktu_mulai;
    }

    /**
     * @return the total_pembayaran
     */
    public int getTotal_pembayaran() {
        return total_pembayaran;
    }

    /**
     * @param total_pembayaran the total_pembayaran to set
     */
    public void setTotal_pembayaran(int total_pembayaran) {
        this.total_pembayaran = total_pembayaran;
    }

    @Override
    public void save() {
        try {
            this.dbConn.stm.execute(this.savePrefix
                    + String.format("(`id_rental`, `id_user`, `id_lapangan`, `durasi`, `waktu_pemesanan`, `waktu_mulai`, `total_pembayaran`) VALUES(%d,%d,%d,%d,'%s','%s',%d)",
                            this.id_rental,
                            this.id_user,
                            this.id_lapangan,
                            this.durasi,
                            this.waktu_pemesanan,
                            this.waktu_mulai,
                            this.total_pembayaran));
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete() {
        try {
            this.dbConn.stm.execute(this.deletePrefix
                    + String.format("WHERE id_rental=%d",
                            this.id_rental));
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exist() {
        try {
            return this.dbConn.stm.executeQuery(this.selectPrefix
                    + String.format("WHERE id_rental=%d",
                            this.id_rental)).next();
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
