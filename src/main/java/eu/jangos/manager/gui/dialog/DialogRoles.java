/*
 * Copyright 2016 Warkdev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.jangos.manager.gui.dialog;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *  DialogRoles is the dialog allowing to create a new role.
 * 
 * @author Warkdev
 * @version 1.0
 * @since 19-02-2016
 */
public class DialogRoles extends javax.swing.JDialog {    
    
    /**
     * Code is the EXIT code for this dialog.
     * JOptionPane.OK_OPTION if ok is clicked.
     * JOptionPane.CANCEL_OPTION if cancel is clicked.
     */
    private int code = JOptionPane.CANCEL_OPTION;
    
    public DialogRoles() {
        super();
        initComponents();        
    }
    
    /**
     * Creates new form DialogLogin
     */
    public DialogRoles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelDialog = new javax.swing.JPanel();
        jLabelRoleName = new javax.swing.JLabel();
        jTFName = new javax.swing.JTextField();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelControls = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("eu/jangos/manager/Bundle"); // NOI18N
        setTitle(bundle.getString("DialogRoles.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(370, 181));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(370, 181));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanelDialog.setMinimumSize(new java.awt.Dimension(429, 240));
        jPanelDialog.setPreferredSize(new java.awt.Dimension(429, 240));
        jPanelDialog.setLayout(new java.awt.GridBagLayout());

        jLabelRoleName.setText(bundle.getString("DialogRoles.jLabelRoleName.text")); // NOI18N
        jPanelDialog.add(jLabelRoleName, new java.awt.GridBagConstraints());

        jTFName.setMaximumSize(new java.awt.Dimension(110, 25));
        jTFName.setMinimumSize(new java.awt.Dimension(110, 25));
        jTFName.setPreferredSize(new java.awt.Dimension(110, 25));
        jTFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNameKeyReleased(evt);
            }
        });
        jPanelDialog.add(jTFName, new java.awt.GridBagConstraints());

        jScrollPaneDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("DialogRoles.jScrollPaneDescription.border.title"))); // NOI18N
        jScrollPaneDescription.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneDescription.setMinimumSize(new java.awt.Dimension(392, 140));
        jScrollPaneDescription.setPreferredSize(new java.awt.Dimension(392, 140));

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setMinimumSize(new java.awt.Dimension(392, 140));
        jTextAreaDescription.setPreferredSize(new java.awt.Dimension(392, 80));
        jScrollPaneDescription.setViewportView(jTextAreaDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        jPanelDialog.add(jScrollPaneDescription, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanelDialog.add(jSeparator1, gridBagConstraints);

        jButtonCancel.setText(bundle.getString("DialogRoles.jButtonCancel.text")); // NOI18N
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanelControls.add(jButtonCancel);

        jButtonAdd.setText(bundle.getString("DialogRoles.jButtonAdd.text")); // NOI18N
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanelControls.add(jButtonAdd);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanelDialog.add(jPanelControls, gridBagConstraints);

        getContentPane().add(jPanelDialog);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.code = JOptionPane.CANCEL_OPTION;
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        this.code = JOptionPane.OK_OPTION;
        this.dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTFNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNameKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            this.code = JOptionPane.OK_OPTION;
            this.dispose();
        }
    }//GEN-LAST:event_jTFNameKeyReleased

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }        
    
    /**
     * Return the entered role name.
     * @return A String containing the entered role name.
     */
    public String getName() {
        return this.jTFName.getText();
    }
    
    /**
     * Return the entered description.
     * @return A String containing the entered description.
     */
    public String getDescription() {
        return this.jTextAreaDescription.getText();
    }
    
    /**
     * Reset the graphical interface.
     */
    public void reset() {
        this.jTextAreaDescription.setText("");
        this.jTFName.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabelRoleName;
    private javax.swing.JPanel jPanelControls;
    private javax.swing.JPanel jPanelDialog;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFName;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables
}