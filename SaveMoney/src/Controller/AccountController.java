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

     public boolean createAccount(String fullName, String email, String password, Object Avatar) throws SQLException {
        if (!fullName.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            Account account = new Account(fullName, email, password, Avatar);
            AccountDAO.createAccount(account);
            return true;
        }

        return false;
    }
    
    public boolean consultarLogin(String email, String password) throws SQLException {
        if (!email.isEmpty() && !password.isEmpty()) {
            boolean resposta = AccountDAO.consultarLogin(email, password);
            return resposta;
        }

        return false;
    }
    
    public Account getAccountByEmail(String email) throws SQLException{
        if (!email.isEmpty()) {
            AccountDAO ac = new AccountDAO();
            Account account = ac.getAccountByEmail(email);
            return account;
        }
        
        return null;
    }
    
     public boolean  editAccount(String fullName, String email, Object Avatar, Integer Id) throws SQLException {
      if (!fullName.isEmpty() && !email.isEmpty()) {
         AccountDAO ac = new AccountDAO();
           ac.editAccount(fullName,email, Avatar,Id);
           return true;
        }
       return false;
    }
     
     public boolean  editPass(String newPass, String oldPass, Integer Id) throws SQLException {
      if (!newPass.isEmpty() && !oldPass.isEmpty()) {
         AccountDAO ac = new AccountDAO();
           ac.editPass(newPass,oldPass, Id);
           return true;
        }
       return false;
    }
     
     
    public boolean deleteAccount(Integer id) throws SQLException {
        if (id != null) {
            return AccountDAO.deleteAccount(id);
        }
        return false;
    }
}
