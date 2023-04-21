package Views;

import javax.swing.JOptionPane;
import Models.College;
import Controllers.CollegeController;
import DatabaseLayer.DatabaseConnection;

public class CollegeView extends javax.swing.JFrame {

    College ObjCollege;
    College[] collegeArray;
    CollegeController c1;
    int index;

    public CollegeView() {
        initComponents();
        c1 = new CollegeController();
        collegeArray = new College[100];
        index = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblSchool = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSchool = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Name");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAge.setText("Age");

        lblSchool.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSchool.setText("School");

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnadd)
                        .addGap(41, 41, 41)
                        .addComponent(btnUpdate)
                        .addGap(51, 51, 51)
                        .addComponent(btnDelete)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSchool, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(62, 62, 62))
        );

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

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String school = txtSchool.getText();
            ObjCollege = c1.addStudent(name, age, school);
            boolean result = c1.insertStudentToDB(ObjCollege);
            collegeArray[index] = ObjCollege;
            index++;
            System.out.println(ObjCollege.getS_Name());
            if (result) {
                JOptionPane.showMessageDialog(rootPane, (index) + " Details has been Added", "info", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0);
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }


    }//GEN-LAST:event_btnaddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String name = txtName.getText();
            //int age = Integer.parseInt(txtAge.getText());
            //String school = txtSchool.getText();
            //ObjCollege = c1.addStudent(name, age, school);

            boolean result = c1.removeStudentToDB(name);
            collegeArray[index] = ObjCollege;
            index++;
           
            if (result) {
                JOptionPane.showMessageDialog(rootPane, (index) + " Details has been Deleted", "info", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0);
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         try {
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String school = txtSchool.getText();
            ObjCollege = c1.addStudent(name, age, school);
            boolean result = c1.updateStudentToDB(ObjCollege);
            collegeArray[index] = ObjCollege;
            index++;
            if (result) {
                JOptionPane.showMessageDialog(rootPane, (index) + " Details has been successfully Updated", "info", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error adding to db", "Error", 0);
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid input ", "ERROR", 0);
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(CollegeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollegeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollegeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollegeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollegeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSchool;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSchool;
    // End of variables declaration//GEN-END:variables
}
