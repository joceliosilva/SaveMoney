
package View;

import Controlers.DisplayManager;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jocelio
 */
public class RegisterScreen extends javax.swing.JFrame {
    DisplayManager d = new DisplayManager();
    
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
  
  
  private void setIcon(){
    URL url = this.getClass().getResource("/Images/icon.png");
Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
this.setIconImage(imagemTitulo);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Background = new javax.swing.JPanel();
        txtRegister = new javax.swing.JLabel();
        labelEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JPasswordField();
        buttonRegister = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txtLogin1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labelLocalFile = new javax.swing.JTextField();
        buttonF = new javax.swing.JButton();
        labelAvatar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro | SaveMoney");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(34, 36, 80));
        setIconImages(getIconImages());
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        setSize(new java.awt.Dimension(1440, 1024));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${title}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        Background.setBackground(new java.awt.Color(34, 36, 80));

        txtRegister.setBackground(new java.awt.Color(255, 255, 255));
        txtRegister.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        txtRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtRegister.setText("Cadastro");
        txtRegister.setMaximumSize(new java.awt.Dimension(500, 48));

        labelEmail.setBackground(new java.awt.Color(34, 36, 80));
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelEmail.setToolTipText("Digite o usuário...");
        labelEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        labelEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        labelEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelEmailActionPerformed(evt);
            }
        });

        labelPassword.setBackground(new java.awt.Color(34, 36, 80));
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelPassword.setToolTipText("Digite a senha...");
        labelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        labelPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        labelPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonRegister.setText("CADASTRAR");
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

        txt1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Ou");

        txtLogin1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLogin1.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin1.setText("Faça Login");
        txtLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLogin1MouseClicked(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(34, 36, 80));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setToolTipText("Digite o usuário...");
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Completo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        labelLocalFile.setEditable(false);
        labelLocalFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelLocalFileActionPerformed(evt);
            }
        });

        buttonF.setText("Selecionar");
        buttonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFActionPerformed(evt);
            }
        });

        labelAvatar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAvatar.setForeground(new java.awt.Color(255, 255, 255));
        labelAvatar.setText("Avatar");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(txtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelAvatar))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(labelLocalFile, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonF))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin1)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(txtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAvatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLocalFile))
                .addGap(32, 32, 32)
                .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin1)
                    .addComponent(txt1))
                .addContainerGap())
        );

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(621, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelEmailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void txtLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogin1MouseClicked
        d.OpenLogin();
        this.dispose();
    }//GEN-LAST:event_txtLogin1MouseClicked

    private void buttonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseClicked
      
    }//GEN-LAST:event_buttonRegisterMouseClicked

    private void labelLocalFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelLocalFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelLocalFileActionPerformed

    private void buttonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFActionPerformed
        JFileChooser file = new JFileChooser();
         file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setDialogTitle("Selecionar avatar");
         file.addChoosableFileFilter(new FileNameExtensionFilter( "Imagens (*.png)", "png")); //SELECIONA O FILTRO DE ARQUIVOS
         file.setAcceptAllFileFilterUsed(false); //IMPEDE A SELEÇÃO DE OUTRO TIPO DE ARQUIVO
         int i= file.showSaveDialog(null);
      
         if (i==1){
          labelLocalFile.setText("");  //SE O USUARIO NÃOSELECIONAR NADA O CAMPO FICA VAZIO
       } else {
           File arquivo = file.getSelectedFile();
         labelLocalFile.setText(arquivo.getPath());
       }   // PREENCHE O CAMPO COM O CAMINHO DO ARQUIVO
       
 
    }//GEN-LAST:event_buttonFActionPerformed

  
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
    private javax.swing.JTextField labelLocalFile;
    private javax.swing.JPasswordField labelPassword;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txtLogin1;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtRegister;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
