/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionDB;
import Model.Enums;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class ExpenseDAO {
    private static Connection conexao = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public ExpenseDAO() {
        conexao = new ConnectionDB().getConnection();  //INICIA A CONEÇÃO COM O BD
    }

    public static boolean createExpense(Integer accountId, Integer categoryId, Integer cardId, Double value, String date, String description, Integer formOfPayment, Integer numberOfInstallments, Integer status) throws SQLException {
    
        String sql = "insert into Expense "
                + "(AccountId,CategoryId,CardId,Value,Date,Description,FormOfPayment,NumberOfInstallments, Status)"
                + " values (?,?," + cardId + ",?,'" + date + "',?,?,?,?)";
        conexao = new ConnectionDB().getConnection();
        try {
            ps = conexao.prepareStatement(sql);

            ps.setInt(1, accountId);
            ps.setInt(2, categoryId);
            ps.setDouble(3, value);
            ps.setString(4, description);
            ps.setInt(5, formOfPayment);
            ps.setInt(6, numberOfInstallments);
            ps.setInt(7, status);

            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar despesa: " + e);
            return false;
        } finally {
            ps.close();
            conexao.close();
        }
    }
}
