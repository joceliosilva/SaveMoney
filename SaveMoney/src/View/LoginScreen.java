package View;

import Controller.AccountController;
import Controller.DisplayManager;
import static View.HomeScreen.txtUser;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jocelio
 * @author Renan
 */
public class LoginScreen extends javax.swing.JFrame {

    DisplayManager d = new DisplayManager();
    AccountController ac = new AccountController();
    
    public static String name1 = "";
    public static Blob avatar;
    public static String email1 = "";
    public static String pass = "";
    public static Date date = null;

    public LoginScreen() {
        initComponents();
        setIcon();
        labelEmail.requestFocus();
        setLocationRelativeTo(null);  //Carrega o form no centro da tela
    }

    private void pegarResolucao() {         //Calcula a resoluçao para se adaptara diferentes telas
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width + 5), (dimensao.height - 38));
    }

    private void setIcon() {
        URL url = this.getClass().getResource("/Images/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        txtLogin = new javax.swing.JLabel();
        labelEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txtRegister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(34, 36, 80));
        setIconImages(getIconImages());
        setLocationByPlatform(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1440, 1024));

        Background.setBackground(new java.awt.Color(64, 43, 100));

        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(240, 240, 240));
        txtLogin.setText("Login");
        txtLogin.setMaximumSize(new java.awt.Dimension(500, 48));

        labelEmail.setBackground(new java.awt.Color(64, 43, 100));
        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelEmail.setToolTipText("Digite o email...");
        labelEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        labelEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        labelEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelEmailActionPerformed(evt);
            }
        });

        labelPassword.setBackground(new java.awt.Color(64, 43, 100));
        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelPassword.setToolTipText("Digite a senha...");
        labelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        labelPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        labelPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonLogin.setBackground(new java.awt.Color(85, 65, 118));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(213, 220, 224));
        buttonLogin.setText("Entrar");
        buttonLogin.setBorder(null);
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Não possui Conta?");

        txtRegister.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtRegister.setText("Cadastre-se!");
        txtRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegisterMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_32px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(txt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegister)))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(31, 31, 31)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(txtRegister))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(443, 365));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelEmailActionPerformed

    private void txtRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterMouseClicked
        RegisterScreen frame = new RegisterScreen();
        d.openFrame(frame);
        this.dispose();
    }//GEN-LAST:event_txtRegisterMouseClicked

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        String email = labelEmail.getText();
        String pass = labelPassword.getText();
        boolean sucesso;

        try {            
            sucesso = ac.consultarLogin(email, pass);

            if (sucesso == true) {

//              GAMBIARRA
                name1 = ac.getAccountByEmail(email).getFullName();
                avatar = (Blob) ac.getAccountByEmail(email).getAvatar();
                email1 = ac.getAccountByEmail(email).getEmail();
                date = ac.getAccountByEmail(email).getCeationDate();
//              FIM DA GAMBIARRA

                d.openFrame(new HomeScreen());
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Login não realizado!\nFavor conferir o Email e Senha digitados!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int close = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair?", "Sair" ,JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(close == JOptionPane.YES_OPTION){
            System.exit(0);
        } 
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField labelEmail;
    private javax.swing.JPasswordField labelPassword;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtRegister;
    // End of variables declaration//GEN-END:variables

}
