/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Utilitys;

import Controller.DisplayManager;
import Connection.ConnectionDB;
import View.LoadScreen;
import View.LoginScreen;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Exception.SMException;

/**
 *
 * @author Jocelio
 * @author Renan
 */
public class ProgressBar {

    public static void main(String args[]) throws InterruptedException {

        ConnectionDB c = new ConnectionDB();
        LoadScreen load = new LoadScreen();
        LoginScreen play = new LoginScreen();
        
        DisplayManager d = new DisplayManager();
        d.openFrame(load);        

        if (c.getConnection() == null) {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                load.progressLoad.setValue(30);
                if (i <= 40) {
                    load.txtLoad.setText("Carregando BD");
                }
                JOptionPane.showMessageDialog(null, SMException.EX0004);
                System.exit(0);
            }
        } else {
            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(40);
                    load.progressLoad.setValue(i);

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
                        d.closeFrame(load);
                        d.openFrame(play);
                    }
                }
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, SMException.EX0005);
                System.out.println(ex.getMessage());
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
