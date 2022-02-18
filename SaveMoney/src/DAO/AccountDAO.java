/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionDB;
import Model.Entity.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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

        String sql = "insert into Account (FullName,Email,Password,Avatar,CreationDate) values (?,?,?,?,?)"; //SQL 
        conexao = new ConnectionDB().getConnection();
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, a.getFullName());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getPassword());
            ps.setObject(4, a.getAvatar());

            Date dateNow = Date.valueOf(LocalDate.now().toString());
            ps.setDate(5, dateNow);

            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar conta: " + e);
        } finally {
            ConnectionDB.closeConnection(conexao, ps);
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
        String sql = "select Id, FullName, Email, Password, Avatar, CreationDate from account where  Email= ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, email);

            rs = ps.executeQuery();

            if (rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("Id"));
                account.setFullName(rs.getString("FullName"));
                account.setEmail(rs.getString("Email"));
                account.setPassword(rs.getString("Password"));
                account.setAvatar(rs.getBlob("Avatar"));
                account.setCeationDate(rs.getDate("CreationDate"));
                
                return account;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar conta: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
        return null;
    }
     public void editAccount(String email, String fullName, Object Avatar,Integer Id) throws SQLException {
        String sql = "update account set FullName= ?, Email =? , Avatar= ?  where  Id=?";
        conexao = new ConnectionDB().getConnection();

         try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, fullName);
            ps.setString(2, email);
            ps.setObject(3, Avatar);
            ps.setInt(4, Id);
            ps.executeUpdate();
            
         } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao editar conta: " + e);
            
        } finally {
            ps.close();
            conexao.close();
       } 
    }
     
      public void editPass(String newPass, String oldPass,Integer Id) throws SQLException {
      String sql = "update account set Password= ? where  Id=?";
        conexao = new ConnectionDB().getConnection();

         try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, newPass);
            ps.setInt(2, Id);
            ps.executeUpdate();
            
         } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao alterar senha: " + e);
            
        } finally {
            ps.close();
            conexao.close();
       } 
    }
    
    
    public static boolean deleteAccount(Integer id) throws SQLException {
        String sql = "delete from Account where Id = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar conta: " + e);
            return false;
        } finally {
            ps.close();
            conexao.close();
        }
    }

   
}
