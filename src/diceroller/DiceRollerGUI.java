/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Luke
 */
public class DiceRollerGUI extends javax.swing.JFrame {
    /**
     * Creates new form DiceRollerGUI
     */
    public DiceRollerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dieTypeGroup = new javax.swing.ButtonGroup();
        rollButton = new javax.swing.JButton();
        dieNumber = new javax.swing.JTextField();
        d3RadioButton = new javax.swing.JRadioButton();
        d4RadioButton = new javax.swing.JRadioButton();
        d6RadioButton = new javax.swing.JRadioButton();
        d8RadioButton = new javax.swing.JRadioButton();
        d10RadioButton = new javax.swing.JRadioButton();
        d12RadioButton = new javax.swing.JRadioButton();
        d20RadioButton = new javax.swing.JRadioButton();
        d100RadioButton = new javax.swing.JRadioButton();
        dieNumberLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        maxVariableLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dice Roller");

        rollButton.setText("Roll!");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        dieTypeGroup.add(d3RadioButton);
        d3RadioButton.setText("D3");

        dieTypeGroup.add(d4RadioButton);
        d4RadioButton.setText("D4");

        dieTypeGroup.add(d6RadioButton);
        d6RadioButton.setText("D6");

        dieTypeGroup.add(d8RadioButton);
        d8RadioButton.setText("D8");

        dieTypeGroup.add(d10RadioButton);
        d10RadioButton.setText("D10");

        dieTypeGroup.add(d12RadioButton);
        d12RadioButton.setText("D12");

        dieTypeGroup.add(d20RadioButton);
        d20RadioButton.setText("D20");

        dieTypeGroup.add(d100RadioButton);
        d100RadioButton.setText("D100");

        dieNumberLabel.setText("The number of dice you want to roll:");

        resultLabel.setText("Result:");

        maxVariableLabel.setText("(Maximum 15)");

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
                                .addComponent(d3RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d4RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d6RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d100RadioButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(d8RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d10RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d12RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d20RadioButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dieNumberLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dieNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxVariableLabel)))
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addComponent(resultLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d3RadioButton)
                    .addComponent(d4RadioButton)
                    .addComponent(d6RadioButton)
                    .addComponent(d8RadioButton)
                    .addComponent(d10RadioButton)
                    .addComponent(d12RadioButton)
                    .addComponent(d20RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d100RadioButton)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dieNumberLabel)
                    .addComponent(dieNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxVariableLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(rollButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultLabel)
                .addGap(17, 17, 17))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {resultLabel, rollButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed
        // TODO add your handling code here:
        //Declare variables
        int diceAmount = 0; //Number of dice (from textField)
        int diceType = 0; //Type of dice (from RadioButtons)
        ArrayList<String> resultsList = new ArrayList<>();
        //Check which RadioButton is in use - is there an easier way to do this?
        if (d100RadioButton.isSelected()) {
            diceType = 100;
        }
        else if (d10RadioButton.isSelected()) {
            diceType = 10;
        }
        else if (d12RadioButton.isSelected()) {
            diceType = 12;
        }
        else if (d20RadioButton.isSelected()) {
            diceType = 20;
        }
        else if (d3RadioButton.isSelected()) {
            diceType = 3;
        }
        else if (d4RadioButton.isSelected()) {
            diceType = 4;
        }
        else if (d6RadioButton.isSelected()) {
            diceType = 6;
        }
        else if (d8RadioButton.isSelected()) {
            diceType = 8;
        }
        else {
            resultLabel.setText("Please select a type of die"); //Remind the user to select a type of die if none is selected
            return;
        }
       try {
        diceAmount = Integer.parseInt(dieNumber.getText()); //Acquire number of dice from JTextField
       }
       catch (NumberFormatException e) {
           resultLabel.setText("That's not even a number. Please use a number.");
           return;
       }
        if (diceAmount == 0) {
            resultLabel.setText("You can't roll zero dice, silly.");//I know, I'm hilarious.
            return;
        } else if (diceAmount > 15) {
            resultLabel.setText("It says maximum number fifteen for a reason, you know!");
            return;
        }
        //Actually rolling the dice and inputting them into an ArrayList
        for (int i = 0; i < diceAmount; i++) {
            int die = (int) (Math.random() * diceType) +1; 
            String result = String.valueOf(die);
            resultsList.add(result);
        }
        //Converting the ArrayList into an array and then into a string.
        String[] resultsFinal = new String[resultsList.size()];
        resultsFinal = resultsList.toArray(resultsFinal);
        resultLabel.setText(Arrays.toString(resultsFinal));
    }//GEN-LAST:event_rollButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DiceRollerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceRollerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceRollerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceRollerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceRollerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton d100RadioButton;
    private javax.swing.JRadioButton d10RadioButton;
    private javax.swing.JRadioButton d12RadioButton;
    private javax.swing.JRadioButton d20RadioButton;
    private javax.swing.JRadioButton d3RadioButton;
    private javax.swing.JRadioButton d4RadioButton;
    private javax.swing.JRadioButton d6RadioButton;
    private javax.swing.JRadioButton d8RadioButton;
    private javax.swing.JTextField dieNumber;
    private javax.swing.JLabel dieNumberLabel;
    private javax.swing.ButtonGroup dieTypeGroup;
    private javax.swing.JLabel maxVariableLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton rollButton;
    // End of variables declaration//GEN-END:variables

 
}

