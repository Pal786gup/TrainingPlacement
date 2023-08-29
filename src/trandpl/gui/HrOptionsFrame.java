/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import trandpl.pojo.CurrentUser;


public class HrOptionsFrame extends javax.swing.JFrame {

    
    public HrOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUser.getName());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnViewAllParticipants = new javax.swing.JButton();
        btnViewTestResult = new javax.swing.JButton();
        btnJobModule = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnViewAllOpenJobs = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewAllParticipants.setBackground(new java.awt.Color(173, 192, 234));
        btnViewAllParticipants.setText("View All Participants");
        btnViewAllParticipants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllParticipantsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAllParticipants, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 300, 40));

        btnViewTestResult.setBackground(new java.awt.Color(173, 192, 234));
        btnViewTestResult.setText("View Test Result");
        btnViewTestResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTestResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewTestResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 300, 40));

        btnJobModule.setBackground(new java.awt.Color(173, 192, 234));
        btnJobModule.setText("Job Module");
        btnJobModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJobModuleActionPerformed(evt);
            }
        });
        jPanel1.add(btnJobModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 300, 40));

        btnLogout.setBackground(new java.awt.Color(173, 192, 234));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, 110, -1));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblName.setText("Neelesh");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 265, 190, 40));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel2.setText("Welcome , ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 110, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 970, 10));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worlp-map-in-black-h9i.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 590, 360));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 970, 200));

        btnViewAllOpenJobs.setBackground(new java.awt.Color(173, 192, 234));
        btnViewAllOpenJobs.setText("View All Open Jobs");
        btnViewAllOpenJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllOpenJobsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAllOpenJobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 300, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAllParticipantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllParticipantsActionPerformed
        // TODO add your handling code here:
        //new HrViewAllParticipantsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewAllParticipantsActionPerformed

    private void btnViewTestResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTestResultActionPerformed
        // TODO add your handling code here:
        //new HrViewAllQualifiedParticipantsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewTestResultActionPerformed

    private void btnJobModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobModuleActionPerformed
        // TODO add your handling code here:
        new HrJobOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJobModuleActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewAllOpenJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllOpenJobsActionPerformed
        // TODO add your handling code here:
        //new HrViewAllOpenJobFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewAllOpenJobsActionPerformed

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
            java.util.logging.Logger.getLogger(HrOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJobModule;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewAllOpenJobs;
    private javax.swing.JButton btnViewAllParticipants;
    private javax.swing.JButton btnViewTestResult;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
