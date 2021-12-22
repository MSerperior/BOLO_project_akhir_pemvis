/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author 62821
 */
public class Rental {
    int id_rental;
    int id_user;
    int id_lapangan;
    int durasi;
    Date waktu_pemesanan; //masih belum fix
    Date waktu_mulai;
    int total_pembayaran;
    
}
