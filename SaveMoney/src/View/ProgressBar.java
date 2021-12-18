/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.ConnectionDB;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Jocelio
 * @author Renan
 */
public class ProgressBar {

    public static void main(String args[]) throws InterruptedException {

        LoadScreen load = new LoadScreen();
        load.setVisible(true);
        LoginScreen play = new LoginScreen();
        ConnectionDB c = new ConnectionDB();

        if (c.getConnection() == null) {  // TESTA A CONEXÃO COM O BD ANTES DO PROGRAMA INICAR, SE NÃO ESTIVER OK O MESMO FECHA
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                load.progressLoad.setValue(30);
                if (i <= 40) {
                    load.txtLoad.setText("Carregando BD");
                }
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados, por favor contate o suporte!");
                System.exit(0);
            }
        } else {

            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(40);
                    load.progressLoad.setValue(i);

                    //SÓ EFEITO, APAGAR DEPOIS
                    if (i <= 40) {
                        load.txtLoad.setText("Carregando BD");
                    }

                    if (i > 40 && i < 80) {
                        load.txtLoad.setText("Carregando Módulos");
                    }
                    if (i > 80) {
                        load.txtLoad.setText("Tudo Pronto!");
                    }
                    if (i == 100) {
                        load.setVisible(false);
                        play.setVisible(true);
                    }
                }
            } catch (Exception e) {
                System.out.println("Erro em Progress Bar: " + e.getMessage());
            }
        }
    }

    public void jtf_descricao_keyPressed(KeyEvent e) {
        int var01 = e.getKeyCode();

        if (var01 == KeyEvent.VK_Q) {
            LoginScreen l = new LoginScreen();
            l.setVisible(true);
        }
    }
}
