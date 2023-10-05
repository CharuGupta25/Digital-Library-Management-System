package digitallibrarymanagement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class Login extends javax.swing.JFrame {

    private Object PasswordField1;
    private Object jTextField1;

    public Login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int x = (int) toolkit.getScreenSize().getWidth();
        int y = (int) toolkit.getScreenSize().getHeight();
        this.setSize(1600, 800);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Name = new java.awt.Label();
        Password = new java.awt.Label();
        jPasswordField2 = new javax.swing.JPasswordField();
        textField1 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login background.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login background.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 240));
        setMinimumSize(new java.awt.Dimension(1567, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setBackground(new java.awt.Color(255, 255, 204));
        Name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Name.setText("Username");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 80, -1));
        Name.getAccessibleContext().setAccessibleDescription("");

        Password.setBackground(new java.awt.Color(255, 255, 204));
        Password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 204));
        jPasswordField2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 193, -1));

        textField1.setBackground(new java.awt.Color(255, 255, 204));
        textField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textField1.setForeground(new java.awt.Color(0, 0, 102));
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        textField1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField1TextValueChanged(evt);
            }
        });
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 193, -1));
        textField1.getAccessibleContext().setAccessibleParent(textField1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library management system.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 580, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9ef51aef-0dc1-4b6b-bb14-e5cdc1cbda96.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField1TextValueChanged
        //String PasswordField1=Password.getText();
    }//GEN-LAST:event_textField1TextValueChanged

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // jTextField1=Name.getText();
    }//GEN-LAST:event_textField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String PasswordField1 = Password.getText();
        String jTextField1 = Name.getText();
        if (!jTextField1.equals("Charu Gupta") && PasswordField1.equals("12345")) {
            JOptionPane.showMessageDialog(null, "Incorrect Username and Password");

        } else {
            setVisible(false);
            new home().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Name;
    private java.awt.Label Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
