package View;

import Controller.AccountController;
import Controller.DisplayManager;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jocelio
 * @author Renan
 */
public class RegisterScreen extends javax.swing.JFrame {

    DisplayManager d = new DisplayManager();
    URL l= this.getClass().getResource("Images/user.png");
    public static String imgPath = null;
    public static byte[] imagem= null;
       
    

    public RegisterScreen() {
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

    private void setIcon() {  //Setar o icone do programa
        URL url = this.getClass().getResource("/Images/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    public static void selectFile1() {
         JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setDialogTitle("Selecionar avatar");
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Imagens (*png, jpg, jpeg)", "png", "jpg", "jpeg")); //SELECIONA O FILTRO DE ARQUIVOS
        fc.setAcceptAllFileFilterUsed(false);  //Limita os filtros de arquivos
        int res = fc.showOpenDialog(null);
       
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            
            //Limpa a imagem atual do JLabel
            labelLocalFile.setIcon(null);
            imgPath = arquivo.getAbsolutePath();

            //Seta a imagem selecionada
            Image img = new ImageIcon(arquivo.getAbsolutePath()).getImage();

            //Redimensiona a imagen
            Image newimg = img.getScaledInstance(280, 192, java.awt.Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(newimg);

            //Seta a imagem ao componente JLabel
              labelLocalFile.setIcon(ResizeImage(imgPath,null));
        }else{
            imgPath = null;
        }
         
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        txtRegister = new javax.swing.JLabel();
        labelEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JPasswordField();
        buttonRegister = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txtLogin1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        buttonF = new javax.swing.JButton();
        labelAvatar = new javax.swing.JLabel();
        labelLocalFile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(34, 36, 80));
        setIconImages(getIconImages());
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        setSize(new java.awt.Dimension(1440, 1024));

        Background.setBackground(new java.awt.Color(64, 43, 100));

        txtRegister.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        txtRegister.setForeground(new java.awt.Color(240, 240, 240));
        txtRegister.setText("Cadastro");
        txtRegister.setMaximumSize(new java.awt.Dimension(500, 48));

        labelEmail.setBackground(new java.awt.Color(64, 43, 100));
        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelEmail.setToolTipText("Digite o usuário...");
        labelEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        labelEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        labelEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelEmailActionPerformed(evt);
            }
        });

        labelPassword.setBackground(new java.awt.Color(64, 43, 100));
        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelPassword.setToolTipText("Digite a senha...");
        labelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        labelPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        labelPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonRegister.setBackground(new java.awt.Color(85, 65, 118));
        buttonRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(213, 220, 224));
        buttonRegister.setText("Cadastrar");
        buttonRegister.setBorder(null);
        buttonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegisterMouseClicked(evt);
            }
        });
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Ou");

        txtLogin1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtLogin1.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin1.setText("Faça Login");
        txtLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLogin1MouseClicked(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(64, 43, 100));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setToolTipText("Digite o usuário...");
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Completo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        buttonF.setBackground(new java.awt.Color(85, 65, 118));
        buttonF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonF.setForeground(new java.awt.Color(213, 220, 224));
        buttonF.setText("Selecionar");
        buttonF.setBorder(null);
        buttonF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFMouseClicked(evt);
            }
        });
        buttonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFActionPerformed(evt);
            }
        });

        labelAvatar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAvatar.setForeground(new java.awt.Color(240, 240, 240));
        labelAvatar.setText("Avatar");

        labelLocalFile.setBackground(new java.awt.Color(255, 255, 255));
        labelLocalFile.setForeground(new java.awt.Color(255, 255, 255));
        labelLocalFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLocalFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        labelLocalFile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelLocalFile.setPreferredSize(new java.awt.Dimension(131, 131));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin1))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(labelLocalFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelAvatar)))
                .addGap(170, 170, 170))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelAvatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(buttonF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelLocalFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin1)
                    .addComponent(txt1))
                .addContainerGap())
        );

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(590, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelEmailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed

    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void txtLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogin1MouseClicked
        LoginScreen frame = new LoginScreen();
        d.openFrame(frame);
        this.dispose();
    }//GEN-LAST:event_txtLogin1MouseClicked

    private void buttonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseClicked

       if(imgPath != null){
        File img = new File(imgPath);
        byte[] imagem = new byte[(int)img.length()];
        DataInputStream is = null;
        try {
           is = new DataInputStream(          
                   new FileInputStream(imgPath));
       } catch (FileNotFoundException ex) {
            Logger.getLogger(RegisterScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            is.readFully(imagem);
       } catch (IOException ex) {
            Logger.getLogger(RegisterScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
      try {
           is.close();
       } catch (IOException ex) {
           Logger.getLogger(RegisterScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         
        String fullName = txtName.getText();
        String email = labelEmail.getText();
        String password = labelPassword.getText();
        Object byteImg = imagem;
        boolean sucesso;

        try {
            AccountController ac = new AccountController();
            sucesso = ac.createAccount(fullName, email, password, byteImg);

            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Cadastro Realizado, Efetue Login!");
                LoginScreen frame = new LoginScreen();
                d.openFrame(frame);
                this.dispose();
                // this.limparCampos(); // IMPLEMENTAR FUTURAMENTE
            } else {
                JOptionPane.showMessageDialog(null, "Informe os campos corretamente!");
            }
        } catch (HeadlessException | SQLException e) {
        }
        }else {
                JOptionPane.showMessageDialog(null, "Informe os campos corretamente!");
            }
    }//GEN-LAST:event_buttonRegisterMouseClicked

    private void buttonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFActionPerformed

    }//GEN-LAST:event_buttonFActionPerformed

    private void buttonFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFMouseClicked
        selectFile1();
    }//GEN-LAST:event_buttonFMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("WindowsClassic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton buttonF;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JLabel labelAvatar;
    private javax.swing.JTextField labelEmail;
    public static javax.swing.JLabel labelLocalFile;
    private javax.swing.JPasswordField labelPassword;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txtLogin1;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtRegister;
    // End of variables declaration//GEN-END:variables

   public static ImageIcon ResizeImage(String ImagePath, byte [] pic) {
       ImageIcon Img = null;
       
       if(ImagePath != null){
           Img = new ImageIcon(ImagePath);
       } else{
           Img = new ImageIcon("/Images/user.png");
       }
       Image img = Img.getImage();
       Image newImg = img.getScaledInstance(labelLocalFile.getWidth(), labelLocalFile.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon image = new ImageIcon(newImg);
       return image;
    }



}
