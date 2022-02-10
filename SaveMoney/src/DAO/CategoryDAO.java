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
import java.util.ArrayList;
import java.util.List;
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

    public static void createCategory(String c) throws SQLException { //FUNÇÃO PARA ADD CATEGORIA

        String sql = "insert into Category (Name) values (?)"; //SQL 
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, c);

            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar uma categoria: " + e);
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static Category getCategoryByName(String name) throws SQLException {
        String sql = "select * from Category where Name = ?";
        conexao = new ConnectionDB().getConnection();

        Category cat = null;

        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, name);

            rs = ps.executeQuery();

            if (rs.next()) {
                cat = new Category(rs.getInt("Id"), rs.getString("Name"));
            }

            return cat;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar categoria: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static List<String> getcategoryList() throws SQLException {
        String sql = "select * from Category"; // Filtrar categorias pela conta do usuario
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);

            rs = ps.executeQuery();

            List<String> catList = new ArrayList();

            while (rs.next()) {
                catList.add(rs.getString("Name"));
            }
            return catList;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar lista de categorias: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
    }
}
