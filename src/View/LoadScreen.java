
package View;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Jocelio
 */
public class LoadScreen extends javax.swing.JFrame {

    
    public LoadScreen() {
        initComponents();
        setIcon();
        pegarResolucao(); 
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
        txtLogo = new javax.swing.JLabel();
        progressLoad = new javax.swing.JProgressBar();
        txtLoad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SaveMoney");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(34, 36, 80));
        setIconImages(getIconImages());
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        setSize(new java.awt.Dimension(1440, 1024));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${title}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        Background.setBackground(new java.awt.Color(34, 36, 80));

        txtLogo.setBackground(new java.awt.Color(255, 255, 255));
        txtLogo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        txtLogo.setForeground(new java.awt.Color(255, 255, 255));
        txtLogo.setText("SaveMoney");
        txtLogo.setMaximumSize(new java.awt.Dimension(500, 48));

        progressLoad.setStringPainted(true);

        txtLoad.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        txtLoad.setForeground(new java.awt.Color(255, 255, 255));
        txtLoad.setText("Carregando...");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(524, 524, 524)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txtLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progressLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoad))
                .addContainerGap(572, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(txtLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progressLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(1423, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoadScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadScreen().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    public javax.swing.JProgressBar progressLoad;
    private javax.swing.JLabel txtLoad;
    private javax.swing.JLabel txtLogo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
