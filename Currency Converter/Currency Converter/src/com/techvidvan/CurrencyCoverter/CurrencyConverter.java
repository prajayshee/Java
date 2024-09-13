// package com.techvidvan.CurrencyCoverter;


public class CurrencyConverter extends javax.swing.JFrame {

    public CurrencyConverter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        choiceFrom = new javax.swing.JComboBox();
        choiceTo = new javax.swing.JComboBox();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setText(" Currency Converter");
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setVerifyInputWhenFocusTarget(false);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("CONVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter Amount ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Convert From");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Convert To");

        input.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        choiceFrom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        choiceFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR", "USD", "EUR", "CAD", "JPY", "CNY", "BTC" }));
        choiceFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceFromItemStateChanged(evt);
            }
        });

        choiceTo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        choiceTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR", "USD", "EUR", "CAD", "JPY", "CNY", "BTC" }));
        choiceTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceToItemStateChanged(evt);
            }
        });

        output.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input)
                            .addComponent(choiceFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choiceTo, 0, 231, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(title)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(choiceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Double total;
		Double amount= Double.parseDouble(input.getText());
		
        //CONVERSION FROM USD to
        //if USD is converted to
        switch (choiceFrom.getSelectedItem().toString()) {
            case "USD":
                //INR
                switch (choiceTo.getSelectedItem().toString()) {
                    case "INR":
                        total=amount*83.36;
                        output.setText(input.getText()+" USD = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.91;
                        output.setText(input.getText()+" USD = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*1.36;
                        output.setText(input.getText()+" USD = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*148.95;
                        output.setText(input.getText()+" USD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*7.13;
                        output.setText(input.getText()+" USD = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.000027;
                        output.setText(input.getText()+" USD = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" USD = "+total+" USD");
                        break;
                }
                break;
            
            case "INR":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.012;
                        output.setText(input.getText()+" INR = "+total+" USD");
                        break;
                    case "EUR":
                        total=amount*0.011;
                        output.setText(input.getText()+" INR = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.016;
                        output.setText(input.getText()+" INR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*1.79;
                        output.setText(input.getText()+" INR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*0.086;
                        output.setText(input.getText()+" INR = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.00;
                        output.setText(input.getText()+" INR = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" INR = "+total+" INR");
                        break;
                }
                break;
            case "EUR":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*1.09;
                        output.setText(input.getText()+" EUR = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*91.10;
                        output.setText(input.getText()+" EUR = "+total+" INR");
                        break;
                    case "CAD":
                        total=amount*1.49;
                        output.setText(input.getText()+" EUR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*162.87;
                        output.setText(input.getText()+" EUR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*7.79;
                        output.setText(input.getText()+" EUR = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.000030;
                        output.setText(input.getText()+" EUR = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" EUR = "+total+" EUR");
                        break;
                }
                break;
            case "CAD":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.73;
                        output.setText(input.getText()+" CAD = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*61.14;
                        output.setText(input.getText()+" CAD = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.67;
                        output.setText(input.getText()+" CAD = "+total+" EUR");
                        break;
                    case "JPY":
                        total=amount*109.25;
                        output.setText(input.getText()+" CAD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*5.23;
                        output.setText(input.getText()+" CAD = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.000020;
                        output.setText(input.getText()+" CAD = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" CAD = "+total+" CAD");
                        break;
                }
                break;
            case "JPY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.0067;
                        output.setText(input.getText()+" JPY = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*0.56;
                        output.setText(input.getText()+" JPY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.0061;
                        output.setText(input.getText()+" JPY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.0092;
                        output.setText(input.getText()+" JPY = "+total+" CAD");
                        break;
                    case "CNY":
                        total=amount*0.048;
                        output.setText(input.getText()+" JPY = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.00;
                        output.setText(input.getText()+" JPY = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" JPY = "+total+" JPY");
                        break;
                }
                break;
            case "CNY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.1454;
                        output.setText(input.getText()+" CNY = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*11.69;
                        output.setText(input.getText()+" CNY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.13712;
                        output.setText(input.getText()+" CNY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.19659;
                        output.setText(input.getText()+" CNY = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*20.89;
                        output.setText(input.getText()+" CNY = "+total+" JPY");
                        break;
                    case "BTC":
                        total=amount*0.0000038;
                        output.setText(input.getText()+" CNY = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" CNY = "+total+" CNY");
                        break;
                }
                break;
            case "BTC":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*37027.50;
                        output.setText(input.getText()+" BTC = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*3086793.83;
                        output.setText(input.getText()+" BTC = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*33871.83;
                        output.setText(input.getText()+" BTC = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*50501.44;
                        output.setText(input.getText()+" BTC = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*5516282.90;
                        output.setText(input.getText()+" BTC = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*264039.40;
                        output.setText(input.getText()+" BTC = "+total+" CNY");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" BTC = "+total+" BTC");
                        break;
                }
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void choiceFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceFromItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceFromItemStateChanged

    private void choiceToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceToItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceToItemStateChanged

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox choiceFrom;
    private javax.swing.JComboBox choiceTo;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel output;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
