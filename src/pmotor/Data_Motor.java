package pmotor;
import Controler.dbmotor;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Data_Motor extends javax.swing.JFrame {
    dbmotor a = new dbmotor();

    public Data_Motor() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public void loadtabel(){
        try {
            tabelmotor.setModel(DbUtils.resultSetToTableModel(a.UpdateJTable()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void deklarasi(){
    a.idmotor = Textidmotor.getText();
    a.merek = Textmerek.getText();
    a.tipe = Texttipe.getText();
    a.warna = Textwarna.getText();
    a.kapasitas = Textkapasitas.getText();
    a.harga = Textharga.getText();
    a.tersedia = Combotersedia.getSelectedItem().toString();
    }
    public void clear(){
      Textidmotor.setText("");
      Textmerek.setText("");
      Texttipe.setText("");
      Textwarna.setText("");
      Textkapasitas.setText("");
      Textharga.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LabelTersedia = new javax.swing.JLabel();
        Labelmerek = new javax.swing.JLabel();
        Labeltipe = new javax.swing.JLabel();
        Labelwarna = new javax.swing.JLabel();
        Labelkapasitas = new javax.swing.JLabel();
        Textidmotor = new javax.swing.JTextField();
        Textmerek = new javax.swing.JTextField();
        Texttipe = new javax.swing.JTextField();
        Textwarna = new javax.swing.JTextField();
        Textharga = new javax.swing.JTextField();
        Labeldatamotor = new javax.swing.JLabel();
        Labelidmotor = new javax.swing.JLabel();
        Textkapasitas = new javax.swing.JTextField();
        Btnmasukandata = new javax.swing.JButton();
        Labelharga = new javax.swing.JLabel();
        Combotersedia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelmotor = new javax.swing.JTable();
        BtnHapus = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        Btnedit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/motorbike.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/man.png"))); // NOI18N
        jButton2.setText("Data Motor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/transaction.png"))); // NOI18N
        jButton3.setText("Transaksi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/log-out.png"))); // NOI18N
        jButton4.setText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 950, 100));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTersedia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelTersedia.setText("Kertersediaan");
        jPanel3.add(LabelTersedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        Labelmerek.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Labelmerek.setText("Merek ");
        jPanel3.add(Labelmerek, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        Labeltipe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Labeltipe.setText("Tipe");
        jPanel3.add(Labeltipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        Labelwarna.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Labelwarna.setText("Warna");
        jPanel3.add(Labelwarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        Labelkapasitas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Labelkapasitas.setText("Kapasitas");
        jPanel3.add(Labelkapasitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        Textidmotor.setMinimumSize(new java.awt.Dimension(200, 29));
        Textidmotor.setPreferredSize(new java.awt.Dimension(200, 29));
        jPanel3.add(Textidmotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        Textmerek.setMinimumSize(new java.awt.Dimension(200, 29));
        Textmerek.setPreferredSize(new java.awt.Dimension(200, 29));
        jPanel3.add(Textmerek, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 200, -1));

        Texttipe.setMinimumSize(new java.awt.Dimension(200, 29));
        Texttipe.setPreferredSize(new java.awt.Dimension(200, 29));
        jPanel3.add(Texttipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        Textwarna.setMinimumSize(new java.awt.Dimension(200, 29));
        Textwarna.setPreferredSize(new java.awt.Dimension(200, 29));
        jPanel3.add(Textwarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        Textharga.setMinimumSize(new java.awt.Dimension(200, 29));
        Textharga.setPreferredSize(new java.awt.Dimension(200, 29));
        jPanel3.add(Textharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        Labeldatamotor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Labeldatamotor.setText("Data Motor");
        jPanel3.add(Labeldatamotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Labelidmotor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Labelidmotor.setText("ID Motor ");
        jPanel3.add(Labelidmotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        Textkapasitas.setMinimumSize(new java.awt.Dimension(200, 29));
        Textkapasitas.setPreferredSize(new java.awt.Dimension(200, 29));
        jPanel3.add(Textkapasitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        Btnmasukandata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/tick.png"))); // NOI18N
        Btnmasukandata.setText("Masukan Data");
        Btnmasukandata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnmasukandataActionPerformed(evt);
            }
        });
        jPanel3.add(Btnmasukandata, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 170, 40));

        Labelharga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Labelharga.setText("Harga");
        jPanel3.add(Labelharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        Combotersedia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Terjual" }));
        jPanel3.add(Combotersedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 200, 30));

        tabelmotor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Motor", "Merek", "Tipe", "Warna", "Kapasitas", "Harga", "Ketersediaan"
            }
        ));
        tabelmotor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelmotorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelmotor);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 930, 130));

        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/delete.png"))); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        jPanel3.add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, -1, -1));

        BtnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/cleaning.png"))); // NOI18N
        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });
        jPanel3.add(BtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        Btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/updated.png"))); // NOI18N
        Btnedit.setText("Edit");
        Btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtneditActionPerformed(evt);
            }
        });
        jPanel3.add(Btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusLost

    private void BtnmasukandataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnmasukandataActionPerformed
       String ObjBtn[]={"ya","tidak"};
       int PromptResult = JOptionPane.showOptionDialog(null,"simpan data?","Message",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, ObjBtn, ObjBtn[1]);
        if (PromptResult==0) {
            deklarasi();
        try {
        a.simpan();
        clear();
        JOptionPane.showMessageDialog(null, "data telah tersimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }loadtabel();
    }//GEN-LAST:event_BtnmasukandataActionPerformed
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new Transaksi().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.setVisible(false);
       new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       loadtabel();
    }//GEN-LAST:event_formWindowOpened

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
       String ObjBtn[]={"ya","tidak"};
       int PromptResult = JOptionPane.showOptionDialog(null,"hapus data?","Message",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, ObjBtn, ObjBtn[1]);
        if (PromptResult==0) {
            deklarasi();
            try {
                a.hapus();
                JOptionPane.showMessageDialog(null, "berhasil terhapus");
                loadtabel();
                clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void tabelmotorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelmotorMouseClicked
        int row = tabelmotor.getSelectedRow();
        Textidmotor.setText(tabelmotor.getModel().getValueAt(row, 0).toString());
        Textmerek.setText(tabelmotor.getModel().getValueAt(row, 1).toString());
        Texttipe.setText(tabelmotor.getModel().getValueAt(row, 2).toString());
        Textwarna.setText(tabelmotor.getModel().getValueAt(row, 3).toString());
        Textkapasitas.setText(tabelmotor.getModel().getValueAt(row, 4).toString());
        Textharga.setText(tabelmotor.getModel().getValueAt(row, 5).toString());
        Combotersedia.setSelectedItem(tabelmotor.getModel().getValueAt(row, 6).toString());
    }//GEN-LAST:event_tabelmotorMouseClicked

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        clear();
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtneditActionPerformed
        deklarasi();
        try {
            a.edit();
            JOptionPane.showMessageDialog(null, "berhasil diubah");
            loadtabel();
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_BtneditActionPerformed

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
            java.util.logging.Logger.getLogger(Data_Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Motor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton Btnedit;
    private javax.swing.JButton Btnmasukandata;
    private javax.swing.JComboBox<String> Combotersedia;
    private javax.swing.JLabel LabelTersedia;
    private javax.swing.JLabel Labeldatamotor;
    private javax.swing.JLabel Labelharga;
    private javax.swing.JLabel Labelidmotor;
    private javax.swing.JLabel Labelkapasitas;
    private javax.swing.JLabel Labelmerek;
    private javax.swing.JLabel Labeltipe;
    private javax.swing.JLabel Labelwarna;
    private javax.swing.JTextField Textharga;
    private javax.swing.JTextField Textidmotor;
    private javax.swing.JTextField Textkapasitas;
    private javax.swing.JTextField Textmerek;
    private javax.swing.JTextField Texttipe;
    private javax.swing.JTextField Textwarna;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelmotor;
    // End of variables declaration//GEN-END:variables
}
