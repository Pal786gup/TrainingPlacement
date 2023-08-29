/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trandpl.dao.JobDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.JobPojo;




public class HrRemoveJobFrame extends javax.swing.JFrame {

    DefaultTableModel model;
    public HrRemoveJobFrame() {
        initComponents();
        lblName.setText(CurrentUser.getName());
        this.setLocationRelativeTo(null);
        model=(DefaultTableModel)tblAllJobs.getModel();
        loadJobDetails();     
        
    }
    private void loadJobDetails(){
        try{
            List<JobPojo> allJobsList=JobDAO.getAllActiveJobsByCurrentHr(CurrentUser.getId());
            for(JobPojo job:allJobsList){
                Vector<String> row=new Vector<>();
                row.add(job.getJobId());
                row.add(job.getJobTitle());
                row.add(job.getTags());
                row.add(String.valueOf(job.getStatus()));
                model.addRow(row);
            }
            if(allJobsList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No Job Present","Job Not Present",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"SQL Error!","DB Problem,",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRemoveJob = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        UpperSeperator = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        AddNewHrLBL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameLbl1 = new javax.swing.JLabel();
        DipperSeperator = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllJobs = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemoveJob.setBackground(new java.awt.Color(173, 192, 234));
        btnRemoveJob.setText("Remove JOB");
        btnRemoveJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 250, 30));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 110, -1));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblName.setText("Neelesh");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 265, 190, 40));
        jPanel1.add(UpperSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 970, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 970, 200));

        btnLogout.setBackground(new java.awt.Color(173, 192, 234));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 110, -1));

        AddNewHrLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddNewHrLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new/removeJob.png"))); // NOI18N
        AddNewHrLBL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(AddNewHrLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 210, 220));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel4.setText("Welcome , ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 110, 40));

        nameLbl1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        nameLbl1.setText("All Job's -");
        jPanel1.add(nameLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 110, 30));
        jPanel1.add(DipperSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 1030, 20));

        tblAllJobs.setBackground(new java.awt.Color(173, 192, 234));
        tblAllJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job-Id", "Job Title", "Skills", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAllJobs.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblAllJobs);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 720, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveJobActionPerformed
        int row=tblAllJobs.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
        String jobId=(String)tblAllJobs.getValueAt(row, 0);
        int resp=JOptionPane.showConfirmDialog(null, "Are you sure you want to remove job "+jobId+" ?","Delete ?",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(resp==JOptionPane.OK_OPTION){
            try{
                boolean result=JobDAO.removeJobByJobId(jobId);
                if(result){
                    model.removeRow(row);
                    JOptionPane.showMessageDialog(null,"Job Deleted!","Deletion Successful!",JOptionPane.INFORMATION_MESSAGE);
                    if(model.getRowCount()==0){
                        btnRemoveJob.setEnabled(false);                        
                    }
                    return;
                }
                 JOptionPane.showMessageDialog(null,"Job Not Deleted!","Deletion UnSuccessful!",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"SQL Error!","DB Problem,",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnRemoveJobActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new HrJobOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new HrRemoveJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddNewHrLBL;
    private javax.swing.JSeparator DipperSeperator;
    private javax.swing.JSeparator UpperSeperator;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRemoveJob;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JTable tblAllJobs;
    // End of variables declaration//GEN-END:variables
}
