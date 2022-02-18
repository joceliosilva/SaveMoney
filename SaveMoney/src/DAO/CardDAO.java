package DAO;

import Connection.ConnectionDB;
import Model.Enums.*;
import Model.Enums.CardType;
import Model.Home.Card;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static Card getCardByNumber(Integer number) throws SQLException {
        String sql = "select * from Card where Number = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, number);

            rs = ps.executeQuery();

            if (rs.next()) {
                CardType type = CardType.CREDITO;
                type = type.findCardType(rs.getInt("Type"));
                CardFlag flag = CardFlag.MASTERCARD;
                flag = flag.findCardFlag(rs.getInt("Flag"));

                Card card = new Card(
                        rs.getInt("Id"),
                        rs.getInt("AccountId"),
                        rs.getInt("Number"),
                        type,
                        flag,
                        rs.getDouble("CardLimit"),
                        rs.getDouble("AnnualValue"),
                        rs.getDate("ClosingDate")
                );
                return card;
            } else {
                return null;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar cartão: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static Card getCardByAccountId(Integer accId) throws SQLException {
        String sql = "select * from Card where AccountId = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, accId);

            rs = ps.executeQuery();

            if (rs.next()) {
                CardType type = CardType.CREDITO;
                type = type.findCardType(rs.getInt("Type"));
                CardFlag flag = CardFlag.MASTERCARD;
                flag = flag.findCardFlag(rs.getInt("Flag"));

                Card card = new Card(
                        rs.getInt("Id"),
                        rs.getInt("AccountId"),
                        rs.getInt("Number"),
                        type,
                        flag,
                        rs.getDouble("CardLimit"),
                        rs.getDouble("AnnualValue"),
                        rs.getDate("ClosingDate")
                );
                return card;
            } else {
                return null;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar cartão: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
    }

    public static List<Integer> getCardNumberList(Integer accountId) throws SQLException {
        String sql = "select * from Card where AccountId = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, accountId);

            rs = ps.executeQuery();
            
            List<Integer> cardList = new ArrayList();
            
            while (rs.next()) {
                cardList.add(rs.getInt("Number"));
            }
            return cardList;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar lista de cartões: " + e);
            return null;
        } finally {
            ps.close();
            conexao.close();
        }
    }
    
    public static boolean deleteCard(Integer id) throws SQLException {
        String sql = "delete from Card where Id = ?";
        conexao = new ConnectionDB().getConnection();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar cartão: " + e);
            return false;
        } finally {
            ps.close();
            conexao.close();
        }
    }
}
