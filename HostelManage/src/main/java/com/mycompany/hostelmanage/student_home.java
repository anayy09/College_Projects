/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelmanage;

import static com.mycompany.hostelmanage.applyRoom.ac_Nac;
import static com.mycompany.hostelmanage.applyRoom.shari;
import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author chitr
 */
public class student_home extends javax.swing.JFrame {

    public class db {

        public static Connection mycon() {
            Connection con = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rootdb", "root", "Arpan@03");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
            return con;
        }
    }

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form student_home
     */
    public student_home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        myinfo = new javax.swing.JButton();
        apply = new javax.swing.JButton();
        change = new javax.swing.JButton();
        fees = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        label.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon("C:\\Users\\anays\\Documents\\HostelManage anay\\HostelManage\\src\\main\\java\\com\\mycompany\\hostelmanage\\hostel images & icon\\student.png")); // NOI18N
        label.setText("WELCOME STUDENT");

        myinfo.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        myinfo.setText("View My Info");
        myinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myinfoActionPerformed(evt);
            }
        });

        apply.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        apply.setText("Apply For Room");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        change.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        change.setText("Room Change Request");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        fees.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        fees.setText("Fee Reciept");
        fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton1.setText("Going Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\anays\\Documents\\HostelManage anay\\HostelManage\\src\\main\\java\\com\\mycompany\\hostelmanage\\hostel images & icon\\icons8-logout-20.png")); // NOI18N
        jButton12.setText("LOG OUT");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\anays\\Documents\\HostelManage anay\\HostelManage\\src\\main\\java\\com\\mycompany\\hostelmanage\\hostel images & icon\\icons8-close-20.png")); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(myinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apply, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                        .addGap(0, 129, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(myinfo)
                .addGap(33, 33, 33)
                .addComponent(apply)
                .addGap(31, 31, 31)
                .addComponent(change)
                .addGap(31, 31, 31)
                .addComponent(fees)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
          int a;
        a = JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new LoginPage().setVisible(true);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a;
        a = JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
           Runtime runtime=Runtime.getRuntime();
//           try
//           {
//               Process proc=runtime.exec("shutdown -s -t 0");
//           }
//           catch(IOException e)
//           {
//               JOptionPane.showMessageDialog(null, e);
//           }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
//public void showData(){
//   JFrame f1 = new JFrame(); 
//        JLabel l5 = new JLabel("Displaying Emp Data:"); 
//        JLabel l1 = new JLabel("Emp Name:"); 
//        tf1.setBounds(240, 110, 200, 20);
//}
    String fe=null;
    private void myinfoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_myinfoActionPerformed
           myinfo.setForeground(Color.red);
        myinfo.setBackground(new Color(255,255,255));
         new infomartion().setVisible(true);
//        this.dispose();
        
        // TODO add your handling code here:
//         new infomartion().setVisible(true);
        String ids = LoginPage.login_id_user.getText();
        String std_name = null;
        String ph_no = null;
        String room = null;
        String gend = null;
        String Roll = null;
        int indiaid = 0;

        int ParentsPh = 0;
        String Home = null;
        String ac_na = null;
        String ds_ts = null;
        String sql = "Select * from register where emailid=?";
        try {
            pst = reciept.db.mycon().prepareStatement(sql);
            pst.setString(1, ids);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                std_name = rs.getString("name");
                ph_no = rs.getString("phoneno");
                ac_na = rs.getString("Room_Ac_NonAc");
                ds_ts = rs.getString("sharing");
                room = rs.getString("Room_allocated");
                gend = rs.getString("Gender");
                Roll = rs.getString("Rollno");
                indiaid = rs.getInt("addhar");
                ParentsPh = rs.getInt("Parents_ph_no");
                Home = rs.getString("Home_add");
                fe=rs.getString("Fee_details");

            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }// GEN-LAST:event_myinfoActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_applyActionPerformed
        if (fe=="Paid"){
            new reciept().setVisible(true);
        }
        else{

        new applyRoom().setVisible(true);}
    }// GEN-LAST:event_applyActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
           change.setForeground(Color.red);
        change.setBackground(new Color(255,255,255));
        String ids = LoginPage.login_id_user.getText();
        int result = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Room Change Request",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        int no = 1;
        if (result == JOptionPane.YES_OPTION) {
            String registerUserQuery = "update  register set reques='" + no + "'   where emailid='" + ids + "'";

            try {

                pst = registration.db.mycon().prepareStatement(registerUserQuery);

                if (pst.executeUpdate() != 0) {

                    // JOptionPane.showMessageDialog(null, "You have choosen " + ac_Nac + " and " +
                    // shari + " Room");
                    new applyRoom().setVisible(true);
                     
                } else {

                    JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
//            new payFees().setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {
            new student_home().setVisible(true);
        }

    }// GEN-LAST:event_changeActionPerformed

    private void feesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_feesActionPerformed
        // TODO add your handling code here:
           fees.setForeground(Color.red);
        fees.setBackground(new Color(255,255,255));
        new reciept().setVisible(true);

    }// GEN-LAST:event_feesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
   jButton1.setForeground(Color.red);
        jButton1.setBackground(new Color(255,255,255));
         String ids = LoginPage.login_id_user.getText();
        
        int result = JOptionPane.showConfirmDialog(null, "Are You Sure you want to Continue?", "ON LEAVE",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        String n = "ON LEAVE";
        String nn = "NOT ON LEAVE";
        if (result == JOptionPane.YES_OPTION) {
                new goingHome().setVisible(true);


        } else if (result == JOptionPane.NO_OPTION) {
            try {
                String registerUserQuery1 = "update  register set Leav_not='" + nn + "'  where emailid='" + ids + "'";

                pst = registration.db.mycon().prepareStatement(registerUserQuery1);
                
                pst.executeUpdate();
                new LoginPage().setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        // student_home().setLocationRelativeTo(null);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(student_home.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_home.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_home.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_home.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_home().setLocationRelativeTo(null);
                new student_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apply;
    private javax.swing.JButton change;
    private javax.swing.JButton fees;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel label;
    private javax.swing.JButton myinfo;
    // End of variables declaration//GEN-END:variables
}
