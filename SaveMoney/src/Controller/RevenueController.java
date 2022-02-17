/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Home.*;
import DAO.*;
import Model.Enums;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Renan
 */
public class RevenueController {

    public boolean createRevenue(Integer accountId, Double value, Integer referenceMonth, String date, String description) throws SQLException { //FUNÇÃO PARA ADD CARD
        if (accountId != null && value != null && referenceMonth != null && date != null) {
            RevenueDAO.createRevenue(accountId, value, referenceMonth, date, description);
            return true;
        }
        return false;
    }
    
    public Revenue getRevenueByAccountId(Integer accId) throws SQLException {
        if (accId != null) {
            return RevenueDAO.getRevenueByAccountId(accId);
        }
        return null;
    }
    
    public void getMonthList(JComboBox com) {
        com.setModel(new DefaultComboBoxModel<>(Enums.Month.values()));
    }
    
    public boolean deleteRevenue(Integer id) throws SQLException {
        if (id != null) {
            return RevenueDAO.deleteRevenue(id);
        }
        return false;
    }
}
