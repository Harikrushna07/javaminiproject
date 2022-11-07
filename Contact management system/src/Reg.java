/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author gloriamadhri
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Reg extends javax.swing.JFrame {

    /**
     * Creates new form Reg
     */ 
    Connection conn;
    public Reg() {
        conn = DB.dbconnect();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TRname = new javax.swing.JTextField();
        TRsurname = new javax.swing.JTextField();
        TRuserID = new javax.swing.JTextField();
        PRpasnew = new javax.swing.JPasswordField();
        PRconfirmpas = new javax.swing.JPasswordField();
        Bsubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 413, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("Surname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 137, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("UserID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 192, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 247, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("Confirm password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 306, 170, -1));

        TRname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRnameActionPerformed(evt);
            }
        });
        getContentPane().add(TRname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 90, -1));

        TRsurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRsurnameActionPerformed(evt);
            }
        });
        getContentPane().add(TRsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 90, -1));

        TRuserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRuserIDActionPerformed(evt);
            }
        });
        getContentPane().add(TRuserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 90, -1));

        PRpasnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRpasnewActionPerformed(evt);
            }
        });
        getContentPane().add(PRpasnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 90, -1));

        PRconfirmpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRconfirmpasActionPerformed(evt);
            }
        });
        getContentPane().add(PRconfirmpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 90, -1));

        Bsubmit.setText("Submit");
        Bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Bsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 383, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsubmitActionPerformed
        try {
            // TODO add your handling code here:
            String Surname = TRsurname.getText();
            String nam = TRname.getText();
            String UserID = TRuserID.getText();
            String pasnew = PRpasnew.getText();
            String Confimpas = PRpasnew.getText();
            PreparedStatement pst=conn.prepareStatement("insert into regi(name,surname,userid,pass,cpass) values(?,?,?,?,?)");
            pst.setString(1, nam);
            pst.setString(2, Surname);
            pst.setString(3, UserID);
            pst.setString(4, pasnew);
            pst.setString(5, Confimpas);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "added successfully");
            view1 v3 = new view1();
            v3.setVisible(true);
            if(TRname.getText().isEmpty() && TRsurname.getText().isEmpty() && TRuserID.getText().isEmpty() && PRpasnew.getText().isEmpty() && PRconfirmpas.getText().isEmpty())
            {
                
                JOptionPane.showMessageDialog(rootPane, "It is empty please enter the data");
                
            }
            else
            {
                if(!PRconfirmpas.getText().equals(PRpasnew.getText()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Password is not same");
                }
                else
                {
                    login obj1 = new login();
                    obj1.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BsubmitActionPerformed

    private void TRsurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRsurnameActionPerformed
        // TODO add your handling code here:
        String Surname = TRsurname.getText();
    }//GEN-LAST:event_TRsurnameActionPerformed

    private void TRnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRnameActionPerformed
        String nam = TRname.getText();
    }//GEN-LAST:event_TRnameActionPerformed

    private void TRuserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRuserIDActionPerformed
        // TODO add your handling code here:
        String UserID = TRuserID.getText();
    }//GEN-LAST:event_TRuserIDActionPerformed

    private void PRpasnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRpasnewActionPerformed
        // TODO add your handling code here:
        String pasnew = PRpasnew.getText();
    }//GEN-LAST:event_PRpasnewActionPerformed

    private void PRconfirmpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRconfirmpasActionPerformed
        // TODO add your handling code here:
        String Confimpas = PRpasnew.getText();
    }//GEN-LAST:event_PRconfirmpasActionPerformed

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
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsubmit;
    private javax.swing.JPasswordField PRconfirmpas;
    private javax.swing.JPasswordField PRpasnew;
    private javax.swing.JTextField TRname;
    private javax.swing.JTextField TRsurname;
    private javax.swing.JTextField TRuserID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
