/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CardDAO;
import Model.Enums.*;
import Model.Home.Card;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class CardController {

    public boolean createCard(Integer accountId, Integer number, Integer type, Integer flag, Double limit, Double annualValue, String closingDate) throws SQLException { //FUNÇÃO PARA ADD CARD
        if (accountId != null && number != null && type != null && flag != null && limit != null && annualValue != null && closingDate != null) {
            CardDAO.createCard(accountId, number, type, flag, limit, annualValue, closingDate);
            return true;
        }
        return false;
    }

    public void getFlagList(JComboBox com) {
        com.setModel(new DefaultComboBoxModel<>(CardFlag.values()));
    }

    public void getTypeList(JComboBox com) {
        com.setModel(new DefaultComboBoxModel<>(CardType.values()));
    }

    public Card getCardByNumber(Integer number) throws SQLException {
        if (number != null) {
            Card card = CardDAO.getCardByNumber(number);            
            return card;
        }
        return null;
    }

    public Card getCardByAccountId(Integer accId) throws SQLException {
        if (accId != null) {
            return CardDAO.getCardByAccountId(accId);
        }
        return null;
    }

    public boolean getCardNumberList(JComboBox com, Integer accountId) throws SQLException { // ADD na ComboBox
        if (accountId != null) {
            List<Integer> cardList = CardDAO.getCardNumberList(accountId);

            if (cardList.size() > 0 && cardList != null) {
                for(Integer card : cardList){
                    com.addItem(card);
                }
                return true;
            } 
            
            JOptionPane.showMessageDialog(null, "Você não possui um cartão cadastrado!\n"
                + "Mude a forma de pagamento ou cadastre um cartão!");
            return false;
        }        
        return false;
    }
}
