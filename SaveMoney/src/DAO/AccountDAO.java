/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Entity.*;
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

    private static Connection conexao = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public AccountDAO() {
        conexao = new ConnectionDB().getConnection();  //INICIA A CONEÇÃO COM O BD
    }

    public static void createAccount(Account a) throws SQLException {

        String sql = "insert into Account (FullName,Email,Password,Avatar) values (?,?,?,?)"; //SQL 
        conexao = new ConnectionDB().getConnection();
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, a.getFullName());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getPassword());
            ps.setString(4, null); // analisar posteriormente

            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar conta: " + e);
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static boolean consultarLogin(String email, String password) throws SQLException {
        // Manda como parametro para ele duas variaveis para ele procurar no banco de dados!
        boolean autenticado = false;
        String sql = "select Id, FullName, Email, Password from account where  Email= ? and Password = ?";
        conexao = new ConnectionDB().getConnection();
        try {
            ps = conexao.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            rs = ps.executeQuery();

            if (rs.next()) {
                autenticado = true;  // SE OS DADOS DIGITADOS NOS CAMPOS FOREM IGUAIS A DA BUSCA NO BANCO RETORNA VERDADEIRO
            }

            return autenticado;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar conta: " + e);
        } finally {
            ps.close();
            conexao.close();
        }
        return autenticado;
    }

    public Account getAccountByEmail(String email) throws SQLException {
        String sql = "select Id, FullName, Email, Password from account where  Email= ?";
        conexao = new ConnectionDB().getConnection();
        
        Account account = null;
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, email);

            rs = ps.executeQuery();

            if (rs.next()) {
                account = new Account(rs.getInt("Id"), rs.getString("FullName"), rs.getString("Email"), rs.getString("Password"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar conta: " + e);
        } finally {
            ps.close();
            conexao.close();
        }
        return account;
    }
}
