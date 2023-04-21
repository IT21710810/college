package Views;
import javax.swing.JOptionPane;
import Models.ExamIssue;
import Controllers.ExamIssueController;
import DataBaselayer.DataBaseConnection;
public class ExamIssuesView extends javax.swing.JFrame {

    ExamIssue examobj;
    ExamIssue[] examArray;
    ExamIssueController E1;
    int index;
    
    public ExamIssuesView() {
        initComponents();
        
        E1 = new ExamIssueController();
        examArray=new ExamIssue [100];
        index=0;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblmail = new javax.swing.JLabel();
        lblcontact = new javax.swing.JLabel();
        lblSubname = new javax.swing.JLabel();
        lblSubCode = new javax.swing.JLabel();
        lblExamIssues = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        lblcomplete = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtsubname = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        txtExam = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        txtCom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Exam Issues");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblname.setText("Student Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 220, 24));

        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setText("Student Id");
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 24));

        lblmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmail.setText("Email");
        jPanel1.add(lblmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 30));

        lblcontact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcontact.setText("Contact No");
        jPanel1.add(lblcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 112, 24));

        lblSubname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubname.setText("Subject Name");
        jPanel1.add(lblSubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 112, 24));

        lblSubCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubCode.setText("Subject Code");
        jPanel1.add(lblSubCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 112, 24));

        lblExamIssues.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblExamIssues.setText("Examination issues");
        jPanel1.add(lblExamIssues, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 148, 24));

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setText("Time Issues (AM OR PM)");
        jPanel1.add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 180, 24));

        lblcomplete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcomplete.setText("Were you complete the exam");
        jPanel1.add(lblcomplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 211, 24));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 228, 27));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 228, 27));
        jPanel1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 228, 30));
        jPanel1.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 228, 27));
        jPanel1.add(txtsubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 228, 27));
        jPanel1.add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 228, 27));
        jPanel1.add(txtExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 228, 27));
        jPanel1.add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 228, 27));
        jPanel1.add(txtCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 228, 27));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\WhatsApp Image 2021-11-10 at 21.23.32.jpeg")); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 490));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnback)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnupdate)
                    .addComponent(btndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       try{
       String Id=txtid.getText();
       String S_Name=txtname.getText();
       String Mail=txtmail.getText();
       int ContactNo=Integer.parseInt(txtcontact.getText());
       String SubName=txtsubname.getText();
       String SubCode=txtcode.getText();
       String ExamIssue=txtExam.getText();
       String TimeIssue=txttime.getText();
       String CompleteExam=txtCom.getText();
       examobj=E1.addExamIssue( Id, S_Name,Mail, ContactNo, SubName, SubCode, ExamIssue, TimeIssue,CompleteExam);
       boolean result=E1.insertExamToDB(examobj);
       examArray[index]=examobj;
       index++;
        if(result)
        {
           JOptionPane.showMessageDialog(rootPane, index +" SuccessFully added exam issues Details", " Sucess", 1);
        }else{
               JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0); 
            }
       }catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }
            
            

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       try{
       String Id=txtid.getText();
       String S_Name=txtname.getText();
       String Mail=txtmail.getText();
       int ContactNo=Integer.parseInt(txtcontact.getText());
       String SubName=txtsubname.getText();
       String SubCode=txtcode.getText();
       String ExamIssue=txtExam.getText();
       String TimeIssue=txttime.getText();
       String CompleteExam=txtCom.getText();
       examobj=E1.addExamIssue( Id, S_Name,Mail, ContactNo, SubName, SubCode, ExamIssue, TimeIssue,CompleteExam);
       boolean result=E1.updateExamToDB(examobj);
       examArray[index]=examobj;
       index++;
        if(result)
        {
           JOptionPane.showMessageDialog(rootPane, index +" SuccessFully updated exam issues Details", " Sucess", 1);
        }else{
               JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0); 
            }
       }catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }
            
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       try{
        String S_Id=txtid.getText();
        boolean result=E1.removeExamToDB(S_Id);
        examArray[index]=examobj;
        index++;
        if(result)
        {
           JOptionPane.showMessageDialog(rootPane, index +" SuccessFully deleted exam issues Details", " Sucess", 1);
        }else{
               JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0); 
            }
        }catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.hide();
        StudentView btnback=new StudentView();
        btnback.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(ExamIssuesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamIssuesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamIssuesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamIssuesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamIssuesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblExamIssues;
    private javax.swing.JLabel lblSubCode;
    private javax.swing.JLabel lblSubname;
    private javax.swing.JLabel lblcomplete;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblmail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTextField txtCom;
    private javax.swing.JTextField txtExam;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsubname;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables
}
