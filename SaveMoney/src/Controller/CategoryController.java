/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.CategoryDAO;
import Model.Entity.Account;
import Model.Home.Category;
import static View.LoginScreen.email1;
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

    public List<Category> getcategoryList(Integer accountId) throws SQLException { // ADD na ComboBox
        if (accountId != null) { // accId usar futuramente
            List<Category> catList = CategoryDAO.getcategoryList();

            if (catList != null) {
                if (catList.size() > 0) {
                    return catList;
                }
            }
            return null;
        }
        return null;
    }

    public Category getCategoryById(Integer catId) throws SQLException {
        if (catId != null) {
            return CategoryDAO.getCategoryById(catId);
        }
        return null;
    }

    public boolean deleteCategory(Integer id) throws SQLException {
        if (id != null) {
            return CategoryDAO.deleteCategory(id);
        }
        return false;
    }

    public void getcategoryNameList(JComboBox cbb) throws SQLException {
        if (cbb != null) {
            AccountController ac = new AccountController();
            String email = email1;
            Account account = ac.getAccountByEmail(email);

            List<Category> catList = getcategoryList(account.getId());

            for (Category cat : catList) { // Adiciona na combobox
                cbb.addItem(cat.getName());
            }
        }
    }
}
