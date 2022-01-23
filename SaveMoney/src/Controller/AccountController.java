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
        if (!fullName.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            Account account = new Account(fullName, email, password);
            AccountDAO.createAccount(account);
            return true;
        }

        return false;
    }
    
    public boolean consultarLogin(String email, String password) throws SQLException {
        if (email.isEmpty() && password.isEmpty()) {
            boolean resposta = AccountDAO.consultarLogin(email, password);
            return resposta;
        }

        return false;
    }
}
