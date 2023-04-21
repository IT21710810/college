package Views;

public class StudentView extends javax.swing.JFrame {

    public StudentView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnregisterissues = new javax.swing.JButton();
        btnexamissues = new javax.swing.JButton();
        btnCourse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Manage Page");

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregisterissues.setBackground(new java.awt.Color(153, 0, 0));
        btnregisterissues.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregisterissues.setText("Student Registration Issues");
        btnregisterissues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterissuesActionPerformed(evt);
            }
        });
        jPanel1.add(btnregisterissues, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, 41));

        btnexamissues.setBackground(new java.awt.Color(153, 0, 0));
        btnexamissues.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexamissues.setText("Examination Issues");
        btnexamissues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexamissuesActionPerformed(evt);
            }
        });
        jPanel1.add(btnexamissues, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 250, 41));

        btnCourse.setBackground(new java.awt.Color(153, 0, 0));
        btnCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCourse.setText("Course Details");
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        jPanel1.add(btnCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 250, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\WhatsApp Image 2021-11-10 at 21.23.32.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregisterissuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterissuesActionPerformed
        StudentIssuesView btnregisterIssuse=new StudentIssuesView();
        btnregisterIssuse.show();
        dispose();
    }//GEN-LAST:event_btnregisterissuesActionPerformed

    private void btnexamissuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexamissuesActionPerformed
        ExamIssuesView btnExamIssuesView=new ExamIssuesView();
        btnExamIssuesView.show();
        dispose();
    }//GEN-LAST:event_btnexamissuesActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        CourseView btnCourseView=new CourseView();
        btnCourseView.show();
        dispose();
    }//GEN-LAST:event_btnCourseActionPerformed

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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnexamissues;
    private javax.swing.JButton btnregisterissues;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
