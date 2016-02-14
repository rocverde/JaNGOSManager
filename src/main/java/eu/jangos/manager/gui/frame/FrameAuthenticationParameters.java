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
package eu.jangos.manager.gui.frame;

import eu.jangos.manager.controller.ParameterService;
import eu.jangos.manager.model.Parameter1;
import eu.jangos.manager.utils.ParameterConstants;
import eu.jangos.manager.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FrameAuthenticationParameters is the frame used to manage the parameters of the authentication server.
 * @author Warkdev
 * @version 1.0
 * @since 14-02-2016
 */
public class FrameAuthenticationParameters extends javax.swing.JInternalFrame {

    private static final Logger logger = LoggerFactory.getLogger(FrameManageAccount.class);
    private static final String ICON_IMAGE = "/images/parameters.png";
    
    private final ParameterService ps;
    
    /**
     * Creates new form FrameAuthenticationParameters
     */
    public FrameAuthenticationParameters() {
        initComponents();
        
        this.ps = null;
        
        this.setFrameIcon(Utils.createImageIcon(ICON_IMAGE, getClass()));                
    }

    public FrameAuthenticationParameters(ParameterService ps) {
        initComponents();
                
        this.ps = ps;
        
        this.setFrameIcon(Utils.createImageIcon(ICON_IMAGE, getClass()));
        
        this.jTFAddress.setText(this.ps.getParameter(ParameterConstants.KEY_AUTH_ADDRESS));
        this.jSpinnerPort.setValue(Integer.parseInt(this.ps.getParameter(ParameterConstants.KEY_AUTH_PORT)));
        this.jTFVersion.setText(this.ps.getParameter(ParameterConstants.KEY_AUTH_VERSION));
        this.jSpinnerTimeout.setValue(Integer.parseInt(this.ps.getParameter(ParameterConstants.KEY_AUTH_TIMEOUT)));
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

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelServer = new javax.swing.JPanel();
        jPanelServerParams = new javax.swing.JPanel();
        jLabelPort = new javax.swing.JLabel();
        jSpinnerPort = new javax.swing.JSpinner();
        jLabelAddress = new javax.swing.JLabel();
        jTFAddress = new javax.swing.JTextField();
        jLabelVersion = new javax.swing.JLabel();
        jTFVersion = new javax.swing.JTextField();
        jLabelTimeout = new javax.swing.JLabel();
        jSpinnerTimeout = new javax.swing.JSpinner();
        jPanelServerControls = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jPanelLogin = new javax.swing.JPanel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Parameters");
        setMaximumSize(new java.awt.Dimension(60, 40));
        setMinimumSize(new java.awt.Dimension(60, 40));
        setPreferredSize(new java.awt.Dimension(60, 40));

        jTabbedPane.setMaximumSize(new java.awt.Dimension(60, 40));
        jTabbedPane.setMinimumSize(new java.awt.Dimension(60, 40));
        jTabbedPane.setPreferredSize(new java.awt.Dimension(60, 40));

        jPanelServer.setMaximumSize(new java.awt.Dimension(60, 60));
        jPanelServer.setMinimumSize(new java.awt.Dimension(60, 60));
        jPanelServer.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelServer.setLayout(new java.awt.BorderLayout());

        jPanelServerParams.setLayout(new java.awt.GridBagLayout());

        jLabelPort.setText("Port:");
        jLabelPort.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabelPort.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabelPort.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanelServerParams.add(jLabelPort, gridBagConstraints);

        jSpinnerPort.setModel(new javax.swing.SpinnerNumberModel(1, 1, 65535, 1));
        jSpinnerPort.setMaximumSize(new java.awt.Dimension(110, 25));
        jSpinnerPort.setMinimumSize(new java.awt.Dimension(110, 25));
        jSpinnerPort.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanelServerParams.add(jSpinnerPort, gridBagConstraints);

        jLabelAddress.setText("Address:");
        jLabelAddress.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabelAddress.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabelAddress.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanelServerParams.add(jLabelAddress, gridBagConstraints);

        jTFAddress.setMaximumSize(new java.awt.Dimension(110, 25));
        jTFAddress.setMinimumSize(new java.awt.Dimension(110, 25));
        jTFAddress.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanelServerParams.add(jTFAddress, new java.awt.GridBagConstraints());

        jLabelVersion.setText("Version:");
        jLabelVersion.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabelVersion.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabelVersion.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanelServerParams.add(jLabelVersion, gridBagConstraints);

        jTFVersion.setMaximumSize(new java.awt.Dimension(110, 25));
        jTFVersion.setMinimumSize(new java.awt.Dimension(110, 25));
        jTFVersion.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanelServerParams.add(jTFVersion, gridBagConstraints);

        jLabelTimeout.setText("Timeout:");
        jLabelTimeout.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabelTimeout.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabelTimeout.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        jPanelServerParams.add(jLabelTimeout, gridBagConstraints);

        jSpinnerTimeout.setModel(new javax.swing.SpinnerNumberModel(30, 1, 120, 1));
        jSpinnerTimeout.setMaximumSize(new java.awt.Dimension(110, 25));
        jSpinnerTimeout.setMinimumSize(new java.awt.Dimension(110, 25));
        jSpinnerTimeout.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        jPanelServerParams.add(jSpinnerTimeout, gridBagConstraints);

        jPanelServer.add(jPanelServerParams, java.awt.BorderLayout.CENTER);

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanelServerControls.add(jButtonSave);

        jPanelServer.add(jPanelServerControls, java.awt.BorderLayout.PAGE_END);

        jTabbedPane.addTab("Server", jPanelServer);

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Login", jPanelLogin);

        getContentPane().add(jTabbedPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        saveParam(ParameterConstants.KEY_AUTH_PORT, ""+this.jSpinnerPort.getValue());
        saveParam(ParameterConstants.KEY_AUTH_ADDRESS, this.jTFAddress.getText());
        saveParam(ParameterConstants.KEY_AUTH_TIMEOUT, ""+this.jSpinnerTimeout.getValue());
        saveParam(ParameterConstants.KEY_AUTH_VERSION, this.jTFVersion.getText());                                
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void saveParam(String key, String value)
    {
        Parameter1 p = this.ps.getParameterObject(key);
        
        if(p != null)
        {
            p.setVal(value);
            this.ps.save(p);
        }                
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelTimeout;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelServer;
    private javax.swing.JPanel jPanelServerControls;
    private javax.swing.JPanel jPanelServerParams;
    private javax.swing.JSpinner jSpinnerPort;
    private javax.swing.JSpinner jSpinnerTimeout;
    private javax.swing.JTextField jTFAddress;
    private javax.swing.JTextField jTFVersion;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
