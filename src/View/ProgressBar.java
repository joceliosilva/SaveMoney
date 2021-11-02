/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Jocelio
 */
public class ProgressBar {
      public static void main(String args[]) {
          
          LoadScreen load = new LoadScreen();
          load.setVisible(true);
          HomeScreen play = new HomeScreen();
          
          try {
              for(int i=0; i<=100; i++){
               Thread.sleep(40);
               load.progressLoad.setValue(i);
               
               if(i==100){
                   load.setVisible(false);
                   play.setVisible(true);
                   
               }
              }
          } catch (Exception e) {
          }
                  
      }
}
