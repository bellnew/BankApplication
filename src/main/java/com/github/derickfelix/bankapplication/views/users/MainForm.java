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
package com.github.derickfelix.bankapplication.views.users;

import com.github.derickfelix.bankapplication.securities.AuthSecurity;
import com.github.derickfelix.bankapplication.utilities.MessageUtility;
import com.github.derickfelix.bankapplication.utilities.ViewUtility;
import com.github.derickfelix.bankapplication.views.LoginForm;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MainForm extends javax.swing.JFrame {

    public MainForm()
    {
        initComponents();
        customSettings();
    }
    
    private void customSettings()
    {
        if (!AuthSecurity.isUserAuthenticated()) {
            MessageUtility.warning("User not authenticated!");
            dispose();
        }
        
        ViewUtility.addIconTo(this);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        LocalDate now = LocalDate.now();
        lblInfoDate.setText(now.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        lblUsername.setText(AuthSecurity.getUser().getName().toUpperCase());
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

        desktopPane = new com.github.derickfelix.bankapplication.views.custom.BackgroundDesktopPane();
        paneCompany = new javax.swing.JPanel();
        lblCompany = new javax.swing.JLabel();
        paneUsername = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        paneAppVersion = new javax.swing.JPanel();
        lblAppVersion = new javax.swing.JLabel();
        paneInfoDate = new javax.swing.JPanel();
        lblInfoDate = new javax.swing.JLabel();
        appMenubar = new javax.swing.JMenuBar();
        menuAccount = new javax.swing.JMenu();
        mniUsers = new javax.swing.JMenuItem();
        mniCustomers = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        mniAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Zwei Bank Application");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        paneCompany.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, null, null));

        lblCompany.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompany.setText("ZWEI BANK APPLICATION");

        javax.swing.GroupLayout paneCompanyLayout = new javax.swing.GroupLayout(paneCompany);
        paneCompany.setLayout(paneCompanyLayout);
        paneCompanyLayout.setHorizontalGroup(
            paneCompanyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCompanyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneCompanyLayout.setVerticalGroup(
            paneCompanyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCompanyLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCompany)
                .addGap(4, 4, 4))
        );

        paneUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, null, null));

        lblUsername.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("LOGGED IN USER");

        javax.swing.GroupLayout paneUsernameLayout = new javax.swing.GroupLayout(paneUsername);
        paneUsername.setLayout(paneUsernameLayout);
        paneUsernameLayout.setHorizontalGroup(
            paneUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneUsernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneUsernameLayout.setVerticalGroup(
            paneUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneUsernameLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblUsername)
                .addGap(4, 4, 4))
        );

        paneAppVersion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, null, null));

        lblAppVersion.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        lblAppVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAppVersion.setText("VERSION 2.0.0");

        javax.swing.GroupLayout paneAppVersionLayout = new javax.swing.GroupLayout(paneAppVersion);
        paneAppVersion.setLayout(paneAppVersionLayout);
        paneAppVersionLayout.setHorizontalGroup(
            paneAppVersionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAppVersionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAppVersion, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneAppVersionLayout.setVerticalGroup(
            paneAppVersionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAppVersionLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblAppVersion)
                .addGap(4, 4, 4))
        );

        paneInfoDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, null, null));

        lblInfoDate.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        lblInfoDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoDate.setText("01/01/2001");

        javax.swing.GroupLayout paneInfoDateLayout = new javax.swing.GroupLayout(paneInfoDate);
        paneInfoDate.setLayout(paneInfoDateLayout);
        paneInfoDateLayout.setHorizontalGroup(
            paneInfoDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneInfoDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoDate, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneInfoDateLayout.setVerticalGroup(
            paneInfoDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneInfoDateLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblInfoDate)
                .addGap(4, 4, 4))
        );

        menuAccount.setText("Account");

        mniUsers.setText("Users");
        mniUsers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mniUsersActionPerformed(evt);
            }
        });
        menuAccount.add(mniUsers);

        mniCustomers.setText("Customers");
        mniCustomers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mniCustomersActionPerformed(evt);
            }
        });
        menuAccount.add(mniCustomers);

        mniLogout.setText("Logout");
        mniLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mniLogoutActionPerformed(evt);
            }
        });
        menuAccount.add(mniLogout);

        appMenubar.add(menuAccount);

        menuHelp.setText("Help");

        mniAbout.setText("About");
        menuHelp.add(mniAbout);

        appMenubar.add(menuHelp);

        setJMenuBar(appMenubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(paneCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneAppVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneInfoDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneInfoDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(paneAppVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paneCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paneUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        int res = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Zwei Bank Application", JOptionPane.YES_NO_OPTION);
        
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void mniUsersActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniUsersActionPerformed
    {//GEN-HEADEREND:event_mniUsersActionPerformed
        addInternalFrame(new UsersFrame(this));
    }//GEN-LAST:event_mniUsersActionPerformed

    private void mniCustomersActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniCustomersActionPerformed
    {//GEN-HEADEREND:event_mniCustomersActionPerformed
        addInternalFrame(new CustomersFrame(this));
    }//GEN-LAST:event_mniCustomersActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniLogoutActionPerformed
    {//GEN-HEADEREND:event_mniLogoutActionPerformed
        AuthSecurity.logout();
        new LoginForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_mniLogoutActionPerformed

    public void addInternalFrame(javax.swing.JInternalFrame frame)
    {
        desktopPane.add(frame);
        frame.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar appMenubar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblAppVersion;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblInfoDate;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu menuAccount;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniCustomers;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniUsers;
    private javax.swing.JPanel paneAppVersion;
    private javax.swing.JPanel paneCompany;
    private javax.swing.JPanel paneInfoDate;
    private javax.swing.JPanel paneUsername;
    // End of variables declaration//GEN-END:variables
}
