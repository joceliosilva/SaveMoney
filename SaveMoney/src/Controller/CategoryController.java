/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.CategoryDAO;
import java.sql.SQLException;

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
}
