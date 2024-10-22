package Main;


import java.awt.Toolkit;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR-18
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form idcard
     */
    public Login_Page() {
        initComponents();
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        loginpassword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        New_User = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        pass1 = new javax.swing.JLabel();
        Combouser = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-male-user-50.png"))); // NOI18N
        jLabel1.setText("Login Page");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 968, 95));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/6.png"))); // NOI18N
        jLabel2.setText("User Name : ");
        jLabel2.setPreferredSize(new java.awt.Dimension(75, 25));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 241, 170, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-password-30.png"))); // NOI18N
        jLabel4.setText("Password : ");
        jLabel4.setIconTextGap(6);
        jLabel4.setMaximumSize(new java.awt.Dimension(46, 14));
        jLabel4.setPreferredSize(new java.awt.Dimension(170, 50));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, 35));

        username.setPreferredSize(new java.awt.Dimension(200, 50));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 242, 406, 36));

        loginpassword.setPreferredSize(new java.awt.Dimension(223, 35));
        loginpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginpasswordActionPerformed(evt);
            }
        });
        loginpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loginpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(loginpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 361, 406, -1));

        login.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3.png"))); // NOI18N
        login.setLabel("Login");
        login.setPreferredSize(new java.awt.Dimension(75, 25));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 477, 156, 41));

        reset.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/5.png"))); // NOI18N
        reset.setText("Reset");
        reset.setIconTextGap(6);
        reset.setPreferredSize(new java.awt.Dimension(75, 25));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 475, 152, 42));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 968, 16));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 536, 454, 12));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Enter User Name & Password....");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 203, 270, 20));

        New_User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        New_User.setText("Create New Account");
        New_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_UserActionPerformed(evt);
            }
        });
        getContentPane().add(New_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 588, 428, 42));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("or");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 31, 37));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 536, 454, 12));

        pass1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        pass1.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 400, 24));

        Combouser.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Combouser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Student" }));
        getContentPane().add(Combouser, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 146, 155, 39));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/6310507.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 890, 760));

        setSize(new java.awt.Dimension(908, 805));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
    }//GEN-LAST:event_usernameActionPerformed
    
 
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        try{
            int count=0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
            String Username =username.getText();
            String Login_Password=String.valueOf(loginpassword.getPassword());
            String Division=Combouser.getSelectedItem().toString();
            
            
            
            String sql ="select * from login where Username='"+Username+"' and Login_Password='"+Login_Password+"' and Division='"+Division+"'";
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet rs= pst.executeQuery(sql);
            String access=(Combouser.getSelectedItem().toString());    
            if(rs.next()){
                
                dispose();
               if(access=="Admin"){
                   if(count==1){
                       JOptionPane.showMessageDialog(this,"select User");

                   }
                   else{
                         new DashBorad().setVisible(true);
                        JOptionPane.showMessageDialog(this,"Login Successfully");
              
                   }
               }
               else{
                   dispose();
                   new Student_DashBorad().setVisible(true);
                   JOptionPane.showMessageDialog(this,"Login Successfully");
               }
            }
                
            
             else{
                        JOptionPane.showMessageDialog(this,"username or password wrong....");
                        username.setText("");
                        loginpassword.setText("");
                        
                       
                  }
            
            con.close();
        }
        
        catch(Exception e){ 
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        username.setText("");
        loginpassword.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void loginpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginpasswordActionPerformed

    private void New_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_UserActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Ragistration stdd=new Ragistration();
        stdd.setVisible(true);
    }//GEN-LAST:event_New_UserActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_usernameKeyReleased

    private void loginpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginpasswordKeyReleased
        // TODO add your handling code here:
         String PATTERN1="^[a-zA-Z0-9]{8,20}$";
        Pattern patt=Pattern.compile(PATTERN1);
        Matcher match;
        match = patt.matcher(String.valueOf(loginpassword.getPassword()));
        if(!match.matches()){
           pass1.setText("At Least 8 Characters or Numbers");
        }
        else{
            pass1.setText(null);
    }
    }//GEN-LAST:event_loginpasswordKeyReleased

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combouser;
    private javax.swing.JButton New_User;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField loginpassword;
    private javax.swing.JLabel pass1;
    private javax.swing.JButton reset;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("id-card.png")));
    }
}
