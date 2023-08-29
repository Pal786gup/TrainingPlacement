/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;


import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import trandpl.dao.UserDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.HrPojo;

/**
 *
 * @author Neel_Esh
 */
public class AdminModifyHrFrame extends javax.swing.JFrame {

    private Map<String,HrPojo> allHr;
    private String password;
    public AdminModifyHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUser.getName());
        loadHrDetails();
    }
    private boolean validateInputs(){
        char []pwd=txtPassword.getPassword();
        char []repwd=txtRePassword.getPassword();
        if(pwd.length <4 || repwd.length<4){
            JOptionPane.showMessageDialog(null,"Passwords must be atleast 4 characters long");
            return false;
        }
        password=String.valueOf(pwd);
        String repassword=String.valueOf(repwd);
        if(password.equals(repassword)==false){
            JOptionPane.showMessageDialog(null,"Passwords not matching!");
            return false;
        }
        return true;
    }
    private void clearText(){
        txtPassword.setText("");
        txtRePassword.setText("");
        jcAllUserId.setSelectedIndex(0);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtHrId = new javax.swing.JTextField();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        btnModifyHr = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        UpperSeperator = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        AddNewHrLBL = new javax.swing.JLabel();
        passBar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        mailLbl = new javax.swing.JLabel();
        mailBar = new javax.swing.JLabel();
        lblHrName = new javax.swing.JLabel();
        cnfPassLbl = new javax.swing.JLabel();
        cnfPassBar = new javax.swing.JLabel();
        DipperSeperator = new javax.swing.JSeparator();
        MobLbl1 = new javax.swing.JLabel();
        HrLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jcAllUserId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHrId.setEditable(false);
        txtHrId.setBackground(new java.awt.Color(173, 192, 234));
        txtHrId.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtHrId.setBorder(null);
        txtHrId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHrIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtHrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 395, 310, 30));

        txtRePassword.setBackground(new java.awt.Color(173, 192, 234));
        txtRePassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRePassword.setBorder(null);
        jPanel1.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 565, 300, 30));

        txtPassword.setBackground(new java.awt.Color(173, 192, 234));
        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 565, 300, 30));

        btnModifyHr.setBackground(new java.awt.Color(173, 192, 234));
        btnModifyHr.setText("Modify Changes of HR");
        btnModifyHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnModifyHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 250, 30));

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
        AddNewHrLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modify-emp.png"))); // NOI18N
        AddNewHrLBL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(AddNewHrLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 210, 220));

        passBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(passBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 340, 40));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel4.setText("Welcome , ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 110, 40));

        passLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        passLbl.setText("New Password");
        jPanel1.add(passLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 120, 30));

        mailLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        mailLbl.setText("Hr id");
        jPanel1.add(mailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 110, 30));

        mailBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mailBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(mailBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 340, 40));

        lblHrName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel1.add(lblHrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 210, 30));

        cnfPassLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        cnfPassLbl.setText("Confirm Password");
        jPanel1.add(cnfPassLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 150, 30));

        cnfPassBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cnfPassBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(cnfPassBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 340, 40));
        jPanel1.add(DipperSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 1030, 20));

        MobLbl1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        MobLbl1.setText("User id");
        jPanel1.add(MobLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 110, 30));

        HrLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        HrLbl.setText("Hr Name -");
        jPanel1.add(HrLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 90, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 492, 310, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        jcAllUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAllUserIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcAllUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 240, 30));

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

    private void txtHrIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHrIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHrIdActionPerformed

    private void btnModifyHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyHrActionPerformed
       if(!validateInputs()){
           return;
       }
       try{
           boolean result=UserDAO.updatePwd(jcAllUserId.getSelectedItem().toString(), password);
           if(result){
               JOptionPane.showMessageDialog(null,"Password changed succesfully","Done!",JOptionPane.INFORMATION_MESSAGE);
           }
           else{
               JOptionPane.showMessageDialog(null,"Sorry! Could not change the password","Unsuccessfull",JOptionPane.ERROR_MESSAGE);
           }
           clearText();
       }
       catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
         }     
                    
        
    }//GEN-LAST:event_btnModifyHrActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jcAllUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAllUserIdActionPerformed
       String userId=(String)jcAllUserId.getSelectedItem();
       HrPojo hr=allHr.get(userId);
       txtHrId.setText(hr.getHrId());
       lblHrName.setText(hr.getHrName());
    }//GEN-LAST:event_jcAllUserIdActionPerformed

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
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminModifyHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddNewHrLBL;
    private javax.swing.JSeparator DipperSeperator;
    private javax.swing.JLabel HrLbl;
    private javax.swing.JLabel MobLbl1;
    private javax.swing.JSeparator UpperSeperator;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModifyHr;
    private javax.swing.JLabel cnfPassBar;
    private javax.swing.JLabel cnfPassLbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcAllUserId;
    private javax.swing.JLabel lblHrName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel mailBar;
    private javax.swing.JLabel mailLbl;
    private javax.swing.JLabel passBar;
    private javax.swing.JLabel passLbl;
    private javax.swing.JTextField txtHrId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    // End of variables declaration//GEN-END:variables

    private void loadHrDetails() {
        try{
            allHr=UserDAO.getAllHrList();
            Set <String> keys=allHr.keySet();
            for(String userId:keys){
                jcAllUserId.addItem(userId);
            }
        }
        catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
         } 
    }
}
