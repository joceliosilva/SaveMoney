/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Entity.Account;
import java.awt.Image;
import java.sql.SQLException;

/**
 *
 * @author Renan
 */
public class AccountController {

    public boolean createAccount(String fullName, String email, String password) throws SQLException {
        if (fullName != null && email != null && password != null) {
            Account account = new Account(fullName, email, password);
            account.createAccount(account);
            return true;
        }

        return false;
    }
}
