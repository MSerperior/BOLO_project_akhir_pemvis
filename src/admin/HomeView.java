/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import db.DBConnector;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import models.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author 62821
 */
public class HomeView extends javax.swing.JFrame {

    Object data[][] = new Object[100][4];
    String kolom[] = {"ID Lapangan", "Nama Lapangan", "Jenis Lapangan", "Harga per Jam"};
    HomeController homeController = new HomeController();
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    TableModel lapanganTM = new DefaultTableModel(data,kolom);

    /**
     * Creates new form HomeView
     *
     * @throws java.sql.SQLException
     */
    public HomeView() throws SQLException {
//        // Create dataset  
//         dataset = createDataset(1);
        // Create chart  

        createDataset(0);
        JFreeChart chart = ChartFactory.createLineChart(
                "Pendapatan", // Chart title  
                "Date", // X-Axis Label  
                "Number of Visitor", // Y-Axis Label  
                dataset
        );
        ChartPanel panel = new ChartPanel(chart);
        panel.setSize(800, 400);
        initComponents();
        PanelDashboard.add(panel);
        setKomponen();
        setTampilan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        PanelJudul2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        ButtonDashboard = new javax.swing.JButton();
        ButtonLapangan = new javax.swing.JButton();
        ButtonTopup = new javax.swing.JButton();
        ButtonSetting = new javax.swing.JButton();
        ButtonTransaksi = new javax.swing.JButton();
        ButtonLogout = new javax.swing.JButton();
        PanelIsi = new javax.swing.JPanel();
        PanelDashboard = new javax.swing.JPanel();
        rentangChoice = new java.awt.Choice();
        PanelLapangan = new javax.swing.JPanel();
        tambahLapangan = new javax.swing.JButton();
        tambahJenisLapangan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lapanganTable = new javax.swing.JTable();
        editLapanganButton = new javax.swing.JButton();
        deleteLapanganButton = new javax.swing.JButton();
        PanelToupUp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PanelSetting = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelTransaksi = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        PanelJudul2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HOME VIEW");

        javax.swing.GroupLayout PanelJudul2Layout = new javax.swing.GroupLayout(PanelJudul2);
        PanelJudul2.setLayout(PanelJudul2Layout);
        PanelJudul2Layout.setHorizontalGroup(
            PanelJudul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJudul2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelJudul2Layout.setVerticalGroup(
            PanelJudul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelJudul2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );

        PanelMenu.setBackground(new java.awt.Color(204, 204, 255));

        ButtonDashboard.setText("Dashboard");
        ButtonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDashboardActionPerformed(evt);
            }
        });

        ButtonLapangan.setText("Lapangan");
        ButtonLapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLapanganActionPerformed(evt);
            }
        });

        ButtonTopup.setText("Top Up");
        ButtonTopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTopupActionPerformed(evt);
            }
        });

        ButtonSetting.setText("Setting");
        ButtonSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSettingActionPerformed(evt);
            }
        });

        ButtonTransaksi.setText("Transaksi");
        ButtonTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTransaksiActionPerformed(evt);
            }
        });

        ButtonLogout.setText("LogOut");
        ButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(ButtonLapangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonTopup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(ButtonDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLapangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonTopup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonSetting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonLogout)
                .addGap(19, 19, 19))
        );

        PanelIsi.setBackground(new java.awt.Color(255, 255, 255));
        PanelIsi.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout PanelDashboardLayout = new javax.swing.GroupLayout(PanelDashboard);
        PanelDashboard.setLayout(PanelDashboardLayout);
        PanelDashboardLayout.setHorizontalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rentangChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
        );
        PanelDashboardLayout.setVerticalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rentangChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        PanelIsi.add(PanelDashboard, "card2");

        tambahLapangan.setText("Tambah Lapangan");
        tambahLapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahLapanganActionPerformed(evt);
            }
        });

        tambahJenisLapangan.setText("Tambah Jenis Lapangan");
        tambahJenisLapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahJenisLapanganActionPerformed(evt);
            }
        });

        lapanganTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Lapangan", " Nama Lapangan", "Jenis Lapangan", "Harga per Jam"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lapanganTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lapanganTableFocusLost(evt);
            }
        });
        lapanganTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapanganTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lapanganTable);

        editLapanganButton.setText("Edit");
        editLapanganButton.setEnabled(false);
        editLapanganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLapanganButtonActionPerformed(evt);
            }
        });

        deleteLapanganButton.setText("Delete");
        deleteLapanganButton.setEnabled(false);
        deleteLapanganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLapanganButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLapanganLayout = new javax.swing.GroupLayout(PanelLapangan);
        PanelLapangan.setLayout(PanelLapanganLayout);
        PanelLapanganLayout.setHorizontalGroup(
            PanelLapanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLapanganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLapanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(PanelLapanganLayout.createSequentialGroup()
                        .addComponent(tambahLapangan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahJenisLapangan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editLapanganButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteLapanganButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLapanganLayout.setVerticalGroup(
            PanelLapanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLapanganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLapanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahLapangan)
                    .addComponent(tambahJenisLapangan)
                    .addComponent(editLapanganButton)
                    .addComponent(deleteLapanganButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        PanelIsi.add(PanelLapangan, "card3");

        jLabel4.setText("Panel TopUp");

        javax.swing.GroupLayout PanelToupUpLayout = new javax.swing.GroupLayout(PanelToupUp);
        PanelToupUp.setLayout(PanelToupUpLayout);
        PanelToupUpLayout.setHorizontalGroup(
            PanelToupUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToupUpLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel4)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        PanelToupUpLayout.setVerticalGroup(
            PanelToupUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToupUpLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel4)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        PanelIsi.add(PanelToupUp, "card4");

        jLabel5.setText("Panel Setting");

        javax.swing.GroupLayout PanelSettingLayout = new javax.swing.GroupLayout(PanelSetting);
        PanelSetting.setLayout(PanelSettingLayout);
        PanelSettingLayout.setHorizontalGroup(
            PanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSettingLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel5)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        PanelSettingLayout.setVerticalGroup(
            PanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSettingLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel5)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        PanelIsi.add(PanelSetting, "card5");

        jLabel6.setText("Panel Transaksi");

        javax.swing.GroupLayout PanelTransaksiLayout = new javax.swing.GroupLayout(PanelTransaksi);
        PanelTransaksi.setLayout(PanelTransaksiLayout);
        PanelTransaksiLayout.setHorizontalGroup(
            PanelTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTransaksiLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel6)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        PanelTransaksiLayout.setVerticalGroup(
            PanelTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTransaksiLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel6)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        PanelIsi.add(PanelTransaksi, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelIsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelJudul2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelJudul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelIsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDashboardActionPerformed
        // TODO add your handling code here:
        panelPilihan = 0;
        setTampilan();
    }//GEN-LAST:event_ButtonDashboardActionPerformed

    private void ButtonLapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLapanganActionPerformed
        // TODO add your handling code here:
        panelPilihan = 1;
        setTampilan();
        try {
            updateLapanganTable();
        } catch (SQLException ex) {
            Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonLapanganActionPerformed

    private void ButtonTopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTopupActionPerformed
        // TODO add your handling code here:
        panelPilihan = 2;
        setTampilan();
    }//GEN-LAST:event_ButtonTopupActionPerformed

    private void ButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSettingActionPerformed
        // TODO add your handling code here:
        panelPilihan = 3;
        setTampilan();
    }//GEN-LAST:event_ButtonSettingActionPerformed

    private void ButtonTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTransaksiActionPerformed
        // TODO add your handling code here:
        panelPilihan = 4;
        setTampilan();
    }//GEN-LAST:event_ButtonTransaksiActionPerformed

    private void ButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLogoutActionPerformed

    private void tambahJenisLapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahJenisLapanganActionPerformed
        // TODO add your handling code here:
        JTextField namaJenisLapangan = new JTextField();
        Object[] message = {
            "Nama Jenis Lapangan:", namaJenisLapangan
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Tambah Jenis Lapangan", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            JenisLapangan jenisLapangan = new JenisLapangan(namaJenisLapangan.getText());
            jenisLapangan.save();
        } else {
            System.out.println("Login canceled");
        }
    }//GEN-LAST:event_tambahJenisLapanganActionPerformed

    private void tambahLapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahLapanganActionPerformed
        ArrayList list = new ArrayList();
        try {
            // TODO add your handling code here:
            ResultSet rs = homeController.indexJenisLapangan();
            while (rs.next()) {
                list.add(new JenisLapangan(rs.getInt("id_jenis_lapangan"), rs.getString("jenis_lapangan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        JTextField namaLapangan = new JTextField();
        JSpinner hargaPerJam = new JSpinner();
        JComboBox jenisLapangan = new JComboBox(list.toArray());
        Object[] message = {
            "Nama Lapangan:", namaLapangan,
            "Harga Per Jam:", hargaPerJam,
            "Jenis Lapangan:", jenisLapangan
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Tambah Lapangan", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            JenisLapangan pilihanJenisLapangan = (JenisLapangan) jenisLapangan.getSelectedItem();
            String nama_lapangan = namaLapangan.getText();
            int harga_per_jam = (int) hargaPerJam.getValue();
            Lapangan lapanganBaru = new Lapangan(pilihanJenisLapangan.getId_jenis_lapangan(), nama_lapangan, harga_per_jam);
            lapanganBaru.save();
        } else {
            System.out.println("Login canceled");
        }
        try {
            updateLapanganTable();
        } catch (SQLException ex) {
            Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tambahLapanganActionPerformed

    private void lapanganTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapanganTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = lapanganTable.getSelectedRow();
        if (selectedRow != -1) {
            editLapanganButton.setEnabled(true);
            deleteLapanganButton.setEnabled(true);
        }
    }//GEN-LAST:event_lapanganTableMouseClicked

    private void editLapanganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLapanganButtonActionPerformed
        // TODO add your handling code here:
        int i = lapanganTable.getSelectedRow();
        Lapangan lapangan = new Lapangan();
        lapangan.setId_lapangan((int) lapanganTM.getValueAt(i, 0));
        lapangan.setNama_lapangan((String) lapanganTM.getValueAt(i, 1));
        lapangan.setHarga_per_jam((int) lapanganTM.getValueAt(i, 3));
        
        String jenisLapangan = (String) lapanganTM.getValueAt(i, 2);
        
        ArrayList list = new ArrayList();
        try {
            // TODO add your handling code here:
            ResultSet rs = homeController.indexJenisLapangan();
            while (rs.next()) {
                list.add(new JenisLapangan(rs.getInt("id_jenis_lapangan"), rs.getString("jenis_lapangan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        JTextField namaLapanganTF = new JTextField(lapangan.getNama_lapangan());
        JSpinner hargaPerJamSpin = new JSpinner();
        JComboBox jenisLapanganCB = new JComboBox(list.toArray());
        hargaPerJamSpin.setValue(lapangan.getHarga_per_jam());
        jenisLapanganCB.setSelectedItem(jenisLapangan);
        
        Object[] message = {
            "Nama Lapangan:", namaLapanganTF,
            "Harga Per Jam:", hargaPerJamSpin,
            "Jenis Lapangan:", jenisLapanganCB
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Edit Lapangan", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            JenisLapangan pilihanJenisLapangan = (JenisLapangan) jenisLapanganCB.getSelectedItem();
            lapangan.setNama_lapangan(namaLapanganTF.getText());
            lapangan.setHarga_per_jam((int) hargaPerJamSpin.getValue());
            lapangan.setId_jenis_lapangan(pilihanJenisLapangan.getId_jenis_lapangan());
            lapangan.update();
        } else {
            System.out.println("Edit canceled");
        }
        try {
            updateLapanganTable();
        } catch (SQLException ex) {
            Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editLapanganButtonActionPerformed

    private void lapanganTableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lapanganTableFocusLost
        // TODO add your handling code here:
        int selectedRow = lapanganTable.getSelectedRow();
        if (selectedRow == -1) {
            editLapanganButton.setEnabled(false);
            deleteLapanganButton.setEnabled(false);
        }
    }//GEN-LAST:event_lapanganTableFocusLost

    private void deleteLapanganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLapanganButtonActionPerformed
        // TODO add your handling code here:
        int i = lapanganTable.getSelectedRow();
        Lapangan lapangan = new Lapangan();
        lapangan.setId_lapangan((int) lapanganTM.getValueAt(i, 0));
        int option = JOptionPane.showConfirmDialog(null, "Yakin hapus lapangan?", "Hapus Lapangan", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            lapangan.delete();
        } else {
            System.out.println("Delete canceled");
        }
        try {
            updateLapanganTable();
        } catch (SQLException ex) {
            Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteLapanganButtonActionPerformed
    private void setKomponen() {
        arrPanel = new JPanel[]{PanelDashboard, PanelLapangan, PanelToupUp, PanelSetting, PanelTransaksi};
        arrButton = new JButton[]{ButtonDashboard, ButtonLapangan, ButtonTopup, ButtonSetting, ButtonTransaksi};
//        arrColor = new Color[]{Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE};
        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                int i = rentangChoice.getSelectedIndex();
                System.out.println(i);
                try {
                    createDataset(i);
                } catch (SQLException ex) {
                    Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        rentangChoice.addItem("harian");
        rentangChoice.addItem("bulanan");
        rentangChoice.addItemListener(il);
    }

    private void setTampilan() {

        for (int i = 0; i < arrPanel.length; i++) {
            arrButton[i].setBackground(Color.WHITE);
            arrButton[i].setForeground(Color.GRAY);

            if (i != panelPilihan) {
                arrPanel[i].setVisible(false);
            } else if (i == panelPilihan) {
                arrPanel[i].setBackground(Color.WHITE);
                arrPanel[i].setVisible(true);
            }
        }
    }

    private void createDataset(int i) throws SQLException {
//        int i = 1;

        String series1 = "Pendapatan Top Up";
        String series2 = "Pendapatan Rental";

//        dataset = new DefaultCategoryDataset();
        dataset.clear();
        if (i == 0) {
            ResultSet rs1 = homeController.getRiwayatTopUp(i);
            while (rs1.next()) {
                dataset.addValue(rs1.getBigDecimal("pendapatan"), series1, rs1.getString("tanggal_top_up"));
            }
            ResultSet rs2 = homeController.getRental(i);
            while (rs2.next()) {
                dataset.addValue(rs2.getBigDecimal("pendapatan"), series2, rs2.getString("waktu_pemesanan"));
            }
        } else {
            ResultSet rs1 = homeController.getRiwayatTopUp(i);
            while (rs1.next()) {
                BigDecimal tahun = rs1.getBigDecimal("tahun");
                BigDecimal bulan = rs1.getBigDecimal("bulan");
                dataset.addValue(rs1.getBigDecimal("pendapatan"), series1, tahun + "-" + bulan);
            }
            ResultSet rs2 = homeController.getRental(i);
            while (rs2.next()) {
                BigDecimal tahun = rs2.getBigDecimal("tahun");
                BigDecimal bulan = rs2.getBigDecimal("bulan");
                dataset.addValue(rs2.getBigDecimal("pendapatan"), series2, tahun + "-" + bulan);
            }
//            return dataset;
        }

//        dataset.addValue(150, series2, "2016-12-19");
//        dataset.addValue(130, series2, "2016-12-20");
//        dataset.addValue(95, series2, "2016-12-21");
//        dataset.addValue(195, series2, "2016-12-22");
//        dataset.addValue(200, series2, "2016-12-23");
//        dataset.addValue(180, series2, "2016-12-24");
//        dataset.addValue(230, series2, "2016-12-25");
//        return dataset;
    }

    private void updateLapanganTable() throws SQLException {
        int i = 0;
        ResultSet rs = homeController.dbConn.stm.executeQuery("SELECT * FROM lapangan INNER JOIN jenis_lapangan USING(id_jenis_lapangan) ORDER BY id_lapangan");
        while (rs.next()) {
            lapanganTM.setValueAt(rs.getInt("id_lapangan"), i, 0);
            lapanganTM.setValueAt(rs.getString("nama_lapangan"), i, 1);
            lapanganTM.setValueAt(rs.getString("jenis_lapangan"), i, 2);
            lapanganTM.setValueAt(rs.getInt("harga_per_jam"), i, 3);
            i++;
        }
        lapanganTM.setValueAt(null, i, 0);
        lapanganTM.setValueAt(null, i, 1);
        lapanganTM.setValueAt(null, i, 2);
        lapanganTM.setValueAt(null, i, 3);
//        lapanganTM.TableModel tm = new javax.swing.table.DefaultTableModel(data, kolom);
        lapanganTable.setModel(lapanganTM);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomeView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDashboard;
    private javax.swing.JButton ButtonLapangan;
    private javax.swing.JButton ButtonLogout;
    private javax.swing.JButton ButtonSetting;
    private javax.swing.JButton ButtonTopup;
    private javax.swing.JButton ButtonTransaksi;
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelIsi;
    private javax.swing.JPanel PanelJudul2;
    private javax.swing.JPanel PanelLapangan;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelSetting;
    private javax.swing.JPanel PanelToupUp;
    private javax.swing.JPanel PanelTransaksi;
    private javax.swing.JButton deleteLapanganButton;
    private javax.swing.JButton editLapanganButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lapanganTable;
    private java.awt.Choice rentangChoice;
    private javax.swing.JButton tambahJenisLapangan;
    private javax.swing.JButton tambahLapangan;
    // End of variables declaration//GEN-END:variables
    JPanel[] arrPanel;
    JButton[] arrButton;
    Color[] arrColor;

    int panelPilihan;
}
