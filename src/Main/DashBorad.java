package Main;


import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class DashBorad extends javax.swing.JFrame {

    /**
     * Creates new form Update_options
     */
    public DashBorad() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        Btnshow = new javax.swing.JButton();
        Loginbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        IDgenrerate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DashBoard");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 870, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 504, 870, 10));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-list-35.png"))); // NOI18N
        btnAdd.setText("Add New Record");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 112, 222, 70));

        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-update-35.png"))); // NOI18N
        updatebtn.setText("Update Data");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 396, 222, 70));

        Btnshow.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Btnshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-show-property-35.png"))); // NOI18N
        Btnshow.setText("Show ID Deteils");
        Btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnshowActionPerformed(evt);
            }
        });
        getContentPane().add(Btnshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 254, 222, 70));

        Loginbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-go-back-35.png"))); // NOI18N
        Loginbtn.setText("Login Page");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 396, 217, 70));

        Deletebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-30.png"))); // NOI18N
        Deletebtn.setText("Delete Data");
        Deletebtn.setPreferredSize(new java.awt.Dimension(179, 39));
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 112, 217, 70));

        IDgenrerate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        IDgenrerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-id-verified-35.png"))); // NOI18N
        IDgenrerate.setText("Genrerate PDF");
        IDgenrerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDgenrerateActionPerformed(evt);
            }
        });
        getContentPane().add(IDgenrerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 254, 217, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-menu-64.png"))); // NOI18N
        jLabel1.setText("DashBoard Menu");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 58));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg2demo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Add New Recored","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Ragistration().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed
  }
    private void BtnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnshowActionPerformed
        // TODO add your handling code here:
        int b=JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Check ID Deteils Recored","select",JOptionPane.YES_NO_OPTION);
        if(b==0){
            setVisible(false);
            new Show_ID_Card().setVisible(true);
    }   
    }//GEN-LAST:event_BtnshowActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        // TODO add your handling code here:
        int c=JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Back To Login","select",JOptionPane.YES_NO_OPTION);
        if(c==0){
            setVisible(false);
            new Login_Page().setVisible(true);
    }   
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
//         int d=JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Delect the data","select",JOptionPane.YES_NO_OPTION);
//        if(d==0){
            setVisible(false);
            new Edit_Student_Data().setVisible(true);
      
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void IDgenrerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDgenrerateActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new GenrerateID().setVisible(true);
    }//GEN-LAST:event_IDgenrerateActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Edit_Student_Data().setVisible(true);
    }//GEN-LAST:event_updatebtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(DashBorad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBorad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBorad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBorad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBorad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnshow;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton IDgenrerate;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
    private void setIconImage() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("id-card.png")));
    }

}
