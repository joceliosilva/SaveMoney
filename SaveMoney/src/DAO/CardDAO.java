package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class CardDAO {

    private static Connection conexao = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public CardDAO() {
        conexao = new ConnectionDB().getConnection();  //INICIA A CONEÇÃO COM O BD
    }

    public static void createCard(Integer accountId, Integer number, Integer type, Integer flag, Double limit, Double annualValue, String closingDate) throws SQLException { //FUNÇÃO PARA ADD CARD

        String sql = "insert into Card (AccountId,Number,Type,Flag,CardLimit,AnnualValue,ClosingDate) values (?,?,?,?,?,?,'" + closingDate + "')";
        conexao = new ConnectionDB().getConnection();
        try {
            ps = conexao.prepareStatement(sql);

            ps.setInt(1, accountId);
            ps.setInt(2, number);
            ps.setInt(3, type);
            ps.setInt(4, flag);
            ps.setDouble(5, limit);
            ps.setDouble(6, annualValue);
                                    
            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cartão: " + e);
        } finally {
            ps.close();
            conexao.close();
        }
    }
}
