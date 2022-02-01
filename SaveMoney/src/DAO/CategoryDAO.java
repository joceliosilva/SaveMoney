/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Home.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Evaristo
 */
public class CategoryDAO {
  private static Connection conexao = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public CategoryDAO() {
        conexao = new ConnectionDB().getConnection();  //INICIA A CONEÇÃO COM O BD
    }

    public static void createCategory(String c) throws SQLException { //FUNÇÃO PARA ADD CONTA

        String sql = "insert into Category (Name) values (?)"; //SQL 
        conexao = new ConnectionDB().getConnection();
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, c);

            ps.executeUpdate();            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar uma categoria: " + e);
        } finally{
            ps.close();
            conexao.close();
        }
    }
}
