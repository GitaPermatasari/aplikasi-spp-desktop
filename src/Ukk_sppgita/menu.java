/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ukk_sppgita;

/**
 *
 * @author user
 */
public class menu extends javax.swing.JFrame {
private String username;
private String level;




    /**
     * Creates new form admin2
     */
    public menu() {
        initComponents();
    }
    
    public void setUsername(String u) {
    username = u;
}
    
    public void setLevel(String l) {
    level = l;
    //menu m = new menu();
    if (level.equals("admin")) {
        
}else if (level.equals("petugas")) {
        datasiswa.setEnabled(false);
        datapetugas.setEnabled(false);
        laporan.setEnabled(false);
        dataspp.setEnabled(false);
        datakls.setEnabled(false);
    } else if (level.equals("siswa")) {
        datasiswa.setEnabled(false);
        datapetugas.setEnabled(false);
        datakls.setEnabled(false);
        pembayaran.setEnabled(false);
        dataspp.setEnabled(false);
        laporan.setEnabled(false);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        riwayat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        datasiswa = new javax.swing.JButton();
        datapetugas = new javax.swing.JButton();
        datakls = new javax.swing.JButton();
        dataspp = new javax.swing.JButton();
        pembayaran = new javax.swing.JButton();
        laporan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-logout-35.png"))); // NOI18N
        jButton7.setText("LogOut");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 150, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Selamat Datang di Pembayaran SPP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        riwayat.setBackground(new java.awt.Color(153, 153, 153));
        riwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/riwayat.png"))); // NOI18N
        riwayat.setText("Riwayat");
        riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatActionPerformed(evt);
            }
        });
        jPanel1.add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 150, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/download.jpeg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SMKN 2 KUNINGAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(114, 124, 124));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datasiswa.setBackground(new java.awt.Color(204, 204, 204));
        datasiswa.setText("Data siswa");
        datasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasiswaActionPerformed(evt);
            }
        });
        jPanel2.add(datasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 27, 130, 41));

        datapetugas.setBackground(new java.awt.Color(204, 204, 204));
        datapetugas.setText("Data petugas");
        datapetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datapetugasActionPerformed(evt);
            }
        });
        jPanel2.add(datapetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 98, 130, 42));

        datakls.setText("Data kelas");
        datakls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataklsActionPerformed(evt);
            }
        });
        jPanel2.add(datakls, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 168, 130, 45));

        dataspp.setText("Data SPP");
        dataspp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasppActionPerformed(evt);
            }
        });
        jPanel2.add(dataspp, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 243, 130, 40));

        pembayaran.setText("Pembayaran");
        pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranActionPerformed(evt);
            }
        });
        jPanel2.add(pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 317, 130, 46));

        laporan.setText("Laporan");
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });
        jPanel2.add(laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 390, 130, 42));

        jPanel3.setBackground(new java.awt.Color(114, 124, 124));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MENU UTAMA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void datasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasiswaActionPerformed
        // TODO add your handling code here:
        form_siswa s=new form_siswa();
        s.show();
        this.dispose();
    }//GEN-LAST:event_datasiswaActionPerformed

    private void datapetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datapetugasActionPerformed
        // TODO add your handling code here:
        form_user f= new form_user();
        f.show();
        this.dispose();
    }//GEN-LAST:event_datapetugasActionPerformed

    private void dataklsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataklsActionPerformed
        // TODO add your handling code here:
        form_kelas k=new form_kelas();
        k.show();
        this.dispose();
    }//GEN-LAST:event_dataklsActionPerformed

    private void pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranActionPerformed
        // TODO add your handling code here:
        form_pembayaran pm=new form_pembayaran();
        pm.show();
        this.dispose();
    }//GEN-LAST:event_pembayaranActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
        // TODO add your handling code here:
        laporan l=new laporan();
        l.show();
        this.dispose();
    }//GEN-LAST:event_laporanActionPerformed

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        // TODO add your handling code here:
        riwayat r=new riwayat();
        r.show();
        this.dispose();
    }//GEN-LAST:event_riwayatActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        login l=new login();
        l.show();
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void datasppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasppActionPerformed
        // TODO add your handling code here:
        form_spp sp=new form_spp();
        sp.show();
        this.dispose();
    }//GEN-LAST:event_datasppActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datakls;
    private javax.swing.JButton datapetugas;
    private javax.swing.JButton datasiswa;
    private javax.swing.JButton dataspp;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton laporan;
    private javax.swing.JButton pembayaran;
    private javax.swing.JButton riwayat;
    // End of variables declaration//GEN-END:variables

    private void dsipose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}