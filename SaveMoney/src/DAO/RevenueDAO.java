package DAO;

import Connection.ConnectionDB;
import Model.Enums.*;
import Model.Enums.CardType;
import Model.Home.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Renan
 */
public class RevenueDAO {

    private static Connection conexao = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public RevenueDAO() {
        conexao = new ConnectionDB().getConnection();  //INICIA A CONEÇÃO COM O BD
    }

    public static void createRevenue(Integer accountId, Double value, Integer referenceMonth, String date, String description) throws SQLException { //FUNÇÃO PARA ADD CARD

        String sql = "insert into Revenue (AccountId,Value,ReferenceMonth,Date,Description) values (?,?,?,'" + date + "',?)";
        conexao = new ConnectionDB().getConnection();
        try {
            ps = conexao.prepareStatement(sql);

            ps.setInt(1, accountId);
            ps.setDouble(2, value);
            ps.setInt(3, referenceMonth);
            ps.setString(4, description);

            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Receita: " + e);
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static Revenue getRevenueByAccountId(Integer accId) throws SQLException {
        String sql = "select * from Revenue where AccountId = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, accId);

            rs = ps.executeQuery();

            if (rs.next()) {
                Month month = Month.JANEIRO;
                month = month.findMonth(rs.getInt("ReferenceMonth"));

                Revenue rev = new Revenue();
                rev.setId(rs.getInt("Id"));
                rev.setAccountId(rs.getInt("AccountId"));
                rev.setValue(rs.getDouble("Value"));
                rev.setReferenceMonth(month);
                rev.setDate(rs.getDate("Date"));
                rev.setDescription(rs.getString("Description"));

                return rev;
            } else {
                return null;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar Receita: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
    }   
    
    public static boolean deleteRevenue(Integer id) throws SQLException {
        String sql = "delete from Revenue where Id = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar receita: " + e);
            return false;
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static boolean updateValueRevenue(Double valor, Integer id) throws SQLException{
        String sql = "update revenue set Value = Value - ? where Id = ?;";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setDouble(1, valor);
            ps.setInt(2, id);
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o saldo da receita: " + e);
            return false;
        } finally {
            ps.close();
            conexao.close();
        }
    }
    
    public static boolean updateRevenue(Integer id, Integer accountId, Double value, Integer referenceMonth, String date, String description) throws SQLException {
        String sql = "update Revenue set AccountId = ?,Value = ?,ReferenceMonth = ?,Date = '" + date + "',Description = ? where Id = ?";
        conexao = new ConnectionDB().getConnection();
        try {
            ps = conexao.prepareStatement(sql);

            ps.setInt(1, accountId);
            ps.setDouble(2, value);
            ps.setInt(3, referenceMonth);
            ps.setString(4, description);
            ps.setInt(5, id);

            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a receita: " + e);
            return false;
        } finally {
            ps.close();
            conexao.close();
        }
    }
}
