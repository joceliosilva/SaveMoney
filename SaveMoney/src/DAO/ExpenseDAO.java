/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionDB;
import Model.Enums.FormOfPayment;
import Model.Enums.FormOfPayment.ExpenseStatus;
import Model.Home.Category;
import Model.Home.Expense;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class ExpenseDAO {

    private static Connection conexao = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public ExpenseDAO() throws SQLException {
        conexao = new ConnectionDB().getConnection();  //INICIA A CONEÇÃO COM O BD
    }

    public static boolean createExpense(Integer accountId, Integer categoryId, Integer cardId, Double value, String date, String description, Integer formOfPayment, Integer numberOfInstallments, Integer status) throws SQLException {
        String sql = "insert into Expense (AccountId,CategoryId,CardId,Value,Date,Description,FormOfPayment,NumberOfInstallments, Status)"
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
            ConnectionDB.closeConnection(conexao, ps);
        }
    }

    public static List<Double> getExpenseValueListByAccountId(Integer accId) throws SQLException {
        String sql = "select * from Expense where AccountId = ? And Status = 1;";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, accId);

            rs = ps.executeQuery();

            List<Double> values = new ArrayList();

            while (rs.next()) {
                values.add(rs.getDouble("Value"));
            }
            return values;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar valores das despesas: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static List<Expense> getExpenseListByAccountId(Integer accId) throws SQLException {
        String sql = "select * from Expense where AccountId = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, accId);

            rs = ps.executeQuery();

            List<Expense> values = new ArrayList();

            while (rs.next()) {
                Expense e = new Expense();

                FormOfPayment pay = FormOfPayment.CREDITO;
                pay = pay.findFormOfPayment(rs.getInt("FormOfPayment"));

                ExpenseStatus status = ExpenseStatus.PAGO;
                status = status.findStatus(rs.getInt("Status"));

                e.setId(rs.getInt("Id"));
                e.setAccountId(rs.getInt("AccountId"));
                e.setCategoryId(rs.getInt("CategoryId"));
                e.setCardId(rs.getInt("CardId"));
                e.setValue(rs.getDouble("Value"));
                e.setDate(rs.getDate("Date"));
                e.setDescription(rs.getString("Description"));
                e.setNumberOfInstallments(rs.getInt("NumberOfInstallments"));
                e.setFormOfPayment(pay);
                e.setStatus(status);

                values.add(e);
            }
            return values;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar lista de despesas: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static boolean deleteExpense(Integer id) throws SQLException {
        String sql = "delete from Expense where Id = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar despesa: " + e);
            return false;
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static boolean updateExpense(Integer id, Integer accountId, Integer categoryId, Integer cardId, Double value, String date, String description, Integer formOfPayment, Integer numberOfInstallments, Integer status) throws SQLException {
        String sql = "update Expense set AccountId = ?,CategoryId = ?,CardId = " + cardId + ",Value = ?,"
                + "Date = '" + date + "',Description = ?,FormOfPayment = ?,NumberOfInstallments = ?, Status = ? where Id = ?";

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
            ps.setInt(8, id);

            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar despesa: " + e);
            return false;
        } finally {
            ConnectionDB.closeConnection(conexao, ps);
        }
    }
}
