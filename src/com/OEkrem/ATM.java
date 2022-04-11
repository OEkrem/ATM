package com.OEkrem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author OEkrem
 * All rights reserved.
 */

public class ATM extends javax.swing.JFrame {

    static DataBaseMySQL database = new DataBaseMySQL();
    boolean baglantiDurumu = false;
    private static Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    public static final double x = dimension.getWidth();
    public static final double y = dimension.getHeight();

    private User user;

    public ATM() {
        initComponents();
        this.setResizable(false);
        baglantiDurumu = database.connect();
        
        int x = (int) (this.x-this.getWidth())/2;
        int y = (int) (this.y-this.getHeight())/2;
        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_UserName = new javax.swing.JLabel();
        jLabel_Psw = new javax.swing.JLabel();
        jButton_Entry = new javax.swing.JButton();
        jButton_Register = new javax.swing.JButton();
        jPasswordField_psw = new javax.swing.JPasswordField();
        jTextField_UserName = new javax.swing.JTextField();
        label_information = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In Panel");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(475, 225));

        jLabel_UserName.setText("User Name :");

        jLabel_Psw.setText("Password :");

        jButton_Entry.setText("Entry");
        jButton_Entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_EntryMouseClicked(evt);
            }
        });

        jButton_Register.setText("Register");
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseClicked(evt);
            }
        });

        jPasswordField_psw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_psw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_pswActionPerformed(evt);
            }
        });

        jTextField_UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Psw, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_psw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton_Entry, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_information)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Register)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_information))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Psw, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_psw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton_Entry, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Register)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void entry(){

        if(!jTextField_UserName.getText().equals("") && !jPasswordField_psw.getText().equals("")){
            user = database.getUser(jTextField_UserName.getText());
            if(user!=null && user.getUserName().equals(jTextField_UserName.getText()) && user.getPsw().equals(jPasswordField_psw.getText())){
                if(user.getYetki().equals("Limited")){
                    LimitedAuthority tmp = new LimitedAuthority(user);
                    tmp.setVisible(true);
                    this.setVisible(false);
                    return;
                }
                else if(user.getYetki().equals("Unlimited")){
                    UnlimitedAuthority tmp = new UnlimitedAuthority(user);
                    tmp.setVisible(true);
                    this.setVisible(false);
                    return;
                }
            }
        }

        JOptionPane.showMessageDialog(this,"Wrong information entered.! \nPlease try again.", "Information Panel",0);
        label_information.setText("Login failed..");
        jPasswordField_psw.setText("");
        jTextField_UserName.setText("");
    }

    private void jButton_EntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        entry();
    }//GEN-LAST:event_jButton_EntryMouseClicked

    private void jPasswordField_pswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_pswActionPerformed
        entry();
    }//GEN-LAST:event_jPasswordField_pswActionPerformed

    private void jButton_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(!jTextField_UserName.getText().isEmpty() && !jPasswordField_psw.getText().isEmpty()){
            if(!baglantiDurumu)
                return;
            if(database.getUser(jTextField_UserName.getText()) != null){
                label_information.setText("Such a username is already in use.");
                JOptionPane.showMessageDialog(this, "Such a username is already in use..!","Information Panel",0);
                jTextField_UserName.setText("");
                return;
            }
            else{
                database.addUser(new User(jTextField_UserName.getText(), jPasswordField_psw.getText()));
                JOptionPane.showMessageDialog(this, "Registration Successful..","Information Panel",1);
                jLabel_UserName.setText("User Name :"); jLabel_UserName.setForeground(Color.black);
                jLabel_Psw.setText("Password :"); jLabel_Psw.setForeground(Color.black);
                label_information.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter the information completely.","Information Panel",0);
            jLabel_UserName.setText("User Name (*):"); jLabel_UserName.setForeground(Color.red);
            jLabel_Psw.setText("Password (*):"); jLabel_Psw.setForeground(Color.red);
            label_information.setText("Please enter the information completely...!");
        }
    }//GEN-LAST:event_jButtonRegisterMouseClicked

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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Entry;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel_Psw;
    private javax.swing.JLabel jLabel_UserName;
    private javax.swing.JPasswordField jPasswordField_psw;
    private javax.swing.JTextField jTextField_UserName;
    private javax.swing.JLabel label_information;
    // End of variables declaration//GEN-END:variables
}
