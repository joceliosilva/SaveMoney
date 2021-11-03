/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Jocelio
 * @author Renan
 */
public class ProgressBar {

    public static void main(String args[]) {

        LoadScreen load = new LoadScreen();
        load.setVisible(true);
        LoginScreen play = new LoginScreen();

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
