/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.LoginDAO;
import View.HomeScreen;
import View.LoginScreen;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class LoginController {
    public boolean consultarLogin(String Email, String Password) throws SQLException {
        if (Email != null && Password != null) {
            boolean resposta = LoginDAO.consultarLogin(Email, Password);
            return resposta;
        }

        return false;
    }
}
