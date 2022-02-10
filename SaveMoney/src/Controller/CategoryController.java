/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.CategoryDAO;
import Model.Home.Category;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Evaristo
 */
public class CategoryController {

    public boolean createCategory(String category) throws SQLException {
        if (!category.isEmpty()) {
            CategoryDAO.createCategory(category);
            return true;
        }

        return false;
    }

    public Category getCategoryByName(String name) throws SQLException {
        if (!name.isEmpty()) {
            
            Category cat = CategoryDAO.getCategoryByName(name);
            
            return cat;
        }
        return null;
    }
    
    public boolean getcategoryList(JComboBox com, Integer accountId) throws SQLException { // ADD na ComboBox
        if (accountId != null) { // accId usar futuramente
            List<String> catList = CategoryDAO.getcategoryList();

            if (catList.size() > 0 && catList != null) {
                for(String cat : catList){
                    com.addItem(cat);
                }
                return true;
            } 
            return false;
        }        
        return false;
    }
}
