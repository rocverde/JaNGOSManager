/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.jangos.manager.gui.dialog;

import eu.jangos.manager.JE4WManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Cedric
 */
public class DialogAccountDetails extends javax.swing.JDialog {    
    
    /**
     * Creates new form JDialogAddAccount
     * @param parent Parent frame, must be JE4WManager frame.
     * @param modal indicates whether this dialog is modal or not.
     */
    public DialogAccountDetails(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();   
        this.setLocationRelativeTo(parent);
    }

    public void resetFields() {
        this.jPFPassword.setText("");
        this.jTFName.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPseudo = new javax.swing.JLabel();
        jTFName = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPFPassword = new javax.swing.JPasswordField();
        jButtonCancel = new javax.swing.JButton();
        jButtonCreateAccount = new javax.swing.JButton();

        setTitle("Add account");
        setMinimumSize(new java.awt.Dimension(427, 247));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2, 5, 4));

        jLabelPseudo.setText("Pseudo");
        getContentPane().add(jLabelPseudo);
        getContentPane().add(jTFName);

        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword);
        getContentPane().add(jPFPassword);

        jButtonCancel.setText("Cancel");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseReleased(evt);
            }
        });
        getContentPane().add(jButtonCancel);

        jButtonCreateAccount.setText("Create");
        jButtonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCreateAccount);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateAccountActionPerformed
        if(jTFName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Account name is empty.", "Validation error",JOptionPane.ERROR_MESSAGE);
            this.jTFName.requestFocus();
            return;
        }
        
        if(true){
            JOptionPane.showMessageDialog(this, "Account name is already in use, please chose another one.", "Validation error",JOptionPane.ERROR_MESSAGE);
            this.jTFName.requestFocus();
            return;
        }
        
        if(jPFPassword.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Password field is empty.", "Validation error",JOptionPane.ERROR_MESSAGE);
            this.jPFPassword.requestFocus();
            return;
        }
        
        // Finally, creating the account.
        if(true)
        {
            JOptionPane.showMessageDialog(this, "Account "+jTFName.getText().toUpperCase()+" has been created.", "Creation success",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "An error occured during the account creation, please re-try.", "Creation error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.dispose();
    }//GEN-LAST:event_jButtonCreateAccountActionPerformed

    private void jButtonCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseReleased
        this.dispose();
    }//GEN-LAST:event_jButtonCancelMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreateAccount;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPseudo;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JTextField jTFName;
    // End of variables declaration//GEN-END:variables
}
