/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormEdit;

import KostManagement.Model.PelangganModel;

/**
 *
 * @author Afifp29
 */
public class Edit_pelanggan extends javax.swing.JFrame {
//        extends javax.swing.JFrame {

    /**
     * Creates new form Edit_pelanggan
     */
    public Edit_pelanggan() {
        initComponents();
        tampilField();
    }
    
    public void tampilField() {
        PelangganModel pelanggan = new PelangganModel();
        edit_kdpelanggan.setText(pelanggan.getFieldKode());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        sidePane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edit_kdpelanggan = new javax.swing.JTextField();
        edit_namalengkap = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JLabel();
        edit_pekerjaan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edit_Alamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        inp_lamasewa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inp_kamar = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(0, 150, 136));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Pelanggan");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));
        jPanel9.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, 10));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Edit Data");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        sidePane.setBackground(new java.awt.Color(36, 47, 65));
        sidePane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sidePaneMouseDragged(evt);
            }
        });
        sidePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidePaneMousePressed(evt);
            }
        });
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kode Pelanggan  :");
        sidePane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Lengkap :");
        sidePane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat Asal :");
        sidePane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal Sewa :");
        sidePane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        sidePane.add(edit_kdpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, -1));
        sidePane.add(edit_namalengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 240, -1));

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataGambar/icons8_Save_30px.png"))); // NOI18N
        btn_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidePane.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        edit_pekerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_pekerjaanActionPerformed(evt);
            }
        });
        sidePane.add(edit_pekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataGambar/icons8_Cancel_40px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        sidePane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 50, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pekerjaan :");
        sidePane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        edit_Alamat.setColumns(20);
        edit_Alamat.setRows(5);
        jScrollPane1.setViewportView(edit_Alamat);

        sidePane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 80));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lama Sewa :");
        sidePane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        inp_lamasewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_lamasewaActionPerformed(evt);
            }
        });
        sidePane.add(inp_lamasewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 40, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(kode kamar)");
        sidePane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pilih Kamar : ");
        sidePane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("bulan");
        sidePane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        inp_kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sidePane.add(inp_kamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 90, -1));
        sidePane.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidePane, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidePane, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int xx;
int xy;
    private void edit_pekerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_pekerjaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_pekerjaanActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void sidePaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidePaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_sidePaneMouseDragged

    private void sidePaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidePaneMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_sidePaneMousePressed

    private void inp_lamasewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_lamasewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_lamasewaActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_simpan;
    private javax.swing.JTextArea edit_Alamat;
    private javax.swing.JTextField edit_kdpelanggan;
    private javax.swing.JTextField edit_namalengkap;
    private javax.swing.JTextField edit_pekerjaan;
    private javax.swing.JComboBox<String> inp_kamar;
    private javax.swing.JTextField inp_lamasewa;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel sidePane;
    // End of variables declaration//GEN-END:variables
}