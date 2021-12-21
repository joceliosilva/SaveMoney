/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AccountDAO;
import Model.Entity.Account;
import java.sql.SQLException;

/**
 *
 * @author Renan
 */
public class AccountController {

    public boolean createAccount(String fullName, String email, String password) throws SQLException {
        if (fullName != null && email != null && password != null) {
            Account account = new Account(fullName, email, password);
            AccountDAO.createAccount(account);
            return true;
        }

        return false;
    }
    
    public boolean consultarLogin(String Email, String Password) throws SQLException {
        if (Email != null && Password != null) {
            boolean resposta = AccountDAO.consultarLogin(Email, Password);
            return resposta;
        }

        return false;
    }
}
