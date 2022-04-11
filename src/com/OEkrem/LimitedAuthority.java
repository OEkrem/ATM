package com.OEkrem;

import javax.swing.JOptionPane;

/**
 *
 * @author OEkrem
 * All rights reserved.
 */

public class LimitedAuthority extends javax.swing.JFrame {
    
    private final User user;
    DataBaseMySQL database = ATM.database;
    
    public LimitedAuthority(User user) {
        
        initComponents();
        this.user = user;
        
        LabelID.setText(String.valueOf(user.getId()));
        Label_Uname.setText(user.getUserName());
        Label_psw.setText(user.getPsw());
        Label_authority.setText(user.getYetki());
        Label_money.setText(String.valueOf(user.getSum()));
        
        int x = (int) (ATM.x-this.getWidth())/2;
        int y = (int) (ATM.y-this.getHeight())/2;
        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_ChangeUName = new javax.swing.JButton();
        buton_ChangePsw = new javax.swing.JButton();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_psw = new javax.swing.JTextField();
        buton_DepositMoney = new javax.swing.JButton();
        buton_WithdrawMoney = new javax.swing.JButton();
        buton_MoneyTransfer = new javax.swing.JButton();
        jTextField_amountOfMoney = new javax.swing.JTextField();
        buton_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Label_Uname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Label_psw = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Label_authority = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_moneyTransferUName = new javax.swing.JTextField();
        button_DeleteAccount = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Label_money = new javax.swing.JLabel();
        label_changeName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Limited Process Panel");
        setLocation(new java.awt.Point(380, 200));

        button_ChangeUName.setText("Change My User Name");
        button_ChangeUName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ChangeUNameActionPerformed(evt);
            }
        });

        buton_ChangePsw.setText("Change My Password");
        buton_ChangePsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_ChangePswActionPerformed(evt);
            }
        });

        jTextField_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Username.setText("New Username");

        jTextField_psw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_psw.setText("New Password");

        buton_DepositMoney.setText("Deposit Money");
        buton_DepositMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_DepositMoneyActionPerformed(evt);
            }
        });

        buton_WithdrawMoney.setText("Withdraw Money");
        buton_WithdrawMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_WithdrawMoneyActionPerformed(evt);
            }
        });

        buton_MoneyTransfer.setText("Money Transfer");
        buton_MoneyTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_MoneyTransferActionPerformed(evt);
            }
        });

        jTextField_amountOfMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_amountOfMoney.setText("Amount of Money");

        buton_Exit.setText("Exit");
        buton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_ExitActionPerformed(evt);
            }
        });

        jLabel1.setText("ID : ");

        LabelID.setText("-");

        jLabel3.setText("Username :");

        Label_Uname.setText("--------------");

        jLabel5.setText("Psw :");

        Label_psw.setText("--------------");

        jLabel7.setText("Authority :");

        Label_authority.setText("--------------");

        jLabel2.setText("Information Letter...");

        jTextField_moneyTransferUName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_moneyTransferUName.setText("Username");

        button_DeleteAccount.setText("Delete My Account");
        button_DeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeleteAccountActionPerformed(evt);
            }
        });

        jLabel4.setText("Amount : ");

        Label_money.setText("-----");

        label_changeName.setForeground(new java.awt.Color(255, 0, 51));
        label_changeName.setText("*");
        label_changeName.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_DeleteAccount)
                                .addGap(18, 18, 18)
                                .addComponent(buton_Exit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelID)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Label_Uname)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Label_psw)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Label_money)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Label_authority)
                                .addGap(0, 22, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_ChangeUName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buton_ChangePsw, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_psw, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buton_MoneyTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buton_DepositMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buton_WithdrawMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(label_changeName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_amountOfMoney)
                            .addComponent(jTextField_moneyTransferUName))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LabelID)
                    .addComponent(jLabel3)
                    .addComponent(Label_Uname)
                    .addComponent(jLabel5)
                    .addComponent(Label_psw)
                    .addComponent(jLabel4)
                    .addComponent(Label_money)
                    .addComponent(jLabel7)
                    .addComponent(Label_authority))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_ChangeUName)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(buton_DepositMoney)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buton_WithdrawMoney)
                            .addComponent(jTextField_amountOfMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buton_MoneyTransfer)
                            .addComponent(jTextField_moneyTransferUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_ChangePsw)
                            .addComponent(jTextField_psw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_changeName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buton_Exit)
                            .addComponent(button_DeleteAccount))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_cikisActionPerformed
        String[] options = {"Yes", "No"};
        int x = JOptionPane.showOptionDialog(null, "Do you want to log out?",
            "Are you sure ?",
        JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, options, options[0]);
        System.out.println(x);// evetse 0 hayırsa 1 dönüyor kanka
        if(x == 0){
            setVisible(false);
            ATM atm = new ATM(); atm.setVisible(true);
        }
    }//GEN-LAST:event_buton_ExitActionPerformed

    private void button_DeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_HesapSilActionPerformed
        String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, "Are you sure you want to delete your account?",
                "Are you sure ?",
            JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, options, options[0]);

        if(x == 0){
            database.removeUser(user);
            JOptionPane.showMessageDialog(this, "Please login again."
                    + "\nYou are directed to the login page.", "Information Panel", 0);
            setVisible(false);
            ATM atm = new ATM(); atm.setVisible(true);
        }
    }//GEN-LAST:event_button_DeleteAccountActionPerformed

    private void button_ChangeUNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_adDegistirActionPerformed
        if(database.getUser(jTextField_Username.getText()) != null){
            JOptionPane.showMessageDialog(this, "Such a username already exists..", "Information Panel", 0);
            jTextField_Username.setText("");
        }
        else{
            if(!jTextField_Username.getText().isEmpty()){
                String[] options = {"Yes", "No"};
                int x = JOptionPane.showOptionDialog(null, "Are you sure about your new username? \nNew User Name : "
                                + jTextField_Username.getText(),"Are you sure ?", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.OK_CANCEL_OPTION, null, options, options[0]);

                if(x == 0){
                    database.changeUserName(user,  jTextField_Username.getText());
                    user.setUserName(jTextField_Username.getText());
                    Label_Uname.setText(user.getUserName());
                    jTextField_Username.setText("");
                }
            }
        }
    }//GEN-LAST:event_button_ChaneUNameActionPerformed

    private void buton_ChangePswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_sifreDegistirActionPerformed
        if(!jTextField_psw.getText().equals("")){
            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, "Are you sure about your new password?? \nNew Password : " +
                            jTextField_psw.getText(),"Are you sure ?",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, options, options[0]);

            if(x == 0){
                database.changePsw(user, jTextField_psw.getText());
                user.setPsw(jTextField_psw.getText());
                Label_psw.setText(jTextField_psw.getText());
                jTextField_psw.setText("");
            }
        }
    }//GEN-LAST:event_buton_ChangePswActionPerformed

    private void buton_DepositMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_paraYatirActionPerformed
        database.depositMoney(user,Integer.parseInt(jTextField_amountOfMoney.getText()));
        user.paraYatir(Integer.parseInt(jTextField_amountOfMoney.getText()));
        Label_money.setText(String.valueOf(user.getSum()));
        jTextField_amountOfMoney.setText("");
    }//GEN-LAST:event_buton_DepositMoneyActionPerformed

    private void buton_WithdrawMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_paraCekActionPerformed
        if(database.withdrawMoney(user, Integer.parseInt(jTextField_amountOfMoney.getText()))){
                user.paraCek(Integer.parseInt(jTextField_amountOfMoney.getText()));
            Label_money.setText(String.valueOf(user.getSum()));
            jTextField_amountOfMoney.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "You do not have enough balance.", "Missing Amount", 1);
        }
    }//GEN-LAST:event_buton_WithdrawMoneyActionPerformed

    private void buton_MoneyTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_paraTransferiActionPerformed
        /* PARA TRANSFERİ */
        if(user.getSum() >= Integer.parseInt(jTextField_amountOfMoney.getText())){
            if(jTextField_moneyTransferUName.getText().equals("User Name") || jTextField_moneyTransferUName.getText().equals("")){
                label_changeName.enable(true);
                JOptionPane.showMessageDialog(this, "Please enter the username of the person who will make the deposit..",
                        "Missing Information", 0);
            }else{
                if(database.getUser(jTextField_moneyTransferUName.getText()) != null){
                    String[] options = {"Yes", "No"};
                    int x = JOptionPane.showOptionDialog(null, "Are you sure you want to deposit " + jTextField_amountOfMoney.getText() +
                            " TL to" + jTextField_moneyTransferUName.getText() + ".","Are you sure ?", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.OK_CANCEL_OPTION, null, options, options[0]);
                    if(x == 0){
                        database.moneyTransfer(user, database.getUser(jTextField_moneyTransferUName.getText()),
                                Integer.parseInt(jTextField_amountOfMoney.getText()));
                        user.paraCek(Integer.parseInt(jTextField_amountOfMoney.getText()));
                        Label_money.setText(String.valueOf(user.getSum()));
                        jTextField_amountOfMoney.setText("");
                        jTextField_moneyTransferUName.setText("");
                    }
                    return;
                }
                else
                    JOptionPane.showMessageDialog(this, "No such username was found...", "Information Panel", 0);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "You do not have enough balance..!", "Attention.!", 1);
    }//GEN-LAST:event_buton_MoneyTransferActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel Label_Uname;
    private javax.swing.JLabel Label_authority;
    private javax.swing.JLabel Label_money;
    private javax.swing.JLabel Label_psw;
    private javax.swing.JButton buton_ChangePsw;
    private javax.swing.JButton buton_DepositMoney;
    private javax.swing.JButton buton_Exit;
    private javax.swing.JButton buton_MoneyTransfer;
    private javax.swing.JButton buton_WithdrawMoney;
    private javax.swing.JButton button_ChangeUName;
    private javax.swing.JButton button_DeleteAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JTextField jTextField_amountOfMoney;
    private javax.swing.JTextField jTextField_moneyTransferUName;
    private javax.swing.JTextField jTextField_psw;
    private javax.swing.JLabel label_changeName;
    // End of variables declaration//GEN-END:variables
}
