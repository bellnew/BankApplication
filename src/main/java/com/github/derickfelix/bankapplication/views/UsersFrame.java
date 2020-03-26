/*
* The MIT License
*
* Copyright (c) 2019 Derick Felix
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
 */
package com.github.derickfelix.bankapplication.views;

import com.github.derickfelix.bankapplication.models.User;
import com.github.derickfelix.bankapplication.repositories.UserRepository;
import com.github.derickfelix.bankapplication.repositories.impl.UserRepositoryImpl;
import com.github.derickfelix.bankapplication.utilities.MessageUtility;
import com.github.derickfelix.bankapplication.utilities.ViewUtility;
import com.github.derickfelix.bankapplication.views.custom.StripedTableCellRenderer;
import com.sun.glass.events.KeyEvent;
import java.awt.Font;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;

public class UsersFrame extends javax.swing.JInternalFrame {

    private final MainForm mainForm;
    private final UserRepository repository;
    private List<User> users;
    private int lastSelected = -1;
    
    public UsersFrame(MainForm mainForm)
    {
        this.mainForm = mainForm;
        this.repository = new UserRepositoryImpl();
        initComponents();
        customSettings();
    }
    
    private void customSettings()
    {
        DefaultTableCellRenderer leftRenderer = new StripedTableCellRenderer(JLabel.LEFT);
        // Align all to left with stripped color
        mainTable.setDefaultRenderer(String.class, leftRenderer);
        mainTable.getTableHeader().setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        mainScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        tbtnEdit.setEnabled(false);
        tbtnDelete.setEnabled(false);
        tbtnExport.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainScroll = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        toolbar = new javax.swing.JToolBar();
        tbtnSearch = new javax.swing.JButton();
        tbtnAdd = new javax.swing.JButton();
        tbtnEdit = new javax.swing.JButton();
        tbtnDelete = new javax.swing.JButton();
        tbtnExport = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        paneInputs = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        statusPanel = new javax.swing.JPanel();
        lblLine = new javax.swing.JLabel();
        lblSelectedLine = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Zwei Bank Application - Users");

        mainTable.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Code", "Name", "Username", "Role"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        mainTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        mainTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        mainTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                mainTableMouseClicked(evt);
            }
        });
        mainScroll.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0)
        {
            mainTable.getColumnModel().getColumn(0).setMinWidth(100);
            mainTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            mainTable.getColumnModel().getColumn(0).setMaxWidth(150);
            mainTable.getColumnModel().getColumn(1).setMinWidth(200);
            mainTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            mainTable.getColumnModel().getColumn(1).setMaxWidth(250);
            mainTable.getColumnModel().getColumn(2).setMinWidth(200);
            mainTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            mainTable.getColumnModel().getColumn(2).setMaxWidth(250);
            mainTable.getColumnModel().getColumn(3).setMinWidth(100);
            mainTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            mainTable.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        toolbar.setFloatable(false);
        toolbar.setRollover(true);

        tbtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        tbtnSearch.setToolTipText("Search");
        tbtnSearch.setFocusable(false);
        tbtnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tbtnSearchActionPerformed(evt);
            }
        });
        toolbar.add(tbtnSearch);

        tbtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        tbtnAdd.setToolTipText("Add New");
        tbtnAdd.setFocusable(false);
        tbtnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tbtnAddActionPerformed(evt);
            }
        });
        toolbar.add(tbtnAdd);

        tbtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        tbtnEdit.setToolTipText("Edit Item");
        tbtnEdit.setFocusable(false);
        tbtnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tbtnEditActionPerformed(evt);
            }
        });
        toolbar.add(tbtnEdit);

        tbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        tbtnDelete.setToolTipText("Delete Item");
        tbtnDelete.setFocusable(false);
        tbtnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tbtnDeleteActionPerformed(evt);
            }
        });
        toolbar.add(tbtnDelete);

        tbtnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        tbtnExport.setToolTipText("Export Data");
        tbtnExport.setFocusable(false);
        tbtnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnExport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tbtnExportActionPerformed(evt);
            }
        });
        toolbar.add(tbtnExport);

        btnSearch.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        paneInputs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        lblSearch.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        lblSearch.setText("Search");

        txtSearch.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout paneInputsLayout = new javax.swing.GroupLayout(paneInputs);
        paneInputs.setLayout(paneInputsLayout);
        paneInputsLayout.setHorizontalGroup(
            paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch)
                    .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneInputsLayout.setVerticalGroup(
            paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInputsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblLine.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        lblLine.setText("Line:");

        lblSelectedLine.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        lblSelectedLine.setText("0/0");

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelectedLine, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLine)
                    .addComponent(lblSelectedLine))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toolbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose))
                    .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSearch))
                .addGap(12, 12, 12))
        );

        setBounds(300, 100, 730, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tbtnSearchActionPerformed
    {//GEN-HEADEREND:event_tbtnSearchActionPerformed
        search();
    }//GEN-LAST:event_tbtnSearchActionPerformed

    private void tbtnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tbtnAddActionPerformed
    {//GEN-HEADEREND:event_tbtnAddActionPerformed
        mainForm.addInternalFrame(new UsersFrameForm(mainForm));
    }//GEN-LAST:event_tbtnAddActionPerformed

    private void tbtnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tbtnEditActionPerformed
    {//GEN-HEADEREND:event_tbtnEditActionPerformed
        edit();
    }//GEN-LAST:event_tbtnEditActionPerformed

    private void tbtnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tbtnDeleteActionPerformed
    {//GEN-HEADEREND:event_tbtnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_tbtnDeleteActionPerformed

    private void tbtnExportActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tbtnExportActionPerformed
    {//GEN-HEADEREND:event_tbtnExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnExportActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void mainTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mainTableMouseClicked
    {//GEN-HEADEREND:event_mainTableMouseClicked
        tbtnEdit.setEnabled(true);
        tbtnDelete.setEnabled(true);
        tbtnExport.setEnabled(true);
        
        if (lastSelected == mainTable.getSelectedRow()) {
            edit();
        }
        
        lastSelected = mainTable.getSelectedRow();
    }//GEN-LAST:event_mainTableMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtSearchKeyReleased
    {//GEN-HEADEREND:event_txtSearchKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void search()
    {
        tbtnEdit.setEnabled(false);
        tbtnDelete.setEnabled(false);
        tbtnExport.setEnabled(false);

        setCursor(ViewUtility.WAIT_CURSOR);
        ViewUtility.clearTable(mainTable);
        String term = txtSearch.getText();
        users = repository.search(term);

        if (users.isEmpty()) {
            MessageUtility.info(mainForm, "No results found!");
        }

        ViewUtility.addRowsToTable(convertToRows(users), mainTable);
        setCursor(ViewUtility.DEFAULT_CURSOR);
    }
    
    private void edit()
    {
        User user = users.get(mainTable.getSelectedRow());
        mainForm.addInternalFrame(new UsersFrameForm(mainForm).setUser(user));
    }
    
    private void delete()
    {
        int option = MessageUtility.confirmWarning(mainForm, "Are you sure you want to delete it?");
        
        if (option == JOptionPane.YES_OPTION) {
            setCursor(ViewUtility.WAIT_CURSOR);
            repository.find(users.get(mainTable.getSelectedRow()).getId()).ifPresent(user -> {
                repository.deleteById(user.getId());

                MessageUtility.info("User deleted successfully!");
                search();
            });   
            setCursor(ViewUtility.DEFAULT_CURSOR);
        }
    }
    
    private List<String[]> convertToRows(List<User> users)
    {
        return users.stream().map(user -> {
            String[] row = new String[4];
            row[0] = user.getId().toString();
            row[1] = user.getName();
            row[2] = user.getUsername();
            row[3] = user.getRole();
            
            return row;
        }).collect(Collectors.toList());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSelectedLine;
    private javax.swing.JScrollPane mainScroll;
    private javax.swing.JTable mainTable;
    private javax.swing.JPanel paneInputs;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JButton tbtnAdd;
    private javax.swing.JButton tbtnDelete;
    private javax.swing.JButton tbtnEdit;
    private javax.swing.JButton tbtnExport;
    private javax.swing.JButton tbtnSearch;
    private javax.swing.JToolBar toolbar;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
