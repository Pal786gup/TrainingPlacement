/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;



import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import trandpl.dao.ParticipantDAO;
import trandpl.pojo.ParticipantPojo;

public class SignUpFrame extends javax.swing.JFrame {

    
    private File file;
    private String pwd,cnfpwd;
    public SignUpFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadId();
       
    }
    private void loadId(){
        try{
            int pId=ParticipantDAO.getNewParticipantId();
            lblPid.setText("P-"+pId);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error In Generating HrID",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private boolean validateInputs(){
        char[]chpwd=txtPwd.getPassword();
        char[]chnfPwd=txtCnfPwd.getPassword();
        if(txtName.getText().trim().isEmpty()||txtMail.getText().trim().isEmpty()||txtPhone.getText().trim().isEmpty()||chpwd.length==0||chnfPwd.length==0||txtSkill1.getText().trim().isEmpty()||txtSkill2.getText().trim().isEmpty()||txtSkill3.getText().trim().isEmpty()||txtSkill4.getText().trim().isEmpty()||txtFilePath.getText().trim().isEmpty()||txtQualification.getText().trim().isEmpty())
            return false;
        return true;
    }
    private void clearAll(){
        txtName.setText("");
        txtPhone.setText("");
        txtMail.setText("");
        txtSkill1.setText("");
        txtSkill2.setText("");
        txtSkill3.setText("");
        txtSkill4.setText("");
        txtPwd.setText("");
        txtCnfPwd.setText("");
        txtFilePath.setText("");
    }
    private boolean matchPasswords(){
        pwd =String.valueOf(txtPwd.getPassword());
        cnfpwd=String.valueOf(txtCnfPwd.getPassword());
        return pwd.equals(cnfpwd);
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
        txtName = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        txtMail = new javax.swing.JTextField();
        txtCnfPwd = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPid = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        PhnLbl3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPhone = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        BrowseFileBtn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtSkill1 = new javax.swing.JTextField();
        txtSkill3 = new javax.swing.JTextField();
        txtSkill4 = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        DipperSeperator2 = new javax.swing.JSeparator();
        DipperSeperator3 = new javax.swing.JSeparator();
        btnCreateAccount = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();
        DipperSeperator4 = new javax.swing.JSeparator();
        txtFilePath = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSkill2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(173, 192, 234));
        txtName.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 315, 410, 30));

        txtPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtPwd.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtPwd.setBorder(null);
        jPanel1.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 615, 400, 30));

        txtMail.setBackground(new java.awt.Color(173, 192, 234));
        txtMail.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtMail.setBorder(null);
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 315, 410, 30));

        txtCnfPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtCnfPwd.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtCnfPwd.setBorder(null);
        jPanel1.add(txtCnfPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 615, 400, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 450, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 450, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 450, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 450, 40));

        jLabel6.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel6.setText("Email :-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel4.setText("PassWord :-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 110, -1));

        lblPid.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        lblPid.setText("P-101");
        jPanel1.add(lblPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 280, -1));

        jLabel15.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel15.setText("Qualification :-");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jLabel16.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel16.setText("Confirm PassWord :-");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, -1, -1));

        jLabel19.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel19.setText("Name :-");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 420, 10));

        jLabel21.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel21.setText("Participant id :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        PhnLbl3.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        PhnLbl3.setText("Upload Resume");
        jPanel1.add(PhnLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 200));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 970, 10));

        txtPhone.setBackground(new java.awt.Color(173, 192, 234));
        txtPhone.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtPhone.setBorder(null);
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 385, 410, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 450, 40));

        BrowseFileBtn.setBackground(new java.awt.Color(174, 192, 236));
        BrowseFileBtn.setText("Browse File");
        BrowseFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseFileBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BrowseFileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 110, 30));

        jLabel23.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel23.setText("Mobile no :-");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        txtSkill1.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill1.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtSkill1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        txtSkill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkill1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtSkill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 465, 190, 30));

        txtSkill3.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill3.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtSkill3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        txtSkill3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkill3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtSkill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 465, 190, 30));

        txtSkill4.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill4.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtSkill4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        txtSkill4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkill4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtSkill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 465, 190, 30));

        txtQualification.setBackground(new java.awt.Color(173, 192, 234));
        txtQualification.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtQualification.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        txtQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificationActionPerformed(evt);
            }
        });
        jPanel1.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 950, 30));
        jPanel1.add(DipperSeperator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 950, 20));
        jPanel1.add(DipperSeperator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 950, 20));

        btnCreateAccount.setBackground(new java.awt.Color(173, 192, 234));
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 670, 220, 30));

        backBtn1.setBackground(new java.awt.Color(173, 192, 234));
        backBtn1.setText("Login Page");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 670, 160, 30));
        jPanel1.add(DipperSeperator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 950, 20));

        txtFilePath.setEditable(false);
        txtFilePath.setBackground(new java.awt.Color(173, 192, 234));
        txtFilePath.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtFilePath.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        txtFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilePathActionPerformed(evt);
            }
        });
        jPanel1.add(txtFilePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 330, 30));

        jLabel18.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel18.setText("Skills -");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        txtSkill2.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill2.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtSkill2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        txtSkill2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkill2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtSkill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 465, 190, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 970, 200));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void BrowseFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseFileBtnActionPerformed
       JFileChooser fileChooser=new JFileChooser();
       fileChooser.setDialogTitle("Select Your Resume");
       fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
       int result=fileChooser.showOpenDialog(null);
       if(result==JFileChooser.APPROVE_OPTION){
           file=fileChooser.getSelectedFile();
           txtFilePath.setText(file.getName());
       }
        
    }//GEN-LAST:event_BrowseFileBtnActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtSkill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkill1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkill1ActionPerformed

    private void txtSkill3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkill3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkill3ActionPerformed

    private void txtSkill4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkill4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkill4ActionPerformed

    private void txtQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificationActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please input all the fields","Incomplete Data!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(matchPasswords()==false){
            JOptionPane.showMessageDialog(null,"Passwords do not match","Mismatched Passwords!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            ParticipantPojo pt=new ParticipantPojo();
            pt.setId(lblPid.getText().trim());
            pt.setUserId(txtMail.getText().trim().toUpperCase());
            pt.setName(txtName.getText().trim());
            pt.setPhone(txtPhone.getText().trim());
            pt.setResume(file);
            pt.setSkills(txtSkill1.getText().trim()+","+txtSkill2.getText().trim()+","+txtSkill3.getText().trim()+","+txtSkill4.getText().trim());
            pt.setQualifications(txtQualification.getText().trim());
            pt.setPassword(pwd);
            pt.setType("Pt");
            int result=ParticipantDAO.addNewParticipant(pt);
            if(result==1){
                 JOptionPane.showMessageDialog(null,"Participant Added Successfully!","Success!!",JOptionPane.INFORMATION_MESSAGE);
                 clearAll();
                 loadId();
                 return;
            }else if(result==-1){
                JOptionPane.showMessageDialog(null,"Email-Id Already Taken!","Registration Failed!",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Cannot Add The Record!","Registration Failed!",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"SQL Error!","DB Problem,",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"File Error!","File Problem,",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void txtFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilePathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilePathActionPerformed

    private void txtSkill2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkill2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkill2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseFileBtn;
    private javax.swing.JSeparator DipperSeperator2;
    private javax.swing.JSeparator DipperSeperator3;
    private javax.swing.JSeparator DipperSeperator4;
    private javax.swing.JLabel PhnLbl3;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPid;
    private javax.swing.JPasswordField txtCnfPwd;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSkill1;
    private javax.swing.JTextField txtSkill2;
    private javax.swing.JTextField txtSkill3;
    private javax.swing.JTextField txtSkill4;
    // End of variables declaration//GEN-END:variables
}
