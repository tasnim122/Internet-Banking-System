package LoginActivity;

import AtmActivity.Transactions;
import internetbankingsystem.DBConnection;
import internetbankingsystem.FirstPage;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tasnim
 */
public class AtmLogin extends javax.swing.JFrame {

    public AtmLogin() {
        initComponents();
//        userName.setBackground(new Color(0,0,0,1));
//        password.setBackground(new Color(0,0,0,1));
        show.setVisible(false);
        show.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        userName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        otp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 118, 221));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ATM Login");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 598, 57));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hello! Let's get started");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 598, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Card Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 510, -1));

        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("______________________________________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 390, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 226, 255));
        jLabel9.setText("PIN Number");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("________________________________________________________");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        password.setFont(password.getFont().deriveFont(password.getFont().getSize()+4f));
        password.setBorder(null);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 390, 40));
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 390, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gellary/icons8-close-35.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 40));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 390, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gellary/icons8-otp-35.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 40, 40));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gellary/eye.png"))); // NOI18N
        show.setText("jLabel11");
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 40, 40));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gellary/invisible.png"))); // NOI18N
        hide.setText("jLabel11");
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 40, 40));
        jPanel2.add(otp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 390, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("If you have OTP, then don't need Card and pin");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 510, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(199, 226, 255));
        jLabel11.setText("OTP (if you have)");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 510, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gellary/icons8-credit-card-35_1.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 610, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gellary/ATM.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 580));

        setSize(new java.awt.Dimension(1124, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
        new FirstPage().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        password.setEchoChar((char) 0);
        hide.setVisible(false);
        hide.setEnabled(false);
        show.setVisible(true);
        show.setEnabled(true);
    }//GEN-LAST:event_hideMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        password.setEchoChar((char) 8226);
        hide.setVisible(true);
        hide.setEnabled(true);
        show.setVisible(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DBConnection dbconnect = new DBConnection();
        String otp = this.otp.getText();
        if (!otp.equals("")) {
            try {
                java.sql.ResultSet rs1 = dbconnect.s.executeQuery("SELECT * FROM request WHERE otp = '" + otp + "' ");
                if (rs1.next()) {
                    double amount = rs1.getDouble("amount");
                    long accountNumber = rs1.getLong("accountNumber");
                    String name = rs1.getString("name");
                    String discription = "Withdraw by OTP";

                    dbconnect.s.executeUpdate("UPDATE userdetails SET balance = balance  - '" + amount + "', point = point + 15  WHERE accountNumber = '" + accountNumber + "'");
                     dbconnect.s.executeUpdate("DELETE FROM request WHERE otp = '" + otp + "'");
                    dbconnect.s.executeUpdate("INSERT INTO transaction (accountNumber,name, discription, amount) VALUES ('" + accountNumber + "','" + name + "', '" + discription + "', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, amount+" TK. Withdraw Successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid OTP. Try with new OTP");
                }
            } catch (SQLException e) {
                String errorMessage = "SQL Exception: " + e.getMessage();
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            String cardNumber = this.userName.getText();
            String password = new String(this.password.getPassword());

            if (userName.equals("")) {

                JOptionPane.showMessageDialog(null, "Enter your Username");
                return;
            }
            if (password.equals("")) {

                JOptionPane.showMessageDialog(null, "Enter your Password");
                return;
            }
            try {

                String loginQuery = "SELECT * FROM userdetails WHERE cardNumber='" + cardNumber + "' AND pinNumber='" + password + "'";
                java.sql.ResultSet rs = dbconnect.s.executeQuery(loginQuery);

                if (rs.next()) {
                    setVisible(false);
                    new Transactions(cardNumber).setVisible(true);
                    JOptionPane.showMessageDialog(null, "login Successfull");
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Pin or CardNumber");
                }

                

            } catch (SQLException e) {
                String errorMessage = "SQL Exception: " + e.getMessage();
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hide;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField otp;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel show;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
