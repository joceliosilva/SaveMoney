/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 * @author Jocelio
 */
public class AccountDAO {

    private Connection conexao = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public AccountDAO() {
        conexao = new ConnectionDB().getConnection();  //INICIA A CONEÇÃO COM O BD
    }

    public void createAccount(Account a) throws SQLException { //FUNÇÃO PARA ADD CONTA

        String sql = "insert into Account (FullName,Email,Password,Avatar) values (?,?,?,?)"; //SQL 

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, a.getFullName());
            pst.setString(2, a.getEmail());
            pst.setString(3, a.getPassword());
            pst.setString(4, null); // analisar posteriormente

            pst.executeUpdate();            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar conta: " + e);
        } finally{
            pst.close();
            conexao.close();
        }
    }
}
