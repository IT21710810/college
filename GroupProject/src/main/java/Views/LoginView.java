package Views;
import Models.User;
import Controllers.LoginController;
import javax.swing.JOptionPane;
public class LoginView extends javax.swing.JFrame {

     
    LoginController controllerObj;
     public LoginView() {
        initComponents();
        controllerObj = new LoginController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("TUTORA INSTITUTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 230, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("User Name");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 84, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setText("Pass Word");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 84, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 166, 28));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 166, 29));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Screenshot 2021-11-10 135701.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 670, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String userText = txtName.getText();
        char[] passArray=txtPassword.getPassword();
        String passText=new String(passArray);
        User u = controllerObj.checkUser(userText);
        if (u!=null && u.getUserName().equalsIgnoreCase(userText) && u.getPassword().equals(passText)) {

            if (u.getAccountType().equals("College")) {
                StudentView ui = new  StudentView();
                ui.setVisible(true);
                this.setVisible(false);
            } else if (u.getAccountType().equals("Headoffice")) {
                AdminView ui = new AdminView();
                ui.setVisible(true);
                this.setVisible(false);
            }else if (u.getAccountType().equals("Staff")) {
                EmployeeView ui = new EmployeeView();
                ui.setVisible(true);
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Anthentication failed please login again", "Error", 0);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
