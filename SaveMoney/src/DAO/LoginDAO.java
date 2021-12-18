/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jocelio
 */
public class LoginDAO {

    private static Connection conexao = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public LoginDAO() {
        conexao = new ConnectionDB().getConnection();  //INICIA A CONEÇÃO COM O BD
    }

    public static boolean consultarLogin(String Email, String Password) throws SQLException {
        // Manda como parametro para ele duas variaveis para ele procurar no banco de dados!
        boolean autenticado = false;
        String sql = "select FullName, Email, Password from account where  Email= ? and Password = ?";
        conexao = new ConnectionDB().getConnection(); // Nao esta pegando a conecao pelo construtor
        try {
            ps = conexao.prepareStatement(sql);

            ps.setString(1, Email);
            ps.setString(2, Password);
            
            rs = ps.executeQuery();

            if (rs.next()) {
                String loginBanco = rs.getString("Email");
                String senhaBanco = rs.getString("Password");

                autenticado = true;  // SE OS DADOS DIGITADOS NOS CAMPOS FOREM IGUAIS A DA BUSCA NO BANCO RETORNA VERDADEIRO
            }

            return autenticado;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar conta: " + e);
        } finally {
            ps.close();
            conexao.close();
        }
        return autenticado;
    }
}
