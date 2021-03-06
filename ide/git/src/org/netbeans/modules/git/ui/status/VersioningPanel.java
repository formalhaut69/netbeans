/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.git.ui.status;

import javax.swing.*;

/**
 * The main class of the Synchronize view, shows and acts on set of file roots. 
 * 
 * @author Maros Sandor 
 */
class VersioningPanel extends JPanel {
    
    /**
     * Creates a new Synchronize Panel managed by the given versioning system.
     *  
     * @param parent enclosing top component
     */ 
    public VersioningPanel () {
        initComponents();
        
        if( "Aqua".equals( UIManager.getLookAndFeel().getID() ) ) {             // NOI18N
            setBackground(UIManager.getColor("NbExplorerView.background")); // NOI18N
            jPanel2.setBackground(UIManager.getColor("NbExplorerView.background")); // NOI18N
            jPanel3.setBackground(UIManager.getColor("NbExplorerView.background")); // NOI18N
            jPanel4.setBackground(UIManager.getColor("NbExplorerView.background")); // NOI18N
            jPanel5.setBackground(UIManager.getColor("NbExplorerView.background")); // NOI18N
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroupModes = new javax.swing.ButtonGroup();
        viewButtonGroup = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        jPanel2.setFloatable(false);
        jPanel2.setRollover(true);

        btnGroupModes.add(tgbHeadVsWorking);
        tgbHeadVsWorking.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/head_vs_working.png", false)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/netbeans/modules/git/ui/status/Bundle"); // NOI18N
        tgbHeadVsWorking.setToolTipText(bundle.getString("CTL_Synchronize_Action_HeadVsWorking_Tooltip")); // NOI18N
        tgbHeadVsWorking.setFocusable(false);
        jPanel2.add(tgbHeadVsWorking);
        tgbHeadVsWorking.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(VersioningPanel.class, "CTL_Synchronize_Action_HeadVsWorking_Text")); // NOI18N

        btnGroupModes.add(tgbHeadVsIndex);
        tgbHeadVsIndex.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/head_vs_index.png", false)); // NOI18N
        tgbHeadVsIndex.setToolTipText(bundle.getString("CTL_Synchronize_Action_HeadVsIndex_Tooltip")); // NOI18N
        tgbHeadVsIndex.setFocusable(false);
        jPanel2.add(tgbHeadVsIndex);
        tgbHeadVsIndex.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(VersioningPanel.class, "CTL_Synchronize_Action_HeadVsIndex_Text")); // NOI18N

        btnGroupModes.add(tgbIndexVsWorking);
        tgbIndexVsWorking.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/index_vs_working.png", false)); // NOI18N
        tgbIndexVsWorking.setToolTipText(bundle.getString("CTL_Synchronize_Action_IndexVsWorking_Tooltip")); // NOI18N
        tgbIndexVsWorking.setFocusable(false);
        jPanel2.add(tgbIndexVsWorking);
        tgbIndexVsWorking.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(VersioningPanel.class, "CTL_Synchronize_Action_IndexVsWorking_Text")); // NOI18N

        jPanel4.setMaximumSize(new java.awt.Dimension(40, 32767));
        jPanel4.setOpaque(false);
        jPanel2.add(jPanel4);

        viewButtonGroup.add(listButton);
        listButton.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/file_view.png", false)); // NOI18N
        listButton.setToolTipText(bundle.getString("CTL_listButton.toolTipText")); // NOI18N
        listButton.setFocusable(false);
        listButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(listButton);

        viewButtonGroup.add(treeButton);
        treeButton.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/logical_view.png", false)); // NOI18N
        treeButton.setToolTipText(bundle.getString("CTL_treeButton.toolTipText")); // NOI18N
        treeButton.setFocusable(false);
        treeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(treeButton);

        jPanel5.setMaximumSize(new java.awt.Dimension(40, 32767));
        jPanel5.setOpaque(false);
        jPanel2.add(jPanel5);

        btnRefresh.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/refresh.png", false)); // NOI18N
        btnRefresh.setToolTipText(bundle.getString("CTL_Synchronize_Action_Refresh_Tooltip")); // NOI18N
        btnRefresh.setFocusable(false);
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btnRefresh);
        btnRefresh.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(VersioningPanel.class, "CTL_Synchronize_Action_Refresh_Text")); // NOI18N

        btnDiff.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/diff.png", false)); // NOI18N
        btnDiff.setToolTipText(bundle.getString("CTL_Synchronize_Action_Diff_Tooltip")); // NOI18N
        btnDiff.setFocusable(false);
        jPanel2.add(btnDiff);
        btnDiff.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(VersioningPanel.class, "CTL_Synchronize_Action_Diff_Text")); // NOI18N

        jPanel3.setMaximumSize(new java.awt.Dimension(20, 32767));
        jPanel3.setOpaque(false);
        jPanel2.add(jPanel3);

        btnRevert.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/get_clean.png", false)); // NOI18N
        btnRevert.setToolTipText(bundle.getString("CTL_Synchronize_Action_CheckoutPaths_Tooltip")); // NOI18N
        btnRevert.setFocusable(false);
        jPanel2.add(btnRevert);
        btnRevert.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(VersioningPanel.class, "CTL_Synchronize_Action_CheckoutPaths_Text")); // NOI18N

        btnCommit.setIcon(org.openide.util.ImageUtilities.loadImageIcon("/org/netbeans/modules/git/resources/icons/commit.png", false)); // NOI18N
        btnCommit.setToolTipText(bundle.getString("CTL_Synchronize_Action_Commit_Tooltip")); // NOI18N
        btnCommit.setFocusable(false);
        jPanel2.add(btnCommit);
        btnCommit.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(VersioningPanel.class, "CTL_Synchronize_Action_Commit_Text")); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    final javax.swing.JButton btnCommit = new javax.swing.JButton();
    final javax.swing.JButton btnDiff = new javax.swing.JButton();
    private javax.swing.ButtonGroup btnGroupModes;
    final javax.swing.JButton btnRefresh = new javax.swing.JButton();
    final javax.swing.JButton btnRevert = new javax.swing.JButton();
    final javax.swing.JToolBar jPanel2 = new javax.swing.JToolBar();
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    final javax.swing.JToggleButton listButton = new javax.swing.JToggleButton();
    final javax.swing.JToggleButton tgbHeadVsIndex = new javax.swing.JToggleButton();
    final javax.swing.JToggleButton tgbHeadVsWorking = new javax.swing.JToggleButton();
    final javax.swing.JToggleButton tgbIndexVsWorking = new javax.swing.JToggleButton();
    final javax.swing.JToggleButton treeButton = new javax.swing.JToggleButton();
    private javax.swing.ButtonGroup viewButtonGroup;
    // End of variables declaration//GEN-END:variables
}
