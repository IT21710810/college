package Views;

import javax.swing.JOptionPane;
import Models.RegisterIssues;
import Controllers.RegisterIssuesController;
import DataBaselayer.DataBaseConnection;

public class StudentIssuesView extends javax.swing.JFrame {

    RegisterIssues registerobj;
    RegisterIssues[] registerArray;
    RegisterIssuesController r1;
    int index;

    public StudentIssuesView() {
        initComponents();
        r1 = new RegisterIssuesController();
        registerArray = new RegisterIssues[100];
        index = 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblProgram = new javax.swing.JLabel();
        lblBranch = new javax.swing.JLabel();
        lblSemester = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblDescribe = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtProgram = new javax.swing.JTextField();
        txtBranch = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        txtDescribe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Register Issues");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Student name");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 124, 25));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setText("Student Id");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 124, 26));

        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPhone.setText("Contact No");
        jPanel1.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 152, 124, 25));

        lblMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMail.setText("Mail");
        jPanel1.add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 114, 124, 25));

        lblProgram.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProgram.setText("Program");
        jPanel1.add(lblProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 197, 124, 25));

        lblBranch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBranch.setText("Branch");
        jPanel1.add(lblBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 242, 124, 25));

        lblSemester.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSemester.setText("Semester");
        jPanel1.add(lblSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 332, 124, 25));

        lblYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblYear.setText("Year");
        jPanel1.add(lblYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 287, 124, 25));

        lblDescribe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescribe.setText("Describe Issues");
        jPanel1.add(lblDescribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 377, 124, 25));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 245, 30));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 245, 30));
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 245, 30));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 245, 30));
        jPanel1.add(txtProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 245, 30));
        jPanel1.add(txtBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 245, 30));
        jPanel1.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 245, 30));
        jPanel1.add(txtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 245, 30));
        jPanel1.add(txtDescribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 413, 434, 91));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\WhatsApp Image 2021-11-10 at 21.23.32.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 510));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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
                .addGap(55, 55, 55)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnUpdate)
                .addGap(48, 48, 48)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnback)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {

            String Student_Id = txtid.getText();
            String Student_Name = txtName.getText();
            String Mail = txtMail.getText();
            int contact = Integer.parseInt(txtPhone.getText());
            String Program = txtProgram.getText();
            String Branch = txtBranch.getText();
            int Year = Integer.parseInt(txtYear.getText());
            String Semester = txtSemester.getText();
            String Describe_Issues = txtDescribe.getText();
            registerobj = r1.addRegister(Student_Id, Student_Name, Mail, contact, Program, Branch, Year, Semester, Describe_Issues);
            boolean result = r1.insertStudentToDB(registerobj);
            registerArray[index] = registerobj;
            index++;
            if (result) {
                JOptionPane.showMessageDialog(rootPane, index + " SuccessFully added Student Details", " Sucess", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0);
            }

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.hide();
        StudentView btnback = new StudentView();
        btnback.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String Student_Id = txtid.getText();
            String Student_Name = txtName.getText();
            String Mail = txtMail.getText();
            int contact = Integer.parseInt(txtPhone.getText());
            String Program = txtProgram.getText();
            String Branch = txtBranch.getText();
            int Year = Integer.parseInt(txtYear.getText());
            String Semester = txtSemester.getText();
            String Describe_Issues = txtDescribe.getText();
            registerobj = r1.addRegister(Student_Id, Student_Name, Mail, contact, Program, Branch, Year, Semester, Describe_Issues);
            boolean result = r1.updateStudentToDB(registerobj);
            registerArray[index] = registerobj;
            index++;
            if (result) {
                JOptionPane.showMessageDialog(rootPane, (index) + " Student Details has been successfully Updated", "info", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0);
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String Student_Id = txtid.getText();
            boolean result = r1.removeStudentToDB(Student_Id);
            registerArray[index] = registerobj;
            index++;
            if (result) {
                JOptionPane.showMessageDialog(rootPane, index + " SuccessFully deleted Student Details", " Sucess", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0);
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(StudentIssuesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentIssuesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentIssuesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentIssuesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentIssuesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblDescribe;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtDescribe;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtProgram;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
