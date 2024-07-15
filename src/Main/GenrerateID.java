package Main;


import java.awt.Toolkit;
import java.sql.*;
import java.sql.DriverManager;
import java.text.MessageFormat;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class GenrerateID extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    /**
     * Creates new form GenrerateID
     */
    public GenrerateID() {
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

        btnPDF = new javax.swing.JButton();
        Searchbtn1 = new javax.swing.JButton();
        Searchbar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        Searchbtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print Data");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPDF.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pdf-35.png"))); // NOI18N
        btnPDF.setText("Print PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        getContentPane().add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 576, 262, 56));

        Searchbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-40.png"))); // NOI18N
        Searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searchbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 40, 40));

        Searchbar.setText("Enter Student Name");
        Searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbarActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 392, 40));

        tblstudent.setBackground(new java.awt.Color(204, 255, 255));
        tblstudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Std_ID", "Student_Name", "Email_ID", "Contact", "Gender", "Address", "Date_Of_Brith", "courses"
            }
        ));
        jScrollPane1.setViewportView(tblstudent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 1472, 340));

        Searchbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/black show.png"))); // NOI18N
        Searchbtn.setText("Show Data");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1047, 576, 240, 56));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, 1638, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 533, 1638, 10));

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-left-arrow-30.png"))); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 576, 235, 56));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-data-protection-50.png"))); // NOI18N
        jLabel1.setText("Student Data ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 83));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg2demo3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 690));

        setSize(new java.awt.Dimension(1613, 710));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        MessageFormat header=new MessageFormat("Student Data");
        MessageFormat footer=new MessageFormat(" ");
        try {
            PrintRequestAttributeSet set=new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.LANDSCAPE);
            tblstudent.print(JTable.PrintMode.FIT_WIDTH,header,footer,true,set,true);
            JOptionPane.showMessageDialog(null, "\n"+"printed Sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "\n"+"Failed");
        }

    }//GEN-LAST:event_btnPDFActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
            ;
//            Statement st=con.createStatement();
            String sql="select *from std_info  ";
            //            int Std_ID1=Integer.parseInt(Searchbar.getText());
            
            PreparedStatement pst=con.prepareStatement(sql);
            

            rs =pst.executeQuery(sql);
            while(rs.next()){
                String Std_ID=String.valueOf(rs.getInt("Std_ID"));
                String Student_Name=rs.getString("Student_Name");
                String Email_ID=rs.getString("Email_ID");
                String Contact=rs.getString("Contact");
                String Gender=rs.getString("Gender");
                String Address=rs.getString("Address");
                String Date_Of_Brith=rs.getString("Date_Of_Brith");
                String courses=rs.getString("courses");
                

                String tbData[] = {Std_ID,Student_Name,Email_ID,Contact,Gender,Address,Date_Of_Brith,courses};
                DefaultTableModel tableModel=(DefaultTableModel)tblstudent.getModel();

                tableModel.addRow(tbData);

            }
            con.close();
            //            if(rs.next()==false){
                //
                //            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
           setVisible(false);
           new Student_DashBorad().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

    private void SearchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchbarActionPerformed

    private void Searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searchbtn1ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
       try{ Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
            
//            Statement st=con.createStatement();
            String sql="select *from std_info where Student_Name=? ";
          
            
            
            PreparedStatement pst=con.prepareStatement(sql);
            String Name=String.valueOf(Searchbar.getText());
            pst.setString(1,Name);

            rs =pst.executeQuery();
           
            while(rs.next()){
                String Std_ID=String.valueOf(rs.getInt("Std_ID"));
                String Student_Name=rs.getString("Student_Name");
                String Email_ID=rs.getString("Email_ID");
                String Contact=rs.getString("Contact");
                String Gender=rs.getString("Gender");
                String Address=rs.getString("Address");
                String Date_Of_Brith=rs.getString("Date_Of_Brith");
                String courses=rs.getString("courses");
                

                String tbData[] = {Std_ID,Student_Name,Email_ID,Contact,Gender,Address,Date_Of_Brith,courses};
                DefaultTableModel tableModel=(DefaultTableModel)tblstudent.getModel();

                tableModel.addRow(tbData);

            }
            con.close();
                     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Searchbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(GenrerateID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenrerateID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenrerateID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenrerateID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenrerateID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Searchbar;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JButton Searchbtn1;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblstudent;
    // End of variables declaration//GEN-END:variables
    private void setIconImage() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("id-card.png")));
    }


}
