/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakgui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author fly4u
 */
public class lamanutama extends javax.swing.JFrame {
private lamanutama b;
    /**
     * Creates new form percobaan1b
     */
    public lamanutama() {
        initComponents();
        
    }
    

   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNamaProgram = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_tempat_gambar = new javax.swing.JEditorPane();
        jPilihan = new javax.swing.JLabel();
        Pilihan1 = new javax.swing.JRadioButton();
        Pilihan2 = new javax.swing.JRadioButton();
        Pilihan3 = new javax.swing.JRadioButton();
        Pilihan4 = new javax.swing.JRadioButton();
        Pilihan5 = new javax.swing.JRadioButton();
        Pilihan6 = new javax.swing.JRadioButton();
        Pilihan7 = new javax.swing.JRadioButton();
        Pilihan8 = new javax.swing.JRadioButton();
        Pilihan9 = new javax.swing.JRadioButton();
        Pilihan10 = new javax.swing.JRadioButton();
        Pilihan12 = new javax.swing.JRadioButton();
        Pilihan11 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        label_gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jNamaProgram.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jNamaProgram.setForeground(new java.awt.Color(255, 51, 51));
        jNamaProgram.setText("APRILIA MECCA MOSLEM DRESS STORE");

        panel_tempat_gambar.setEditable(false);
        panel_tempat_gambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        panel_tempat_gambar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(panel_tempat_gambar);

        jPilihan.setText("Pilihan Busana Muslim :");

        Pilihan1.setText("Blue Saphire");
        Pilihan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan1ActionPerformed(evt);
            }
        });

        Pilihan2.setText("Blue Cool");
        Pilihan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan2ActionPerformed(evt);
            }
        });

        Pilihan3.setText("Brown Choco");
        Pilihan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan3ActionPerformed(evt);
            }
        });

        Pilihan4.setText("Choco Black");
        Pilihan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan4ActionPerformed(evt);
            }
        });

        Pilihan5.setText("Choco Yellow");
        Pilihan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan5ActionPerformed(evt);
            }
        });

        Pilihan6.setText("Choco Milk");
        Pilihan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan6ActionPerformed(evt);
            }
        });

        Pilihan7.setText("Dusty White");
        Pilihan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan7ActionPerformed(evt);
            }
        });

        Pilihan8.setText("Elegant Blue");
        Pilihan8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan8ActionPerformed(evt);
            }
        });

        Pilihan9.setText("Global Retro");
        Pilihan9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan9ActionPerformed(evt);
            }
        });

        Pilihan10.setText("Pink Fanta");
        Pilihan10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan10ActionPerformed(evt);
            }
        });

        Pilihan12.setText("Blue Moon");
        Pilihan12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan12ActionPerformed(evt);
            }
        });

        Pilihan11.setText("Silver Saleem");
        Pilihan11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilihan11ActionPerformed(evt);
            }
        });

        jLabel1.setText("Harga Satuan");

        jLabel2.setText("Nama Busana");

        jLabel3.setText("Jumlah Pembelian");

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel4.setText("Diskon");

        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Bayar");

        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        label_gambar.setText("Display Busana");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Pilihan1)
                                            .addComponent(jPilihan)
                                            .addComponent(Pilihan3)
                                            .addComponent(Pilihan5)
                                            .addComponent(Pilihan7)
                                            .addComponent(Pilihan9)
                                            .addComponent(Pilihan11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Pilihan10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Pilihan8, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                            .addComponent(Pilihan2)
                                            .addComponent(Pilihan4)
                                            .addComponent(Pilihan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Pilihan12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnExit)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGap(44, 44, 44)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                                .addComponent(btnHitung)
                                                .addComponent(txtSatuan)
                                                .addComponent(txtNama)
                                                .addComponent(txtJumlah)
                                                .addComponent(txtDiskon))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBayar)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnCancel)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNamaProgram)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_gambar)
                        .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_gambar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jNamaProgram))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPilihan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pilihan1)
                            .addComponent(Pilihan2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pilihan3)
                            .addComponent(Pilihan4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pilihan5)
                            .addComponent(Pilihan6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pilihan7)
                            .addComponent(Pilihan8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pilihan9)
                            .addComponent(Pilihan10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pilihan12)
                            .addComponent(Pilihan11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnHitung)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBayar)
                            .addComponent(btnCancel)
                            .addComponent(btnExit)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pilihan8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan8ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("230000");
        txtNama.setText("Elegant Blue");
        JLabel label_gambar7=new JLabel(new ImageIcon("src/gambar/gambar8.jpg"));
        label_gambar7.setBounds(1,1,1,1);
        label_gambar7.setSize(400,500);
        panel_tempat_gambar.add(label_gambar7);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan8ActionPerformed

    private void Pilihan10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan10ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("240000");
        txtNama.setText("Pink Fanta");
        JLabel label_gambar9=new JLabel(new ImageIcon("src/gambar/gambar10.jpg"));
        label_gambar9.setBounds(1,1,1,1);
        label_gambar9.setSize(400,500);
        panel_tempat_gambar.add(label_gambar9);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan10ActionPerformed

    private void Pilihan11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan11ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("340000");
        txtNama.setText("Silver Saleem");
        JLabel label_gambar10=new JLabel(new ImageIcon("src/gambar/gambar11.jpg"));
        label_gambar10.setBounds(1,1,1,1);
        label_gambar10.setSize(400,500);
        panel_tempat_gambar.add(label_gambar10);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan11ActionPerformed

    private void Pilihan12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan12ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("300000");
        txtNama.setText("Blue Moon");
        JLabel label_gambar11=new JLabel(new ImageIcon("src/gambar/gambar12.jpg"));
        label_gambar11.setBounds(1,1,1,1);
        label_gambar11.setSize(400,500);
        panel_tempat_gambar.add(label_gambar11);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan12ActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void Pilihan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan1ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("250000");
        txtNama.setText("Blue Saphire");
        JLabel label_gambar=new JLabel(new ImageIcon("src/gambar/gambar1.jpg"));
        label_gambar.setBounds(1,1,1,1);
        label_gambar.setSize(400,500);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
        
    }//GEN-LAST:event_Pilihan1ActionPerformed

    private void Pilihan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan3ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("270000");
        txtNama.setText("Brown Choco");
        JLabel label_gambar3=new JLabel(new ImageIcon("src/gambar/gambar3.jpg"));
        label_gambar3.setBounds(1,1,1,1);
        label_gambar3.setSize(400,500);
        panel_tempat_gambar.add(label_gambar3);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan3ActionPerformed

    private void Pilihan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan5ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("225000");
        txtNama.setText("Choco Yellow");
        JLabel label_gambar4=new JLabel(new ImageIcon("src/gambar/gambar5.jpg"));
        label_gambar4.setBounds(1,1,1,1);
        label_gambar4.setSize(400,500);
        panel_tempat_gambar.add(label_gambar4);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan5ActionPerformed

    private void Pilihan7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan7ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("250000");
        txtNama.setText("Dusty White");
        JLabel label_gambar6=new JLabel(new ImageIcon("src/gambar/gambar7.jpg"));
        label_gambar6.setBounds(1,1,1,1);
        label_gambar6.setSize(400,500);
        panel_tempat_gambar.add(label_gambar6);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan7ActionPerformed

    private void Pilihan9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan9ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("260000");
        txtNama.setText("Global Retro");
        JLabel label_gambar8=new JLabel(new ImageIcon("src/gambar/gambar8.jpg"));
        label_gambar8.setBounds(1,1,1,1);
        label_gambar8.setSize(400,500);
        panel_tempat_gambar.add(label_gambar8);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan9ActionPerformed

    private void Pilihan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan2ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("200000");
        txtNama.setText("Blue Cool");
        JLabel label_gambar1=new JLabel(new ImageIcon("src/gambar/gambar2.jpg"));
        label_gambar1.setBounds(1,1,1,1);
        label_gambar1.setSize(400,800);
        panel_tempat_gambar.add(label_gambar1);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan2ActionPerformed

    private void Pilihan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan4ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("250000");
        txtNama.setText("Choco Black");
        JLabel label_gambar2=new JLabel(new ImageIcon("src/gambar/gambar4.jpg"));
        label_gambar2.setBounds(2,2,2,2);
        label_gambar2.setSize(400,500);
        panel_tempat_gambar.add(label_gambar2);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
    }//GEN-LAST:event_Pilihan4ActionPerformed

    private void Pilihan6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilihan6ActionPerformed
        // TODO add your handling code here:
        txtSatuan.setText("325000");
        txtNama.setText("Choco Milk");
        JLabel label_gambar5=new JLabel(new ImageIcon("src/gambar/gambar6.jpg"));
        label_gambar5.setBounds(1,1,1,1);
        label_gambar5.setSize(600,500);
        panel_tempat_gambar.add(label_gambar5);
        panel_tempat_gambar.revalidate();
        panel_tempat_gambar.repaint();
        
    }//GEN-LAST:event_Pilihan6ActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
    // TODO add your handling code here:
    double harga = Integer.parseInt(txtSatuan.getText());
    double jumlahBeli = Integer.parseInt(txtJumlah.getText());
    double Subtotal = harga*jumlahBeli;
    double diskon;
     
        if(jumlahBeli>=3){
        diskon = 0.2*Subtotal;
        }else{
        diskon = 0;
        }
    
        txtDiskon.setText(""+diskon);
    
    double totalBayar = Subtotal-diskon;
        txtBayar.setText(""+totalBayar);
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
    // TODO add your handling code here:
    
    new viapembayaran().setVisible(true);
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtJumlah.setText("");
        txtSatuan.setText("");
        txtBayar.setText("");
        txtDiskon.setText("");
        Pilihan1.setSelected(false);
        Pilihan2.setSelected(false);
        Pilihan3.setSelected(false);
        Pilihan4.setSelected(false);
        Pilihan5.setSelected(false);
        Pilihan6.setSelected(false);
        Pilihan7.setSelected(false);
        Pilihan8.setSelected(false);
        Pilihan9.setSelected(false);
        Pilihan10.setSelected(false);
        Pilihan11.setSelected(false);
        Pilihan12.setSelected(false);
        panel_tempat_gambar.removeAll();
        
               
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(lamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lamanutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Pilihan1;
    private javax.swing.JRadioButton Pilihan10;
    private javax.swing.JRadioButton Pilihan11;
    private javax.swing.JRadioButton Pilihan12;
    private javax.swing.JRadioButton Pilihan2;
    private javax.swing.JRadioButton Pilihan3;
    private javax.swing.JRadioButton Pilihan4;
    private javax.swing.JRadioButton Pilihan5;
    private javax.swing.JRadioButton Pilihan6;
    private javax.swing.JRadioButton Pilihan7;
    private javax.swing.JRadioButton Pilihan8;
    private javax.swing.JRadioButton Pilihan9;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jNamaProgram;
    private javax.swing.JLabel jPilihan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_gambar;
    private javax.swing.JEditorPane panel_tempat_gambar;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSatuan;
    // End of variables declaration//GEN-END:variables
}
