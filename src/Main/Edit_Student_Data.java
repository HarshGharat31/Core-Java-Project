package Main;


import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author MR-18
 */
public class Edit_Student_Data extends javax.swing.JFrame {

     public String ContactPattern="[789]{1}[0-9]{9}+";
     public String EmailPattern= "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
     public String DobPattern="^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$";
     
     ResultSet rs=null;
     private ImageIcon format=null;
     String filename=null;
     byte[] person_image=null;
   
    
    
    /**
     * Creates new form StudentDetails
     */
    public Edit_Student_Data() {
        initComponents();
        setIconImage();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        check1.setVisible(false);
        lbl_Check.setVisible(false);
        cross1.setVisible(false);
        Cross.setVisible(false);
//        setLocation(size.width/2 getwidth()/2,size.height/2,getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Student = new javax.swing.JLabel();
        Std_Name = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        lblphoto = new javax.swing.JLabel();
        Deletebtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Address = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Dob = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        choosebtn = new javax.swing.JButton();
        Cross = new javax.swing.JLabel();
        cross1 = new javax.swing.JLabel();
        check1 = new javax.swing.JLabel();
        lbl_Check = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        Error1 = new javax.swing.JLabel();
        Student1 = new javax.swing.JLabel();
        txSearch = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        Dob1 = new javax.swing.JTextField();
        Courses = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dobpatt = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-id-35.png"))); // NOI18N
        jLabel1.setText("Update Students Data");
        jLabel1.setIconTextGap(15);
        jLabel1.setPreferredSize(new java.awt.Dimension(350, 45));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1396, 60));

        Student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Std-icon.png"))); // NOI18N
        Student.setText("Student Name : ");
        Student.setPreferredSize(new java.awt.Dimension(92, 37));
        getContentPane().add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 171, 260, -1));

        Std_Name.setPreferredSize(new java.awt.Dimension(165, 30));
        getContentPane().add(Std_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 401, 37));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email-icon.png"))); // NOI18N
        email.setText("Email_Id : ");
        email.setPreferredSize(new java.awt.Dimension(172, 37));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 251, 260, -1));

        Email.setPreferredSize(new java.awt.Dimension(165, 30));
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailKeyReleased(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 401, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-phone-number-20.png"))); // NOI18N
        jLabel4.setText("Contact_No :");
        jLabel4.setPreferredSize(new java.awt.Dimension(92, 37));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 321, 262, -1));

        Contact.setPreferredSize(new java.awt.Dimension(165, 30));
        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });
        Contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ContactKeyReleased(evt);
            }
        });
        getContentPane().add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 401, 37));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Gender-icon.png"))); // NOI18N
        jLabel5.setText("Gender : ");
        jLabel5.setPreferredSize(new java.awt.Dimension(92, 37));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 405, 262, -1));

        male.setBackground(new java.awt.Color(255, 255, 255));
        male.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        male.setText("Male");
        male.setPreferredSize(new java.awt.Dimension(70, 25));
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 405, 112, 36));

        Female.setBackground(new java.awt.Color(255, 255, 255));
        Female.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Female.setText("Female");
        Female.setPreferredSize(new java.awt.Dimension(70, 25));
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        getContentPane().add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 405, 87, 37));

        lblphoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto.png"))); // NOI18N
        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblphoto.setPreferredSize(new java.awt.Dimension(92, 25));
        getContentPane().add(lblphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 136, 180, 222));

        Deletebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-30.png"))); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.setPreferredSize(new java.awt.Dimension(125, 25));
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(913, 755, 230, 55));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/address-20.png"))); // NOI18N
        jLabel10.setText("Address :");
        jLabel10.setPreferredSize(new java.awt.Dimension(92, 37));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 485, 262, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 1396, -1));

        Address.setPreferredSize(new java.awt.Dimension(165, 30));
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 485, 401, 37));

        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-update-35.png"))); // NOI18N
        updatebtn.setText("update");
        updatebtn.setIconTextGap(6);
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 755, 227, 55));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/female-20.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 37));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 405, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/male-icon.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(33, 37));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 405, 27, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 715, 1396, 11));

        Dob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-birthday-date-30.png"))); // NOI18N
        Dob.setText("Date Of Brith : ");
        getContentPane().add(Dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 555, 262, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-courses-25.png"))); // NOI18N
        jLabel8.setText("Courses : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 635, 262, 36));

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-left-arrow-30.png"))); // NOI18N
        logout.setText("Back");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 755, 203, 54));

        choosebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        choosebtn.setText("Update Photo");
        choosebtn.setPreferredSize(new java.awt.Dimension(125, 25));
        choosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtnActionPerformed(evt);
            }
        });
        getContentPane().add(choosebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 376, 180, 36));

        Cross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cross.png"))); // NOI18N
        getContentPane().add(Cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 43, 37));

        cross1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cross.png"))); // NOI18N
        getContentPane().add(cross1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 43, 37));

        check1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/check-mark-25.png"))); // NOI18N
        getContentPane().add(check1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 43, 37));

        lbl_Check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/check-mark-25.png"))); // NOI18N
        getContentPane().add(lbl_Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 43, 38));

        Error.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 377, 390, 20));

        Error1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Error1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 390, 20));

        Student1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Student1.setText("Search Student Info :");
        Student1.setPreferredSize(new java.awt.Dimension(92, 37));
        getContentPane().add(Student1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 95, 260, -1));
        getContentPane().add(txSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 96, 401, 37));

        Searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-40.png"))); // NOI18N
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 95, 43, 38));

        Dob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dob1ActionPerformed(evt);
            }
        });
        Dob1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Dob1KeyReleased(evt);
            }
        });
        getContentPane().add(Dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 555, 401, 37));
        getContentPane().add(Courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 635, 401, 36));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel7.setText("Enter Student ID :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 72, 248, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgdemo.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 860));

        dobpatt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        dobpatt.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(dobpatt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 400, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
            String sql="Delete from std_info where Std_ID=?";
           PreparedStatement pst=conn.prepareStatement(sql);
           pst.setString(1, txSearch.getText());
           pst.execute();
           
           JOptionPane.showMessageDialog(null, "Record Deleted");
                    
          
         }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
                               }
        
        finally{
            try{
                rs.close();
//                pst.close();
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

      
    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        Gender="Male";
        male.setSelected(true);
        Female.setSelected(false);
        
    }//GEN-LAST:event_maleActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
            String v=txSearch.getText();
            String v1=Std_Name.getText();
            String v2=Email.getText();
            String v3=Contact.getText();
            String v4=Gender;
            String v5=Address.getText();
            String v6=Dob1.getText();
            String v7=Courses.getText();
            
            String sql="update std_info Set Student_Name='"+v1+"',Email_ID='"+v2+"',Contact='"+v3+"',Gender='"+v4+"',Address='"+v5+"',Date_Of_Brith='"+v6+"',courses='"+v7+"' where Std_ID='"+v+"'";
            
            PreparedStatement pst=conn.prepareStatement(sql);
            
            pst.execute();
            JOptionPane.showMessageDialog(this,"Data Update Suecessfully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        try {
//            File file=new File(filename);
//            FileInputStream fis=new FileInputStream(file);
//            byte[] images =new Byte[(int)file.length()];
//            fis.read(images);
//            
            
            
            
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
        }
        
        
        
           
//        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
//        
    }//GEN-LAST:event_ContactActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here 
      int a= JOptionPane.showConfirmDialog(null,"Do You Want to Back the Dashboard","select",JOptionPane.YES_NO_OPTION);
      if(a==0){
            dispose();
            new DashBorad().setVisible(true);
          
      }  
    }//GEN-LAST:event_logoutActionPerformed

    private void choosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser= new JFileChooser();
        chooser.showOpenDialog(null);
        File f= chooser.getSelectedFile();
        filename= f.getAbsolutePath();
        ImageIcon imageicon =new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblphoto.getWidth(),lblphoto.getHeight(),Image.SCALE_SMOOTH));
        lblphoto.setIcon(imageicon);
        try { 
            File image=new File(filename);
            FileInputStream fix=new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            
            
            for(int number;(number = fix.read(buf)) != -1;){
                bos.write(buf,0,number);
                
            }
            person_image =bos.toByteArray();
                  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
        
         
         String v=txSearch.getText();
//         byte[]image=rs.getBytes("Std_photo");
//         ImageIcon imageicon2 =new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(lblphoto.getWidth(),lblphoto.getHeight(),Image.SCALE_SMOOTH));
//         lblphoto.setIcon(imageicon2);
////         
          File file=new File(filename);
          FileInputStream fis=new FileInputStream(file);
          byte[] images =new byte[(int)file.length()];
          fis.read(images);
          
         String sql="update std_info set Std_photo=? where Std_ID='"+v+"' ";
         PreparedStatement pst=conn.prepareStatement(sql);
         pst.setBytes(1, images);
         pst.execute();
         pst.close();
         JOptionPane.showMessageDialog(null, "Upload Successfully");
            
        } catch (Exception e) {
        }
               
        
    }//GEN-LAST:event_choosebtnActionPerformed

    private void EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyReleased
        // TODO add your handling code here:
        
         Pattern patt=Pattern.compile(EmailPattern);
        Matcher match=patt.matcher(Email.getText());
        if(!match.matches()){
           Cross.setVisible(true);
           lbl_Check.setVisible(false);
           Error1.setText("Invalied Email ID");
        }
        else{
            Cross.setVisible(false);
            lbl_Check.setVisible(true);
         Error1.setText(null);
        }
    }//GEN-LAST:event_EmailKeyReleased

    private void ContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContactKeyReleased
        // TODO add your handling code here:
        Pattern patt=Pattern.compile(ContactPattern);
        Matcher match=patt.matcher(Contact.getText());
        if(!match.matches()){
           cross1.setVisible(true);
           check1.setVisible(false);
           
           Error.setText("Invailed Contact Number");
        }
        else{
            cross1.setVisible(false);
           check1.setVisible(true);
           Error.setText(null);
        }
    }//GEN-LAST:event_ContactKeyReleased

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
            String sql="select *from Std_info where Std_ID=?";
//            String Username=(txSearch.getText());
            PreparedStatement pst=con.prepareStatement(sql);
            int Std_ID=Integer.parseInt(txSearch.getText());

            pst.setInt(1,Std_ID);
            rs =pst.executeQuery();
            if(rs.next()==false){
                JOptionPane.showMessageDialog(null,"Record Not Found");   
            }
            else{
            String add1=rs.getString("Student_Name");
            Std_Name.setText(add1);
            String add2=rs.getString("Email_ID");
            Email.setText(add2);
            String add3=rs.getString("Contact");
            Contact.setText(add3);
            String add4=rs.getString("Gender");
           if(male.isSelected()){
            male.setSelected(true);
                 }
            else{
            Female.setSelected(true);
          
             }
             String add5=rs.getString("Address");
             Address.setText(add5);
             String add6=rs.getString("Date_Of_Brith");
             Dob1.setText(add6);
             String add7=rs.getString("courses");
             Courses.setText(add7);
             byte[]image=rs.getBytes("Std_photo");
             ImageIcon imageicon =new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(lblphoto.getWidth(),lblphoto.getHeight(),Image.SCALE_SMOOTH));
             lblphoto.setIcon(imageicon);
            
             
            }
           
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:

        Gender="Female";
        Female.setSelected(true);
        male.setSelected(false);

    }//GEN-LAST:event_FemaleActionPerformed

    private void Dob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dob1ActionPerformed

    private void Dob1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Dob1KeyReleased
        // TODO add your handling code here:
        Pattern patt=Pattern.compile(DobPattern);
        Matcher match=patt.matcher(Dob1.getText());
        if(!match.matches()){
          dobpatt.setVisible(true);
          dobpatt.setText("Invalid DOB Format");
        }
        else{
            dobpatt.setVisible(false);
            dobpatt.setText("");
        }
        
        
    }//GEN-LAST:event_Dob1KeyReleased

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
            java.util.logging.Logger.getLogger(Edit_Student_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Student_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Student_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Student_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Student_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Contact;
    private javax.swing.JTextField Courses;
    private javax.swing.JLabel Cross;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JLabel Dob;
    private javax.swing.JTextField Dob1;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Error;
    private javax.swing.JLabel Error1;
    private javax.swing.JRadioButton Female;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTextField Std_Name;
    private javax.swing.JLabel Student;
    private javax.swing.JLabel Student1;
    private javax.swing.JLabel check1;
    private javax.swing.JButton choosebtn;
    private javax.swing.JLabel cross1;
    private javax.swing.JLabel dobpatt;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_Check;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField txSearch;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
    
    private void setIconImage() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("id-card.png")));
    }
    
    
    private String Gender;
}
