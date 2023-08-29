/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.HrDAO;
import trandpl.dao.JobDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.JobPojo;




public class HrEditJobFrame extends javax.swing.JFrame {

    private JobPojo job;
    public HrEditJobFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUser.getName());
        
        
    }
    public HrEditJobFrame(JobPojo job){
        this();
        this.job=job;
        showJobDetails();
        
    }
    private void showJobDetails(){
        String companyName="";
        try{
           companyName=HrDAO.getCompanyNameById(job.getHrId());           
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"SQL Error!","DB Problem,",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
        lblJobId.setText(job.getJobId());
        txtJobTitle.setText(job.getJobTitle());
        txtCompanyName.setText(companyName);
        String []allSkills=job.getTags().split(",");
        txtSkill1.setText(allSkills[0]);
        txtSkill2.setText(allSkills[1]);
        txtSkill3.setText(allSkills[2]);
        txtSkill4.setText(allSkills[3]);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtSkill4 = new javax.swing.JTextField();
        txtJobTitle = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DipperSeperator1 = new javax.swing.JSeparator();
        DipperSeperator2 = new javax.swing.JSeparator();
        txtSkill1 = new javax.swing.JTextField();
        txtSkill2 = new javax.swing.JTextField();
        txtSkill3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DipperSeperator3 = new javax.swing.JSeparator();
        lblJobId = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Company Name ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 110, 30));

        txtSkill4.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill4.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtSkill4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        jPanel1.add(txtSkill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 190, 30));

        txtJobTitle.setBackground(new java.awt.Color(173, 192, 234));
        txtJobTitle.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtJobTitle.setBorder(null);
        jPanel1.add(txtJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 445, 310, 30));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblName.setText("Neelesh");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 265, 190, 40));

        txtCompanyName.setEditable(false);
        txtCompanyName.setBackground(new java.awt.Color(173, 192, 234));
        txtCompanyName.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtCompanyName.setBorder(null);
        jPanel1.add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 445, 310, 30));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel2.setText("Skills Required :-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 130, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 970, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 970, 200));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 110, -1));

        btnLogout.setBackground(new java.awt.Color(173, 192, 234));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 110, -1));

        btnSaveChanges.setBackground(new java.awt.Color(173, 192, 234));
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 250, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 340, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 340, 40));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel4.setText("Welcome , ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 110, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JobPng.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 290, 320));
        jPanel1.add(DipperSeperator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 1030, 20));
        jPanel1.add(DipperSeperator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 700, 20));

        txtSkill1.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill1.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtSkill1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        jPanel1.add(txtSkill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 190, 30));

        txtSkill2.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill2.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtSkill2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        jPanel1.add(txtSkill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 190, 30));

        txtSkill3.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill3.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtSkill3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        jPanel1.add(txtSkill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 190, 30));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel7.setText("Job Title");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 80, 20));
        jPanel1.add(DipperSeperator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 700, 10));

        lblJobId.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(lblJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 150, 30));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel9.setText("Job - ID :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 70, 30));

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new HrChooseJobForEditingFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed
    private boolean validateInputs(){
        if(txtJobTitle.getText().trim().isEmpty()||txtSkill1.getText().trim().isEmpty()||txtSkill2.getText().trim().isEmpty()||txtSkill3.getText().trim().isEmpty()||txtSkill4.getText().trim().isEmpty())
            return false;
        return true;
    }
    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null,"Please Fill All The Fields","Empty Data!!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        job.setJobTitle(txtJobTitle.getText().trim());
        job.setTags(txtSkill1.getText().trim()+","+txtSkill2.getText().trim()+","+txtSkill3.getText().trim()+","+txtSkill4.getText().trim());
        try{
            boolean result=JobDAO.editJobByJobId(job);
            if(result){
                JOptionPane.showMessageDialog(null,"Job Successfully Edited","Success",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
             JOptionPane.showMessageDialog(null,"Job Not Edited","Editing Failed!",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"SQL Error!","DB Problem,",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
        
        
    }//GEN-LAST:event_btnSaveChangesActionPerformed

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
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new HrEditJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator DipperSeperator1;
    private javax.swing.JSeparator DipperSeperator2;
    private javax.swing.JSeparator DipperSeperator3;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblJobId;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtJobTitle;
    private javax.swing.JTextField txtSkill1;
    private javax.swing.JTextField txtSkill2;
    private javax.swing.JTextField txtSkill3;
    private javax.swing.JTextField txtSkill4;
    // End of variables declaration//GEN-END:variables
}
