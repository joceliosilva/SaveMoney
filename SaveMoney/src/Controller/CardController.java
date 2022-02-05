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
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

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
}
