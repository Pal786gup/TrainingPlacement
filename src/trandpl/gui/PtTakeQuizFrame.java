/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import trandpl.dao.QuestionDAO;
import trandpl.dao.ResultDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.QuestionPojo;
import trandpl.pojo.ResultsPojo;

public class PtTakeQuizFrame extends javax.swing.JFrame { 
    
    private String jobId;
    private String jobTitle;
    private int counter=0;
    private List<QuestionPojo> questionList;
    private QuestionPojo currentQuestion;
    private List<Integer> answerList;
    public PtTakeQuizFrame() {
        initComponents();
        this.setLocationRelativeTo(null);        
    }

    public PtTakeQuizFrame(String jobId,String jobTitle) {
        
        
        this();
        this.jobId=jobId;
        this.jobTitle=jobTitle;
        lblTitle.setText("Paper For "+this.jobTitle);
        lblQno.setText(""+(counter+1));        
        this.setVisible(true);
        loadQuestionPaper();       
        
    }
     private void loadQuestionPaper(){
        try{
            questionList=QuestionDAO.getQuestionPaperByJobId(jobId);
            answerList=new ArrayList<>(questionList.size());
            for(int i=0;i<questionList.size();i++){
               answerList.add(i,0);
           }
           showNextQuestionInFrame(); 
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error In Quiz", "Error!!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private void showNextQuestionInFrame(){
        currentQuestion=questionList.get(counter);
        txtQuestion.setText(currentQuestion.getQuestion());
        jrbOption1.setText(currentQuestion.getOption1());
        jrbOption2.setText(currentQuestion.getOption2());
        jrbOption3.setText(currentQuestion.getOption3());
        jrbOption4.setText(currentQuestion.getOption4());
        int answer=answerList.get(counter);
        switch(answer){
            case 1:
                        jrbOption1.setSelected(true);
                        break;
            case 2:
                        jrbOption2.setSelected(true);
                        break;
            case 3:
                        jrbOption3.setSelected(true);
                        break;
            case 4:
                        jrbOption4.setSelected(true);
                        break;
            default:
                        buttonGroup1.clearSelection();
                
        }
    }
    private int validateChooseOption(){
        if(jrbOption1.isSelected())
            return 1;
        else if(jrbOption2.isSelected())
            return 2;
        else if(jrbOption3.isSelected())
            return 3;
        else if(jrbOption4.isSelected())
            return 4;
        else
            return 0;
    }
    private double getPercentage(){
        int marksObtained=0;
        for(int i=0;i<questionList.size();i++){
            QuestionPojo question=questionList.get(i);
            if(question.getCorrectOption()==answerList.get(i)){
                ++marksObtained;
            }
        }
        double per=((double)marksObtained/questionList.size())*100;
        return per;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbOption1 = new javax.swing.JRadioButton();
        jrbOption3 = new javax.swing.JRadioButton();
        jrbOption2 = new javax.swing.JRadioButton();
        jrbOption4 = new javax.swing.JRadioButton();
        btnDiscard = new javax.swing.JButton();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        colenLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        minLbl = new javax.swing.JLabel();
        secLbl = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jrbOption1);
        jrbOption1.setText("buton 1");
        jrbOption1.setOpaque(false);
        jPanel1.add(jrbOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 487, 290, 25));

        buttonGroup1.add(jrbOption3);
        jrbOption3.setText("jRadioButton1");
        jrbOption3.setOpaque(false);
        jPanel1.add(jrbOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 567, 290, 25));

        buttonGroup1.add(jrbOption2);
        jrbOption2.setText("jRadioButton1");
        jrbOption2.setOpaque(false);
        jPanel1.add(jrbOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 487, 290, 25));

        buttonGroup1.add(jrbOption4);
        jrbOption4.setText("jRadioButton1");
        jrbOption4.setOpaque(false);
        jPanel1.add(jrbOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 567, 290, 25));

        btnDiscard.setBackground(new java.awt.Color(173, 192, 234));
        btnDiscard.setText("Discard Paper");
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, 140, -1));

        lblQno.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jPanel1.add(lblQno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 40, 30));

        txtQuestion.setEditable(false);
        txtQuestion.setBackground(new java.awt.Color(173, 192, 234));
        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        txtQuestion.setRows(5);
        txtQuestion.setAutoscrolls(false);
        txtQuestion.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.gray));
        jScrollPane1.setViewportView(txtQuestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 860, 90));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel4.setText("Que .");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 60, 30));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        jLabel5.setText("Option 4 ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 60, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 350, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 350, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 350, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 350, 40));

        btnPrevious.setBackground(new java.awt.Color(173, 192, 234));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 140, -1));

        btnNext.setBackground(new java.awt.Color(173, 192, 234));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 140, -1));

        btnSubmit.setBackground(new java.awt.Color(173, 192, 234));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 970, 10));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 65, 970, 170));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 980, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 980, 10));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel7.setText("Options -");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 150, 40));

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        jLabel8.setText("Option 1 ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 60, 30));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        jLabel9.setText("Option 2 ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 60, 30));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        jLabel10.setText("Option 3 ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 60, 30));

        colenLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colenLbl.setForeground(new java.awt.Color(255, 0, 51));
        colenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colenLbl.setText(":");
        jPanel1.add(colenLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 660, 100, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Time Left :-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, -1, 20));

        minLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        minLbl.setForeground(new java.awt.Color(255, 0, 51));
        minLbl.setText("0");
        jPanel1.add(minLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, 20, 20));

        secLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        secLbl.setForeground(new java.awt.Color(255, 0, 51));
        secLbl.setText("0");
        jPanel1.add(secLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 660, 20, 20));

        lblTitle.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblTitle.setText("jLabel1");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 230, 30));

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

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        // TODO add your handling code here:
        new PtViewAllAvailableJobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDiscardActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        int res=validateChooseOption();
        if(res==0){
            JOptionPane.showMessageDialog(null,"Please Select An Option","No Option Selected!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        answerList.set(counter, res);
        --counter;
        if(counter==-1){
            counter=questionList.size()-1;
        }
        showNextQuestionInFrame();
        lblQno.setText(""+(counter+1));  
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int res=validateChooseOption();
        if(res==0){
            JOptionPane.showMessageDialog(null,"Please Select An Option","No Option Selected!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        answerList.set(counter, res);
        ++counter;
        if(counter==questionList.size()){
            counter=0;
        }
        showNextQuestionInFrame();
        lblQno.setText(""+(counter+1));  
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int res=validateChooseOption();
        if(res==0){
            JOptionPane.showMessageDialog(null,"Please Select An Option","No Option Selected!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        answerList.set(counter, res);
        double per=getPercentage();
        ResultsPojo result=new ResultsPojo();
        result.setJobId(jobId);
        result.setpId(CurrentUser.getId());
        if(per<5)
            per=5.0;
        result.setPercentage(per);
        result.setSelectedByHr("No");
        try{
            boolean resp=ResultDAO.setResult(result);
            if(resp==true){
                JOptionPane.showMessageDialog(null,"You Got "+per+"% marks+\nAnd Result Has Been Sent On Your Mail","Result!",JOptionPane.INFORMATION_MESSAGE);
                new PtViewAllAppliedJobsFrame().setVisible(true);
                this.dispose();
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error In Taake Test", "Error!!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(PtTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PtTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PtTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PtTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PtTakeQuizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel colenLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton jrbOption1;
    private javax.swing.JRadioButton jrbOption2;
    private javax.swing.JRadioButton jrbOption3;
    private javax.swing.JRadioButton jrbOption4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel minLbl;
    private javax.swing.JLabel secLbl;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

    
}
