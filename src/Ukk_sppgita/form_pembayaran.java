/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ukk_sppgita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class form_pembayaran extends javax.swing.JFrame {
    Connection con;
    DefaultTableModel tm;
    String idpembayaran;
    
    public void connect(){
        con=null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db_sppgita","root","");
        }catch (Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n "+e+"\n\n");
        }
    }
    
    public void refreshTable(){
        tm=new DefaultTableModel(null, new Object[] {"No.", "Nama Petugas", "NISN", "Nama Siswa", "Tanggal bayar", "Bulan", "Tarif SPP", "Jumlah Bayar"});
        tblpem.setModel(tm);
        tblpem.removeColumn(tblpem.getColumnModel().getColumn(0));
        tm.getDataVector().removeAllElements();
        try{
            PreparedStatement s = con.prepareStatement("SELECT pembayaran.id_pembayaran, petugas.nama_petugas,pembayaran.nisn,"
                    + " siswa.nama, pembayaran.tgl_bayar, pembayaran.bulan, spp.nominal, pembayaran.jumlah_bayar FROM pembayaran INNER JOIN "
                    + "siswa USING(nisn) INNER JOIN spp on siswa.id_spp = spp.id_spp inner join petugas on "
                    + "pembayaran.id_petugas = petugas.id_petugas where nisn LIKE '%"
                    + txtcari.getText().toString()+"%'");
            ResultSet r = s.executeQuery();
            while(r.next()){
                Object[] data={
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7),
                    r.getString(8)
                   
                    
                };
                tm.addRow(data);
                }
            }catch (Exception e){
                System.out.print("ERROR KUERI KE DATABASE:\n "+e+"\n\n");
        }
    }
    
    
    private void Data(){
     try {
            PreparedStatement s = con.prepareStatement("SELECT * FROM siswa");
            ResultSet r = s.executeQuery();
            
            while (r.next()) {                        
                cbnisn.addItem(r.getString("nisn"));
            }
             }catch(Exception e){
            
        }
    }
    public void DataPetugas(){
        try {
            PreparedStatement s = con.prepareStatement("SELECT * FROM petugas WHERE level='admin' or level='petugas'");
            ResultSet r = s.executeQuery();
            while (r.next()) {
                cbnmpetugas.addItem(r.getString("nama_petugas"));
            }
        }catch(Exception e){
    }
    }
    
    public void Spp(){
        try {
            PreparedStatement s = con.prepareStatement("SELECT * FROM spp");
            ResultSet r = s.executeQuery();
            while (r.next()) {
                tarif.setText(r.getString("nominal"));
            }
        }catch(Exception e){
    }
    }
   
    /**
     * Creates new form form_pembayaran
     */
    public form_pembayaran() {
        initComponents();
        connect();
        refreshTable();
        DataPetugas();
        Data();
        Spp();
        idPetugas.hide();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpem = new javax.swing.JTable();
        cbbyr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbnmpetugas = new javax.swing.JComboBox<>();
        cbnisn = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        cbcari = new javax.swing.JButton();
        cbtgl = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nmsiswa = new javax.swing.JTextField();
        idPetugas = new javax.swing.JTextField();
        tarif = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bulan = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Petugas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nisn");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal bayar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 80, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tarif SPP");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jumlah");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        tblpem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblpem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpem);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 760, 160));
        jPanel1.add(cbbyr, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 220, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-insert-35.png"))); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 140, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-emergency-exit-35.png"))); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 140, 40));

        cbnmpetugas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih nama" }));
        cbnmpetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnmpetugasActionPerformed(evt);
            }
        });
        cbnmpetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbnmpetugasKeyPressed(evt);
            }
        });
        jPanel1.add(cbnmpetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 200, 30));

        cbnisn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih NISN" }));
        cbnisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnisnActionPerformed(evt);
            }
        });
        cbnisn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbnisnKeyPressed(evt);
            }
        });
        jPanel1.add(cbnisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 250, 30));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PEMBAYARAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, -1));
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 420, 30));

        cbcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-search-client-35 (1).png"))); // NOI18N
        cbcari.setText("Cari");
        cbcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcariActionPerformed(evt);
            }
        });
        jPanel1.add(cbcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 180, 30));
        jPanel1.add(cbtgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 160, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cari Pembayaran by NISN :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-available-updates-35.png"))); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 140, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-trash-35.png"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 140, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Siswa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        nmsiswa.setEditable(false);
        jPanel1.add(nmsiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, 30));
        jPanel1.add(idPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 40, 30));

        tarif.setEditable(false);
        jPanel1.add(tarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bulan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Bulan", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jPanel1.add(bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 160, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bk11.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 580));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (idPetugas.getText().equals("") || cbnisn.getSelectedItem().equals("") || tarif.getText().equals("") || cbbyr.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Data harus terisi semua");
        }else{
        String Tampilan="yyyy-MM-dd";
        SimpleDateFormat fm=new SimpleDateFormat(Tampilan);
        String tanggal = String.valueOf(fm.format(cbtgl.getDate()));

        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO pembayaran VALUES(?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, idPetugas.getText());
            ps.setString(3, cbnisn.getSelectedItem().toString());
            ps.setString(4, tanggal);
            ps.setString(5, bulan.getSelectedItem().toString());
            ps.setString(6, tarif.getText());
            ps.setString(7, cbbyr.getText());
           
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data telah tersimpan");
            refreshTable();
        }catch (Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n "+e+"\n\n");
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        menu m=new menu();
        m.show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblpemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpemMouseClicked
        // TODO add your handling code here:
        int i = tblpem.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String pembayaran = (String) tm.getValueAt(i, 0);
        idpembayaran=pembayaran;
        
        String petugas = (String) tm.getValueAt(i, 1);
        idPetugas.setText(petugas);
        
        String nisn = (String) tm.getValueAt(i, 2);
        cbnisn.setSelectedItem(nisn);
        
        String siswa = (String) tm.getValueAt(i, 3);
        nmsiswa.setText(siswa);
        
        String nominal = (String) tm.getValueAt(i, 5);
        tarif.setText(nominal);
        
        String jumlah = (String) tm.getValueAt(i, 6);
        cbbyr.setText(jumlah);
    }//GEN-LAST:event_tblpemMouseClicked

    private void cbnmpetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnmpetugasActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM petugas where nama_petugas='"+ cbnmpetugas.getSelectedItem().toString() +"'");
            ResultSet r = ps.executeQuery();
            
            while (r. next()) {
            idPetugas.setText(r.getString("id_petugas"));
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_cbnmpetugasActionPerformed

    private void cbnisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnisnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            PreparedStatement s = con.prepareStatement("SELECT * FROM siswa,spp where nisn='" + cbnisn.getSelectedItem().toString() + "'and siswa.id_spp=spp.id_spp");
            ResultSet r = s.executeQuery();
            while (r. next()) {
            nmsiswa.setText(r.getString("nama"));
            tarif.setText(r.getString("nominal"));
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_cbnisnActionPerformed

    private void cbcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcariActionPerformed
        // TODO add your handling code here:
        tm = new DefaultTableModel(null,
                new Object[] {"No.", "Nama Petugas", "NISN", "Nama Siswa", "Tanggal bayar", "Bulan", "Tarif SPP", "Jumlah Bayar"});
                tblpem.setModel(tm);
                tblpem.removeColumn(tblpem.getColumnModel().getColumn(0));
                tm.getDataVector().removeAllElements();
                try {
                    PreparedStatement ps = con.prepareStatement("SELECT pembayaran.id_pembayaran, petugas.nama_petugas, pembayaran.nisn,"
            + " siswa.nama, pembayaran.tgl_bayar, pembayaran.bulan, spp.nominal, pembayaran.jumlah_bayar FROM pembayaran INNER JOIN siswa USING(nisn) INNER JOIN spp on siswa.id_spp=spp.id_spp INNER JOIN petugas on "
            + "pembayaran.id_petugas = petugas.id_petugas where nisn LIKE '%"+txtcari.getText().toString() +"%'");
                    ResultSet r = ps.executeQuery();
                    JOptionPane.showMessageDialog(this,"Data telah ditemukan");
                    while(r.next()){
                    Object[] data ={
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7),
                    r.getString(8)
                    
                   
                    };
                    tm.addRow(data);
                    }
                           }catch (Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n "+e+"\n\n");
        }
    }//GEN-LAST:event_cbcariActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (idPetugas.getText().equals("") || cbnisn.getSelectedItem().equals("") || tarif.getText().equals("") || cbbyr.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Data harus terisi semua");
        }else{
        String tampilTanggal = "yyyy-MM-dd";
        SimpleDateFormat df = new SimpleDateFormat(tampilTanggal);
        String tgl = String.valueOf(df.format(cbtgl.getDate()));        
        
        
        try{
            PreparedStatement ps = con.prepareStatement("UPDATE pembayaran SET id_petugas=?, nisn=?, tgl_bayar=?, bulan=?, "
                    + "id_spp=?, jumlah_bayar=? WHERE id_pembayaran=?");
            ps.setString(1, idPetugas.getText());
            ps.setString(2, cbnisn.getSelectedItem().toString());
            ps.setString(3, tgl);
            ps.setString(4, bulan.getSelectedItem().toString());
            ps.setString(5, tarif.getText());
            ps.setString(6, cbbyr.getText());
            ps.setString(7, idpembayaran);
           
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data telah tersimpan");
            refreshTable();
        }catch (Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n "+e+"\n\n");
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbnmpetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbnmpetugasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnmpetugasKeyPressed

    private void cbnisnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbnisnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnisnKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"Anda Yakin Ingin Menghapus Data Ini='"+
                nmsiswa.getText()+"'",".:: Konfirmasi ::.", JOptionPane.YES_NO_OPTION);
        if (ok==0){
        try{
            PreparedStatement ps = con.prepareStatement("DELETE FROM pembayaran WHERE id_pembayaran=?");
            ps.setString(1, idpembayaran);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data telah dihapus");
            refreshTable();
        }catch (Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n "+e+"\n\n");
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(form_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JTextField cbbyr;
    private javax.swing.JButton cbcari;
    private javax.swing.JComboBox<String> cbnisn;
    private javax.swing.JComboBox<String> cbnmpetugas;
    private com.toedter.calendar.JDateChooser cbtgl;
    private javax.swing.JTextField idPetugas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nmsiswa;
    private javax.swing.JTextField tarif;
    private javax.swing.JTable tblpem;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables

    
}
