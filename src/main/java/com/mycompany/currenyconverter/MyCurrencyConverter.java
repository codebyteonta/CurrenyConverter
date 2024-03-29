/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.currenyconverter;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 *
 * @author Nikita
 */
public class MyCurrencyConverter extends javax.swing.JFrame {

    String [] currencyUnits = {
        "units",
        "US Dollar",
        "Nigerian Naira",
        "Brazilian Real",
        "Canadian Dollar",
        "Kenyan Shilling",
        "Indonesian Rupiah",
        "Indian Rupee",
        "Philippine Pisco",
        "Pakistan Rupee"
    };
    double US_Dollar = 1.31;
    double Nigerian_Naira = 476.57;
    double Brazillian_Real = 5.47;
    double Canadian_Dollar = 34.56;
    double Kenyan_Shilling = 132.53;
    double Indonesian_Ripah = 19554.94;
    double Indian_Rupee = 74.21;
    double Philipiine_Pisco = 92.23;
    double Pakistan_Rupee = 12.34;
            
    public MyCurrencyConverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        textFirstCountry = new javax.swing.JTextField();
        textSecondCountry = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JButton btnConvert = new javax.swing.JButton();
        javax.swing.JButton btnReset = new javax.swing.JButton();
        javax.swing.JButton btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setFont(new java.awt.Font("Segue UI Symbol", Font.BOLD, 36)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segue UI", Font.BOLD, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CURRENCY CONVERTER");

        firstCountry.setFont(new java.awt.Font("Thoma", Font.BOLD, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one..", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        firstCountry.addItemListener(this::firstCountryItemStateChanged);
        firstCountry.addActionListener(this::firstCountryActionPerformed);

        secondCountry.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one..", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        secondCountry.addItemListener(this::secondCountryItemStateChanged);

        textFirstCountry.setFont(new java.awt.Font("Thoma", Font.BOLD, 14)); // NOI18N

        textSecondCountry.setFont(new java.awt.Font("Thoma", Font.BOLD, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Thoma", Font.BOLD, 14)); // NOI18N
        jLabel2.setText("From currency of");

        jLabel3.setFont(new java.awt.Font("Thoma", Font.BOLD, 14)); // NOI18N
        jLabel3.setText("To currency of");

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("Units");

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("Units");

        btnConvert.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        btnConvert.setText("Convert");
        btnConvert.addActionListener(evt -> btnConvertActionPerformed());

        btnReset.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(evt -> btnResetActionPerformed());

        btnExit.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(evt -> btnExitActionPerformed());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFirstCountry)
                    .addComponent(firstCountry, 0, 216, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(secondCountry, javax.swing.GroupLayout.Alignment.TRAILING, 0, 216, Short.MAX_VALUE)
                    .addComponent(textSecondCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnConvert)
                        .addGap(96, 96, 96)
                        .addComponent(btnReset)
                        .addGap(91, 91, 91)
                        .addComponent(btnExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFirstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSecondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCurrencyUnit)
                    .addComponent(secondCurrencyUnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert)
                    .addComponent(btnReset)
                    .addComponent(btnExit))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCountryActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
        
        int position = firstCountry.getSelectedIndex();
         
        firstCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        int position = secondCountry.getSelectedIndex();
        
        secondCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void btnExitActionPerformed() {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConvertActionPerformed() {//GEN-FIRST:event_btnConvertActionPerformed
       //convert currency
       
       if(textFirstCountry.getText().equals("")){
           JOptionPane.showMessageDialog(null,"You must select both countries and must input the amount","Error Message", JOptionPane.INFORMATION_MESSAGE
                   );
           return;
       }
       double amountToChange = Double.parseDouble(textFirstCountry.getText());
       double amountInPounds;
       
       switch (Objects.requireNonNull(firstCountry.getSelectedItem()).toString()){
           case "USA" : amountInPounds = amountToChange / US_Dollar;
           break;
           
           case "Nigeria" : amountInPounds = amountToChange / Nigerian_Naira;
           break;
           
           case "Brazil" : amountInPounds = amountToChange / Brazillian_Real;
           break;
           
           case "Canada" : amountInPounds = amountToChange / Canadian_Dollar;
           break;
           
           case "Kenyan" : amountInPounds = amountToChange / Kenyan_Shilling;
           break;
           
           case "Indonesia" : amountInPounds = amountToChange / Indonesian_Ripah;
           break;
           
           case "India" : amountInPounds = amountToChange / Indian_Rupee;
           break;
           
           case "Philipine " : amountInPounds = amountToChange / Philipiine_Pisco;
           break;
           
           case "Pakistan" : amountInPounds = amountToChange / Pakistan_Rupee;
           break;
           
           default:amountInPounds = 0.0;
       }
       
       double amountChanged;
       
       switch (Objects.requireNonNull(secondCountry.getSelectedItem()).toString()){
           case "India" : amountChanged = amountInPounds * Indian_Rupee;
           break;
           case "Nigeria":amountChanged = amountInPounds * Nigerian_Naira;
           break;
            case "Brazil":amountChanged = amountInPounds * Brazillian_Real;
            break;
            case "Canada":amountChanged = amountInPounds * Canadian_Dollar;
            break;
            case "Kenyan":amountChanged = amountInPounds * Kenyan_Shilling;
            break;
            case "Indonesia":amountChanged = amountInPounds * Indonesian_Ripah;
            break;
            case "Philippine":amountChanged = amountInPounds * Philipiine_Pisco;
            break;
            case "Pakistan":amountChanged = amountInPounds * Pakistan_Rupee;
            break;
            default:amountChanged = amountInPounds * 0.0;
       }
       
       String value = String.format("%.2f", amountChanged);
       textSecondCountry.setText(value);
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnResetActionPerformed() {//GEN-FIRST:event_btnResetActionPerformed
       firstCountry.setSelectedIndex(0);
       secondCountry.setSelectedIndex(0);
       textFirstCountry.setText(null);
       textSecondCountry.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold default-state="collapsed" desc=" Look and feel setting code (optional) ">
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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MyCurrencyConverter().setVisible(true));
    }

    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField textFirstCountry;
    private javax.swing.JTextField textSecondCountry;
    // End of variables declaration//GEN-END:variables
}
