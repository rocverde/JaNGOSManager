package eu.jangos.manager;

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

import eu.jangos.manager.gui.dialog.DialogAbout;
import eu.jangos.manager.gui.frame.FrameManageAccount;
import eu.jangos.manager.utils.Utils;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Warkdev
 */
public class JaNGOSManager extends JFrame {

    private static final Logger logger = LoggerFactory.getLogger(JaNGOSManager.class);
    private static final String ICON_IMAGE = "/images/world-icon.png";   

    /**
     * Creates new form JE4WManagerWindow
     */
    public JaNGOSManager() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);        
        this.setIconImage(Utils.createImageIcon(ICON_IMAGE, getClass()).getImage());
        this.setLocationRelativeTo(null);   
        this.jDesktopMainPane.add(this.fManageAccount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopMainPane = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuQuit = new javax.swing.JMenuItem();
        jMenuAccount = new javax.swing.JMenu();
        jMenuManageAccounts = new javax.swing.JMenuItem();
        jMenuManageRealms = new javax.swing.JMenuItem();
        jMenuManageParameters = new javax.swing.JMenuItem();
        jMenuItems = new javax.swing.JMenu();
        jMenuItemManage = new javax.swing.JMenuItem();
        jMenuStartingItems = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JaNGOS Manager Application");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(720, 480));

        jDesktopMainPane.setMinimumSize(new java.awt.Dimension(1157, 725));
        jDesktopMainPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jDesktopMainPaneComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jDesktopMainPaneLayout = new javax.swing.GroupLayout(jDesktopMainPane);
        jDesktopMainPane.setLayout(jDesktopMainPaneLayout);
        jDesktopMainPaneLayout.setHorizontalGroup(
            jDesktopMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1157, Short.MAX_VALUE)
        );
        jDesktopMainPaneLayout.setVerticalGroup(
            jDesktopMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopMainPane, java.awt.BorderLayout.CENTER);

        jMenuFile.setText("File");

        jMenuQuit.setText("Quit");
        jMenuQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuQuitMouseReleased(evt);
            }
        });
        jMenuFile.add(jMenuQuit);

        jMenuBar.add(jMenuFile);

        jMenuAccount.setText("Authentication");

        jMenuManageAccounts.setText("Accounts");
        jMenuManageAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuManageAccountsMouseReleased(evt);
            }
        });
        jMenuAccount.add(jMenuManageAccounts);

        jMenuManageRealms.setText("Realms");
        jMenuAccount.add(jMenuManageRealms);

        jMenuManageParameters.setText("Parameters");
        jMenuAccount.add(jMenuManageParameters);

        jMenuBar.add(jMenuAccount);

        jMenuItems.setText("Items");

        jMenuItemManage.setText("Manage Items");
        jMenuItems.add(jMenuItemManage);

        jMenuStartingItems.setText("Starting Items");
        jMenuStartingItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuStartingItemsMouseReleased(evt);
            }
        });
        jMenuItems.add(jMenuStartingItems);

        jMenuBar.add(jMenuItems);

        jMenuHelp.setText("Help");

        jMenuItemAbout.setText("About");
        jMenuItemAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItemAboutMouseReleased(evt);
            }
        });
        jMenuHelp.add(jMenuItemAbout);

        jMenuBar.add(jMenuHelp);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAboutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAboutMouseReleased
        jDialogAbout.setVisible(true);
    }//GEN-LAST:event_jMenuItemAboutMouseReleased

    private void jMenuQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuQuitMouseReleased
        this.dispose();
    }//GEN-LAST:event_jMenuQuitMouseReleased

    private void jMenuStartingItemsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuStartingItemsMouseReleased

    }//GEN-LAST:event_jMenuStartingItemsMouseReleased

    private void jMenuManageAccountsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuManageAccountsMouseReleased
        fManageAccount.setVisible(true);
        try {
            fManageAccount.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(JaNGOSManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuManageAccountsMouseReleased

    private void jDesktopMainPaneComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopMainPaneComponentResized
        //System.out.println("my size is: "+this.getSize());
    }//GEN-LAST:event_jDesktopMainPaneComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        UIManager.put("info", Color.BLACK);
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JaNGOSManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JaNGOSManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JaNGOSManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JaNGOSManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JaNGOSManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopMainPane;
    private javax.swing.JMenu jMenuAccount;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemManage;
    private javax.swing.JMenu jMenuItems;
    private javax.swing.JMenuItem jMenuManageAccounts;
    private javax.swing.JMenuItem jMenuManageParameters;
    private javax.swing.JMenuItem jMenuManageRealms;
    private javax.swing.JMenuItem jMenuQuit;
    private javax.swing.JMenuItem jMenuStartingItems;
    // End of variables declaration//GEN-END:variables
    private final DialogAbout jDialogAbout = new DialogAbout(this, true);     
    private final FrameManageAccount fManageAccount = new FrameManageAccount();
}
