/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Internal;

import Controller.AccountController;
import Controller.DisplayManager;
import DAO.AccountDAO;
import View.HomeScreen;
import static View.HomeScreen.labelAvatar;
import static View.HomeScreen.txtUser;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class EditPassScreen extends javax.swing.JInternalFrame {

         AccountController ac = new AccountController();
         DisplayManager d = new DisplayManager();
         String Email = HomeScreen.txtEmail.getText();
         String oldPassBd = null;
         String oldPass = null;
   
    public EditPassScreen() throws Exception {
        initComponents();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        txtDespesas1 = new javax.swing.JLabel();
        txtDespesas2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtNewPass = new javax.swing.JPasswordField();
        txtOldPass = new javax.swing.JPasswordField();

        setBorder(null);

        pnlFundo.setBackground(new java.awt.Color(30, 30, 60));

        txtDespesas1.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas1.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtDespesas1.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas1.setText("Senha Atual:");

        txtDespesas2.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas2.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txtDespesas2.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDespesas2.setText("Nova Senha:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_32px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("SALVAR");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setText("CANCELAR");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDespesas1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDespesas2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNewPass, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(txtOldPass)))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 409, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNewPass)
                    .addComponent(txtDespesas2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOldPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDespesas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(328, 328, 328))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
       try {                                     
           AccountDAO ac1 = new AccountDAO();
           String newPass = txtNewPass.getText();
           Integer id = null;
           boolean sucesso;    
            String oldPass = txtOldPass.getText();
           
           try {
               String Email1 = HomeScreen.txtEmail.getText();
               ac.getAccountByEmail(Email1).getAvatar();
               id = ac.getAccountByEmail(Email1).getId();
           } catch (SQLException ex) {
               Logger.getLogger(EditPassScreen.class.getName()).log(Level.SEVERE, null, ex);
           }
          
           oldPassBd = ac.getAccountByEmail(Email).getPassword();
           if(oldPass.equals(oldPassBd)){
               try {
                   AccountController ac = new AccountController();
                   sucesso = ac.editPass(newPass, oldPass,id);
                   
                   if (sucesso) {
                       JOptionPane.showMessageDialog(null, "SENHA ALTERADA COM SUCESSO!");
                       this.dispose();
                       
                   } else {
                       JOptionPane.showMessageDialog(null, "Informe os campos corretamente!");
                   }
               }  catch (Exception ex) {
                   Logger.getLogger(EditPassScreen.class.getName()).log(Level.SEVERE, null, ex);
               }
           }else{
               JOptionPane.showMessageDialog(null, "A senha atual digitada esta incorreta!");
           }
           
       } catch (SQLException ex) {
            Logger.getLogger(EditPassScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
            this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JLabel txtDespesas1;
    private javax.swing.JLabel txtDespesas2;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtOldPass;
    // End of variables declaration//GEN-END:variables

     public boolean veriPass() throws SQLException{
          oldPassBd = ac.getAccountByEmail(Email).getPassword();
          
            if(oldPass.equals(oldPassBd)){
                return true;
            }else
                return false;
     }
     
    
}
