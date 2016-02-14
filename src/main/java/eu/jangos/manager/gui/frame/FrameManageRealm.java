package eu.jangos.manager.gui.frame;

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
import eu.jangos.manager.controller.RealmService;
import eu.jangos.manager.controller.RealmTypeService;
import eu.jangos.manager.controller.TimezoneService;
import eu.jangos.manager.gui.editor.cb.RealmTimeZoneCellEditor;
import eu.jangos.manager.gui.editor.cb.RealmTypeCellEditor;
import eu.jangos.manager.gui.editor.jspinner.SpinnerCellEditor;
import eu.jangos.manager.gui.renderer.cb.ListRealmtypeCellRenderer;
import eu.jangos.manager.gui.renderer.cb.ListTimezoneCellRenderer;
import eu.jangos.manager.gui.renderer.cb.RealmTimeZoneRenderer;
import eu.jangos.manager.gui.renderer.cb.RealmTypeCellRenderer;
import eu.jangos.manager.model.Account;
import eu.jangos.manager.model.Realm;
import eu.jangos.manager.model.Realmtimezone;
import eu.jangos.manager.model.Realmtype;
import eu.jangos.manager.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.SwingWorker.StateValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FrameManageAccount is the screen that will handle all the accounts related
 * activities.
 *
 * @author Warkdev
 * @version v0.1
 */
public class FrameManageRealm extends javax.swing.JInternalFrame {

    private static final Logger logger = LoggerFactory.getLogger(FrameManageRealm.class);
    private static final String ICON_IMAGE = "/images/account.png";

    private final RealmService rs;
    private final RealmTypeService rts;
    private final TimezoneService ts;
    private Account manager;

    //private final JFrame parent;
    private SwingWorkerRealm worker;

    public FrameManageRealm() {
        this.rs = null;
        this.rts = null;
        this.ts = null;
    }

    /**
     * Creates new form FrameManageAccount
     *
     * @param rs
     * @param rts
     * @param ts
     */
    public FrameManageRealm(RealmService rs, RealmTypeService rts, TimezoneService ts) {
        this.manager = null;
        this.rs = rs;
        this.rts = rts;
        this.ts = ts;

        initComponents();

        // Sort this table by name per default.        
        this.setFrameIcon(Utils.createImageIcon(ICON_IMAGE, getClass()));

        this.worker = new SwingWorkerRealm();

        this.jTableRealms.setDefaultRenderer(Realmtype.class, new RealmTypeCellRenderer());
        this.jTableRealms.setDefaultRenderer(Realmtimezone.class, new RealmTimeZoneRenderer());

        this.jTableRealms.setDefaultEditor(Realmtype.class, new RealmTypeCellEditor(this.rts.getAllRealmType()));
        this.jTableRealms.setDefaultEditor(Realmtimezone.class, new RealmTimeZoneCellEditor(this.ts.getAllRealmTimezone()));

        this.jTableRealms.setDefaultEditor(Integer.class, new SpinnerCellEditor(65535));

        this.jTableRealms.setRowHeight(25);

        List<Realmtimezone> listTimezones = this.ts.getAllRealmTimezone();
        List<Realmtype> listTypes = this.rts.getAllRealmType();

        // We add dummies values for editing purposes.
        listTimezones.add(0, new Realmtimezone(-1, "ALL", null));
        listTypes.add(0, new Realmtype(-1, "ALL", null));

        this.jCBTimezone.setModel(new DefaultComboBoxModel(listTimezones.toArray()));
        this.jCBTimezone.setRenderer(new ListTimezoneCellRenderer());

        this.jCBType.setModel(new DefaultComboBoxModel(listTypes.toArray()));
        this.jCBType.setRenderer(new ListRealmtypeCellRenderer());
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

        jTableRealmsModel = new eu.jangos.manager.gui.model.table.JTableRealmModel();
        jScrollPaneTableAccounts = new javax.swing.JScrollPane();
        jTableRealms = new javax.swing.JTable();
        jPanelFilters = new javax.swing.JPanel();
        jPanelGeneric = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTFName = new javax.swing.JTextField();
        jCBMatch = new javax.swing.JCheckBox();
        jLabelType = new javax.swing.JLabel();
        jCBType = new javax.swing.JComboBox();
        jLabelTimezone = new javax.swing.JLabel();
        jCBTimezone = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jButtonReset = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jPanelControls = new javax.swing.JPanel();
        jButtonCalcPop = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Realm Management");
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTableRealms.setModel(jTableRealmsModel);
        jTableRealms.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTableRealms.getTableHeader().setReorderingAllowed(false);
        jScrollPaneTableAccounts.setViewportView(jTableRealms);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 554;
        gridBagConstraints.ipady = 358;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPaneTableAccounts, gridBagConstraints);

        jPanelFilters.setBorder(javax.swing.BorderFactory.createTitledBorder("Filters"));
        jPanelFilters.setLayout(new java.awt.GridBagLayout());

        jPanelGeneric.setMaximumSize(new java.awt.Dimension(500, 140));
        jPanelGeneric.setMinimumSize(new java.awt.Dimension(500, 140));
        jPanelGeneric.setName(""); // NOI18N
        jPanelGeneric.setPreferredSize(new java.awt.Dimension(500, 140));
        jPanelGeneric.setLayout(new java.awt.GridBagLayout());

        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelName.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanelGeneric.add(jLabelName, gridBagConstraints);

        jTFName.setMaximumSize(new java.awt.Dimension(110, 25));
        jTFName.setMinimumSize(new java.awt.Dimension(110, 25));
        jTFName.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanelGeneric.add(jTFName, gridBagConstraints);

        jCBMatch.setText("Match");
        jCBMatch.setToolTipText("Retrieve only realm exactly matching the name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanelGeneric.add(jCBMatch, gridBagConstraints);

        jLabelType.setText("Type:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanelGeneric.add(jLabelType, gridBagConstraints);

        jCBType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));
        jCBType.setMaximumSize(new java.awt.Dimension(110, 25));
        jCBType.setMinimumSize(new java.awt.Dimension(110, 25));
        jCBType.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanelGeneric.add(jCBType, gridBagConstraints);

        jLabelTimezone.setText("Timezone:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanelGeneric.add(jLabelTimezone, gridBagConstraints);

        jCBTimezone.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));
        jCBTimezone.setMaximumSize(new java.awt.Dimension(110, 25));
        jCBTimezone.setMinimumSize(new java.awt.Dimension(110, 25));
        jCBTimezone.setPreferredSize(new java.awt.Dimension(110, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanelGeneric.add(jCBTimezone, gridBagConstraints);

        jButtonReset.setText("Reset");
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonResetMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonReset);

        jButtonSearch.setText("Search");
        jButtonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonSearch);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanelGeneric.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanelFilters.add(jPanelGeneric, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(jPanelFilters, gridBagConstraints);

        jPanelControls.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButtonCalcPop.setText("Calculate Population");
        jButtonCalcPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCalcPopMouseReleased(evt);
            }
        });
        jPanelControls.add(jButtonCalcPop);

        jButtonDelete.setText("Delete");
        jButtonDelete.setToolTipText("Delete all the selected account");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanelControls.add(jButtonDelete);

        jButtonCreate.setText("Create");
        jButtonCreate.setToolTipText("Open the window to create a new account");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        jPanelControls.add(jButtonCreate);

        jButtonSave.setText("Save");
        jButtonSave.setToolTipText("Save all the changes");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanelControls.add(jButtonSave);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanelControls, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseReleased
        if (this.worker.getState() == StateValue.STARTED) {
            this.worker.cancel(true);
        }
        this.worker = new SwingWorkerRealm();        
        
        // Fixme, spaces are allowed in realm name.
        String search = this.jTFName.getText().replaceAll("[^\\dA-Za-z ]", "");

        this.jTableRealmsModel.erase();

        this.jTableRealmsModel.setAverage(this.rs.getAveragePopulation());
        
        this.jTFName.setText(search);

        if (!this.jCBMatch.isSelected()) {
            search += "%";
        }

        if (search.isEmpty()) {
            return;
        }

        try {
            worker.setSearch(search);
            worker.execute();
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            showError("Error", "An error occured during the search activity.");
        }
    }//GEN-LAST:event_jButtonSearchMouseReleased

    private void jButtonResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseReleased
        this.jTFName.setText("");

        this.jCBMatch.setSelected(false);

        this.jCBType.setSelectedIndex(0);
        this.jCBTimezone.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonResetMouseReleased

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        deleteRealm();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        createRealm();
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        saveAll();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonCalcPopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCalcPopMouseReleased
        if (this.jTableRealms.getCellEditor() != null) {
            this.jTableRealms.getCellEditor().stopCellEditing();
        }
        
        for(Realm r : this.jTableRealmsModel.getListRealms())
        {
            boolean add = this.jTableRealmsModel.isNewRow(r);
            if(!add)
            {
                this.rs.calculatePopulation(r);                
            }            
        }
        
        // Finally, we refresh the screen.
        jButtonSearchMouseReleased(evt);
    }//GEN-LAST:event_jButtonCalcPopMouseReleased

    private void saveAll() {
        if (this.jTableRealmsModel.getListEditedRealms().isEmpty()) {
            return;
        }

        if (askConfirmation("Save", "All the edited data will be lost, are you sure ?") == JOptionPane.CANCEL_OPTION) {
            return;
        }

        if (this.jTableRealms.getCellEditor() != null) {
            this.jTableRealms.getCellEditor().stopCellEditing();
        }

        // A list to remember all error accounts.
        List<Realm> listErrorRealms = new ArrayList<>();
        for (Realm r : this.jTableRealmsModel.getListEditedRealms()) {
            boolean add = this.jTableRealmsModel.isNewRow(r);
            if (this.rs.isValid(r)) {
                Realm realm = this.rs.save(r);

                if (realm == null) {
                    showError("Error", "The system encountered an error while registering the realm information, please check your database.");
                    continue;
                }

                // If this is a new realm, it should be replicated back in the model for future update.
                if (add) {
                    this.jTableRealmsModel.removeAddedRealm(r);
                    this.jTableRealmsModel.mergeRow(this.rs.getRealm(realm.getId()));
                }
            } else {
                listErrorRealms.add(r);
                showError("Error", "The system encountered an error while validating the realm " + r.getName() + ", please verify inputs.");
            }
        }
        // Finally, we restore the list of edited realms with the error realms.
        this.jTableRealmsModel.setListEditedRealms(listErrorRealms);
    }

    private void createRealm() {
        this.jTableRealmsModel.addRow(
                new Realm(null, null, "<Edit me>", "<Enter a valid address>", 0, 0, 1000, 0, false, false, false, false, false));
    }

    private void deleteRealm() {
        int[] rows = this.jTableRealms.getSelectedRows();
        if (rows.length == 0) {
            return;
        }

        Arrays.sort(rows);

        for (int i = (rows.length - 1); i >= 0; i--) {
            try {
                if (!this.jTableRealmsModel.isNewRow(this.jTableRealmsModel.getRealm(rows[i]))) {
                    this.rs.delete(this.jTableRealmsModel.getRealm(rows[i]).getId());
                }
                this.jTableRealmsModel.removeRow(rows[i]);
            } catch (IllegalArgumentException iae) {
                showError("Oups, an error occured", iae.getMessage());
            }
        }
    }

    private int askConfirmation(String title, String message) {
        return JOptionPane.showConfirmDialog(this, message, title, JOptionPane.OK_CANCEL_OPTION);
    }

    private void showWarning(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.WARNING_MESSAGE);
    }

    private void showError(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE);
    }

    public Account getManager() {
        return manager;
    }

    public void setManager(Account manager) {
        this.manager = manager;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcPop;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JCheckBox jCBMatch;
    private javax.swing.JComboBox jCBTimezone;
    private javax.swing.JComboBox jCBType;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTimezone;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelControls;
    private javax.swing.JPanel jPanelFilters;
    private javax.swing.JPanel jPanelGeneric;
    private javax.swing.JScrollPane jScrollPaneTableAccounts;
    private javax.swing.JTextField jTFName;
    private javax.swing.JTable jTableRealms;
    private eu.jangos.manager.gui.model.table.JTableRealmModel jTableRealmsModel;
    // End of variables declaration//GEN-END:variables

    private class SwingWorkerRealm extends SwingWorker<List<Realm>, Void> {

        private String search = "";

        public void setSearch(String search) {
            if (search == null) {
                return;
            }

            this.search = search;
        }

        @Override
        protected List<Realm> doInBackground() throws Exception {
            return rs.getAllRealms(this.search, (Realmtype) jCBType.getSelectedItem(), (Realmtimezone) jCBTimezone.getSelectedItem());
        }

        @Override
        protected void done() {
            try {
                jTableRealmsModel.setListRealms(get());
            } catch (InterruptedException ex) {
                showError("Error", "An error occured during the search action.");
            } catch (ExecutionException ex) {
                showError("Error", "An error occured during the search action.");
            }
        }

    }
}
