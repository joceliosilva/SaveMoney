/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.math.MathContext;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 * @author Jocelio
 */
public class ConnectionDB {
 
  
    public Connection getConnection() {
        Connection conn = null;

        try { // Carrega o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: O driver do BD não foi encontrado!");
        }

        try { // Conexão
       
             String local = "localhost";
             String dataBase = "savemoney";
             String user = "root";
             String pass= "";  
      
            conn = DriverManager.getConnection("jdbc:mysql://" + local + "/" + dataBase + "?useSSL=false", user, pass);

        } catch (SQLException ex) {
          
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return conn;
    }
}
