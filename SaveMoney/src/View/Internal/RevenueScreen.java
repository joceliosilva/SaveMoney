/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Internal;

import Controller.AccountController;
import Controller.DisplayManager;
import Controller.RevenueController;
import Model.Entity.Account;
import Model.Enums.*;
import static View.LoginScreen.email1;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class RevenueScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form DashboardScreen
     *
     * @throws java.lang.Exception
     */
    DisplayManager d = new DisplayManager();
    RevenueController rc = new RevenueController();
    AccountController ac = new AccountController();
    Account a = ac.getAccountByEmail(email1);

    String email = a.getEmail();
    Integer accId = a.getId();

    public RevenueScreen() throws Exception {
        initComponents();
        rc.getMonthList(cmbreferenceMonth);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt5 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        chooserData = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        cmbreferenceMonth = new javax.swing.JComboBox<>();
        txt6 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        txt7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(30, 30, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt5.setBackground(new java.awt.Color(255, 255, 255));
        txt5.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt5.setText("Descrição");
        jPanel1.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 183, 30));

        txt4.setBackground(new java.awt.Color(255, 255, 255));
        txt4.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt4.setText("Mês de Referência");
        jPanel1.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 210, 30));

        chooserData.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(chooserData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 210, 30));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 260, 230));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 100, 40));

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 100, 40));

        jPanel1.add(cmbreferenceMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 210, 30));

        txt6.setBackground(new java.awt.Color(255, 255, 255));
        txt6.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt6.setText("Valor");
        jPanel1.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 183, 30));
        jPanel1.add(txtValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 220, 30));

        txt7.setBackground(new java.awt.Color(255, 255, 255));
        txt7.setFont(new java.awt.Font("Ruda", 0, 24)); // NOI18N
        txt7.setForeground(new java.awt.Color(255, 255, 255));
        txt7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt7.setText("Data");
        jPanel1.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 183, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_32px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastre uma receita para o mês atual!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked

        Double value = Double.parseDouble(txtValue.getText());
        String description = txtDescricao.getText(); // NULL
        Month referenceMonth = (Month) cmbreferenceMonth.getSelectedItem();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date data = chooserData.getDate();
        String dataFormatada = sdf.format(data);

        try {
            boolean sucesso = rc.createRevenue(accId, value, referenceMonth.getNum(), dataFormatada, description);

            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Receita salva com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Informe os campos corretamente!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RevenueScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        txtValue.setText(null);
        txtDescricao.setText(null);
        chooserData.setDate(new Date());
    }//GEN-LAST:event_btnLimparMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser chooserData;
    private javax.swing.JComboBox<Month> cmbreferenceMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
