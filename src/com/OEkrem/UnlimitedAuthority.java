package com.OEkrem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author OEkrem
 * All rights reserved.
 */

public class UnlimitedAuthority extends javax.swing.JFrame {

    private static DefaultTableModel model = null;
    DataBaseMySQL database = ATM.database;
    private final User user;

    /**
     * Creates new form UnlimitedAuthority
     */
    public UnlimitedAuthority(User user) {
        initComponents();
        this.user = user;
        table_Delete();table_Uptade();

        int x = (int) (ATM.x-this.getWidth())/2;
        int y = (int) (ATM.y-this.getHeight())/2;
        this.setLocation(x, y);
    }

    public final void table_Uptade(){
        model = (DefaultTableModel) jTable_Users.getModel();
        for(User user: database.getUsers()){
            Object[] add = {user.getId(), user.getUserName(), user.getPsw(), user.getSum(), user.getYetki()};
            model.addRow(add);
        }
    }
    
    public final void table_Delete(){
        model = (DefaultTableModel) jTable_Users.getModel();
        int x = jTable_Users.getRowCount()-1;
        while(x >= 0){
            model.removeRow(x);
            x--;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users = new javax.swing.JTable();
        buton_addUser = new javax.swing.JButton();
        buton_deleteUser = new javax.swing.JButton();
        buton_depositMoney = new javax.swing.JButton();
        buton_withdrawMoney = new javax.swing.JButton();
        buton_moneyTransfer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_relatedUName = new javax.swing.JTextField();
        jPasswordField_relatedPsw = new javax.swing.JPasswordField();
        label_information = new javax.swing.JLabel();
        jTextField_AmountOfMoney = new javax.swing.JTextField();
        buton_exit = new javax.swing.JButton();
        jTextField_moneyTransfer_UName = new javax.swing.JTextField();
        buton_changeUName = new javax.swing.JButton();
        buton_changePsw = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_foundUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unlimited Process Panel");
        setLocation(new java.awt.Point(350, 150));

        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User Name", "Password", "Amount", "Authority"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Users);

        buton_addUser.setText("Add User");
        buton_addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_addUserActionPerformed(evt);
            }
        });

        buton_deleteUser.setText("Delete User");
        buton_deleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_deleteUserMouseClicked(evt);
            }
        });

        buton_depositMoney.setText("Deposit Money");
        buton_depositMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_depositMoneyActionPerformed(evt);
            }
        });

        buton_withdrawMoney.setText("Withdraw Money");
        buton_withdrawMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_withdrawMoneyActionPerformed(evt);
            }
        });

        buton_moneyTransfer.setText("Money transfer");
        buton_moneyTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_moneyTransferActionPerformed(evt);
            }
        });

        jLabel1.setText("Related UName:");

        jLabel2.setText("Related Psw :");

        jTextField_relatedUName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPasswordField_relatedPsw.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_information.setText("Information letter.");

        jTextField_AmountOfMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_AmountOfMoney.setText("Amount Money");

        buton_exit.setText("Exit");
        buton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_exitActionPerformed(evt);
            }
        });

        jTextField_moneyTransfer_UName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_moneyTransfer_UName.setText("User Name");

        buton_changeUName.setText("Change My UserName");
        buton_changeUName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_changeUNameActionPerformed(evt);
            }
        });

        buton_changePsw.setText("Change My Password");
        buton_changePsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_changePswActionPerformed(evt);
            }
        });

        jLabel3.setText("Found User:");

        jTextField_foundUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_foundUserKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buton_addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_depositMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buton_withdrawMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_AmountOfMoney))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buton_moneyTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_moneyTransfer_UName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_relatedPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_relatedUName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(buton_changeUName)
                        .addGap(18, 18, 18)
                        .addComponent(buton_changePsw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(buton_exit)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_foundUser, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_information)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_relatedUName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField_relatedPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(buton_addUser)
                .addGap(21, 21, 21)
                .addComponent(buton_deleteUser)
                .addGap(20, 20, 20)
                .addComponent(buton_depositMoney)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton_withdrawMoney)
                    .addComponent(jTextField_AmountOfMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton_moneyTransfer)
                    .addComponent(jTextField_moneyTransfer_UName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_information))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_foundUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton_exit)
                    .addComponent(buton_changeUName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_changePsw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* table burada güncellenecek */ /*Yada ekstra güncelleme butonu koyarsın table için*/
    private void buton_addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_addUserActionPerformed
        if(jTextField_relatedUName.getText().equals("") || jPasswordField_relatedPsw.getText().equals("")){
            JOptionPane.showMessageDialog(this, "You have entered incomplete information..", "Missing Information..", 0);
            jTextField_relatedUName.setBackground(Color.pink);
            jPasswordField_relatedPsw.setBackground(Color.pink);
            return;
        }
        jTextField_relatedUName.setBackground(Color.white);
        jPasswordField_relatedPsw.setBackground(Color.white);

        if(!database.userCheck(new User(jTextField_relatedUName.getText(), jPasswordField_relatedPsw.getText()))){
            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, "Creating new account, Are you sure?\n"
                            + "User Name : " + jTextField_relatedUName.getText() + "\nPassword : " + jPasswordField_relatedPsw.getText(),
                    "Are you sure?",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(x == 0){
                database.addUser(new User(jTextField_relatedUName.getText(), jPasswordField_relatedPsw.getText()));
                jPasswordField_relatedPsw.setText(""); jTextField_relatedUName.setText("");
            }
        }else {
            JOptionPane.showMessageDialog(this, "Such a username already exists..r\n  Let's try again.",
                    "Information Panel.", 0);
            return;
        }
        table_Delete();table_Uptade();
    }//GEN-LAST:event_buton_addUserActionPerformed

    private void buton_depositMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_depositMoneyActionPerformed
        /*Tablodan seçilerek para yatırma işlemi*/
        model = (DefaultTableModel) jTable_Users.getModel();
        int satir = jTable_Users.getSelectedRow();
        if(satir != -1 && jTable_Users.getRowCount() != 0){
            if(jTextField_AmountOfMoney.getText().equals("") || jTextField_AmountOfMoney.getText().equals("Amount Money") ){
                JOptionPane.showMessageDialog(this, "Please, enter how much money will be deposited..", "Information Panel", 0);
                jTextField_AmountOfMoney.setBackground(Color.pink);
                return;
            }
            jTextField_AmountOfMoney.setBackground(Color.white);
            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, "Mr. " + this.user.getUserName() + ", \n"
                            + jTextField_AmountOfMoney.getText() + " TL will be deposited to the account of the user named "
                            + model.getValueAt(satir, 1) + "\nAre you sure?","Information Panel",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(x == 0){
                if(database.getUser((String)model.getValueAt(satir, 1)) != null){
                    try{
                        if(database.depositMoney(database.getUser((String)model.getValueAt(satir, 1)),
                                Integer.parseInt(jTextField_AmountOfMoney.getText()))){
                            JOptionPane.showMessageDialog(this, "The deposit is successful..", "Information Panel", 0);
                            this.user.paraCek(Integer.parseInt(jTextField_AmountOfMoney.getText()));
                        }
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(this, "The amount of money information was entered incorrectly..", "Information Panel", 0);
                    }
                }
                jTextField_AmountOfMoney.setText("");jTextField_moneyTransfer_UName.setText("");
                jTextField_foundUser.setText("");
                table_Delete();table_Uptade();
                return;
            }
        }

        /*Kullanıcı bilgileri girilerek para yatırma işlemi*/
        if(jTextField_moneyTransfer_UName.getText().equals("") || jTextField_AmountOfMoney.getText().equals("") ||
                jTextField_AmountOfMoney.getText().equals("Amount Money")){
            JOptionPane.showMessageDialog(this, "Please, enter how much money will be invested..", "Information Panel", 0);
            jTextField_AmountOfMoney.setBackground(Color.pink);
            jTextField_moneyTransfer_UName.setBackground(Color.pink);
            return;
        }
        jTextField_AmountOfMoney.setBackground(Color.white);
        jTextField_moneyTransfer_UName.setBackground(Color.white);

        database.depositMoney(database.getUser(jTextField_moneyTransfer_UName.getText()), Integer.parseInt(jTextField_AmountOfMoney.getText()));
        jTextField_AmountOfMoney.setText("");
        jTextField_moneyTransfer_UName.setText("");
        table_Delete();table_Uptade();
    }//GEN-LAST:event_buton_depositMoneyActionPerformed

    private void buton_withdrawMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_withdrawMoneyActionPerformed
        /*Tablodan seçilerek para çekme işlemi*/
        model = (DefaultTableModel) jTable_Users.getModel();
        int satir = jTable_Users.getSelectedRow();
        if(satir != -1 && jTable_Users.getRowCount() != 0){
            if(jTextField_AmountOfMoney.getText().equals("") || jTextField_AmountOfMoney.getText().equals("Amount Money") ){
                JOptionPane.showMessageDialog(this, "Please, enter how much money will be withdrawn..", "Information Panel", 0);
                jTextField_AmountOfMoney.setBackground(Color.pink);
                return;
            }
            jTextField_AmountOfMoney.setBackground(Color.white);

            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, "Mr. " + this.user.getUserName() + ", \n"
                            + jTextField_AmountOfMoney.getText() + " TL will be withdrawn from the account of the user named "
                            + model.getValueAt(satir, 1) + "\nAre you sure?","Information Panel",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(x == 0){
                if(database.getUser((String)model.getValueAt(satir, 1)) != null){
                    try{
                        if(database.withdrawMoney(database.getUser((String)model.getValueAt(satir, 1)),
                                Integer.parseInt(jTextField_AmountOfMoney.getText()))){
                            JOptionPane.showMessageDialog(this, "The withdrawal is successful..", "Information Panel", 0);
                            this.user.paraCek(Integer.parseInt(jTextField_AmountOfMoney.getText()));
                        }
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(this, "The amount of money information was entered incorrectly..", "Information Panel", 0);
                    }
                }
                jTextField_AmountOfMoney.setText("");jTextField_moneyTransfer_UName.setText("");
                jTextField_foundUser.setText("");
                table_Delete();table_Uptade();
                return;
            }else
                return;
        }

        /*Kullanıcı bilgileri girilerek para çekme işlemi*/
        if(jTextField_moneyTransfer_UName.getText().equals("") || jTextField_AmountOfMoney.getText().equals("") ||
                jTextField_AmountOfMoney.getText().equals("Amount Money")){
            JOptionPane.showMessageDialog(this, "Please, enter how much money will be withdrawn..", "Information Panel", 0);
            jTextField_AmountOfMoney.setBackground(Color.pink);
            jTextField_moneyTransfer_UName.setBackground(Color.pink);
            return;
        }
        jTextField_AmountOfMoney.setBackground(Color.white);
        jTextField_moneyTransfer_UName.setBackground(Color.white);
        if(user.getSum() >= Integer.parseInt(jTextField_AmountOfMoney.getText())){
            database.withdrawMoney(database.getUser(jTextField_moneyTransfer_UName.getText()), Integer.parseInt(jTextField_AmountOfMoney.getText()));
            jTextField_AmountOfMoney.setText("");
            jTextField_moneyTransfer_UName.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Your balance is insufficient..\nThe withdrawal process failed.", "Information Panel", 1);
        }
        table_Delete();table_Uptade();
    }//GEN-LAST:event_buton_withdrawMoneyActionPerformed

    private void buton_moneyTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_moneyTransferActionPerformed
        /* TABLODAN SEÇİLEREK PARA TRANSFER İŞLEMİ */
        model = (DefaultTableModel) jTable_Users.getModel();
        int satir = jTable_Users.getSelectedRow();
        if(satir != -1 && jTable_Users.getRowCount() != 0){
            if(jTextField_AmountOfMoney.getText().equals("") || jTextField_AmountOfMoney.getText().equals("Amount Money") ){
               JOptionPane.showMessageDialog(this, "Please, enter how many money will be transferred..", "Information Panel", 0);
               jTextField_AmountOfMoney.setBackground(Color.pink);
               return;
            }
            jTextField_AmountOfMoney.setBackground(Color.white);
            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, this.user.getUserName() + ", "+jTextField_AmountOfMoney.getText()
                                +" TL "+ model.getValueAt(satir, 1)+" adlı kullanıcıya transfer edilecektir."+"\nAre you sure?","Information Panel",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(x == 0){
                if(database.getUser((String)model.getValueAt(satir, 1)) != null){
                    if(database.moneyTransfer(this.user, database.getUser((String)model.getValueAt(satir, 1)),
                            Integer.parseInt(jTextField_AmountOfMoney.getText()))){
                        JOptionPane.showMessageDialog(this, "The money transfer was successful.", "Information Panel", 0);
                        this.user.paraCek(Integer.parseInt(jTextField_AmountOfMoney.getText()));
                    }
                }
                jTextField_AmountOfMoney.setText("");jTextField_moneyTransfer_UName.setText("");
                jTextField_foundUser.setText("");
                table_Delete();table_Uptade();
                return;
            }else
                return;
        }

        /* KULLANICI BİLGİLERİ GİRİLEREK PARA TRANSFER İŞLEMİ */
        if(jTextField_moneyTransfer_UName.getText().equals("") || jTextField_AmountOfMoney.getText().equals("") ||
                jTextField_AmountOfMoney.getText().equals("Amount Money")){
               JOptionPane.showMessageDialog(this, "Please, fill in the required information..", "Information Panel", 0);
               jTextField_moneyTransfer_UName.setBackground(Color.pink);
               jTextField_AmountOfMoney.setBackground(Color.pink);
               return;
        }
        jTextField_moneyTransfer_UName.setBackground(Color.white);
        jTextField_AmountOfMoney.setBackground(Color.white);

        if(database.getUser(jTextField_moneyTransfer_UName.getText()) != null){
            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, user.getUserName() + ", " + jTextField_AmountOfMoney.getText()
                            +" TL "+ jTextField_moneyTransfer_UName.getText()+" adlı kullanıcıya transfer edilecektir."+"\nAre you sure?",
                    "Information Panel",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(x == 0){
                if(database.moneyTransfer(this.user, database.getUser(jTextField_moneyTransfer_UName.getText()), Integer.parseInt(jTextField_AmountOfMoney.getText()))){
                    this.user.paraCek(Integer.parseInt(jTextField_AmountOfMoney.getText()));
                }else{JOptionPane.showMessageDialog(this, "Your balance is insufficient..\nThe transfer process failed.",
                        "Information Panel",0);}
                jTextField_AmountOfMoney.setText("");
                jTextField_moneyTransfer_UName.setText("");
                table_Delete();table_Uptade();
                return;
            }else
                return;
        }
        table_Delete();table_Uptade();
    }//GEN-LAST:event_buton_moneyTransferActionPerformed

    private void buton_changeUNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_changeUNameActionPerformed
        if(jTextField_relatedUName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have entered incomplete information..", "Information Panel", 0);
            jTextField_relatedUName.setBackground(Color.pink);
            return;
        }
        jTextField_relatedUName.setBackground(Color.white);

        if(database.getUser(jTextField_relatedUName.getText()) == null){
            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, "Are you sure about your new username? \nNew Username : " +
                            jTextField_relatedUName.getText(),"Are you sure ?",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if(x == 0){
                database.changeUserName(user, jTextField_relatedUName.getText());
                user.setUserName(jTextField_relatedUName.getText());
                jTextField_relatedUName.setText("");
            }
        }
        table_Delete();table_Uptade();
    }//GEN-LAST:event_buton_changeUNameActionPerformed

    private void buton_changePswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_changePswActionPerformed
        if(jPasswordField_relatedPsw.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have entered incomplete information..", "Information Panel", 0);
            jPasswordField_relatedPsw.setBackground(Color.pink);
            return;
        }
        jPasswordField_relatedPsw.setBackground(Color.white);

        String[] options = {"Yes", "No"};
        int x = JOptionPane.showOptionDialog(null, "You are changing your password.\n"
                + "New Password : "+ jPasswordField_relatedPsw.getText() +"\nAre you sure?",
            "Are you sure ?",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(x == 0){
            database.changePsw(user, jPasswordField_relatedPsw.getText());
            user.setPsw(jPasswordField_relatedPsw.getText());
            table_Delete();table_Uptade();
            jPasswordField_relatedPsw.setText("");
            //return;
        }
        //table_Delete();table_Uptade();
    }//GEN-LAST:event_buton_changePswActionPerformed

    private void buton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_exitActionPerformed
        setVisible(false);
        ATM atm = new ATM();
        atm.setVisible(true);
    }//GEN-LAST:event_buton_exitActionPerformed

    private void buton_deleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_deleteUserMouseClicked
                                    
                                    /* TABLODA SEÇİLİ VERİNİN SİLİNME İŞLEMİ*/
        model = (DefaultTableModel) jTable_Users.getModel();
        int satir = jTable_Users.getSelectedRow();
        if(satir != -1 && jTable_Users.getRowCount() != 0){
            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, "Deleting an account named" + model.getValueAt(satir, 1) +
                            ".\nAre you sure?","Are you sure?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(x == 0){
                database.removeUser(database.getUser((Integer)model.getValueAt(satir, 0)));
                jPasswordField_relatedPsw.setText("");jTextField_relatedUName.setText("");
                jTextField_foundUser.setText("");
                table_Delete();table_Uptade();
                return;
            }else
                return;
        }
        
                                    /* GİRİLEN BİLGİLERİN SİLİNME İŞLEMİ*/
        if(jTextField_relatedUName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have entered incomplete information..", "Missing Information", 1);
            jTextField_relatedUName.setBackground(Color.pink);
            return;
        }
        jTextField_relatedUName.setBackground(Color.white);

        if(database.getUser(jTextField_relatedUName.getText()) != null){
            String[] options = {"Yes", "No"};
            int x = JOptionPane.showOptionDialog(null, "Deleting an account named" + jTextField_relatedUName.getText() +
                            ".\nAre you sure?","Are you sure ?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(x == 0){
                database.removeUser(database.getUser(jTextField_relatedUName.getText()));
                jPasswordField_relatedPsw.setText("");jTextField_relatedUName.setText("");
                table_Delete();table_Uptade();
                return;
            }else
                return;
        }else{
            JOptionPane.showMessageDialog(this, "No such username was found..", "Information Panel", 0);
        }
        table_Delete();table_Uptade();
    }//GEN-LAST:event_buton_deleteUserMouseClicked

    private void jTextField_foundUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_foundUserKeyReleased
        if(jTextField_foundUser.getText().equals("")){
            table_Delete();table_Uptade();
            return;
        }
        table_Delete();
        model = (DefaultTableModel) jTable_Users.getModel();
        for(User user: database.getUsers()){
            if(user.getUserName().toLowerCase().startsWith(jTextField_foundUser.getText().toLowerCase())){
                Object[] eklenecek = {user.getId(), user.getUserName(), user.getPsw(), user.getSum(), user.getYetki()};
                model.addRow(eklenecek);
            }
        }
    }//GEN-LAST:event_jTextField_foundUserKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_addUser;
    private javax.swing.JButton buton_changePsw;
    private javax.swing.JButton buton_changeUName;
    private javax.swing.JButton buton_deleteUser;
    private javax.swing.JButton buton_depositMoney;
    private javax.swing.JButton buton_exit;
    private javax.swing.JButton buton_moneyTransfer;
    private javax.swing.JButton buton_withdrawMoney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField_relatedPsw;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users;
    private javax.swing.JTextField jTextField_AmountOfMoney;
    private javax.swing.JTextField jTextField_foundUser;
    private javax.swing.JTextField jTextField_moneyTransfer_UName;
    private javax.swing.JTextField jTextField_relatedUName;
    private javax.swing.JLabel label_information;
    // End of variables declaration//GEN-END:variables
}
