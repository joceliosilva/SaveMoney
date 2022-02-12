/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Exception.SMException;
import java.sql.PreparedStatement;

/**
 *
 * @author Renan
 * @author Jocelio
 */
public class ConnectionDB {

    private static final String DRIVE = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost";
    private static final String DATA_BASE = "savemoney";
    private static final String USER = "root";
    private static final String PASS = "pass";

    public Connection getConnection() {
        
        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL + "/" + DATA_BASE + "?useSSL=false", USER, PASS);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, SMException.EX0001);
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, SMException.EX0002);
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, SMException.EX0003);
            System.out.println(ex.getMessage());
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, SMException.EX0003);
            System.out.println(ex.getMessage());
        }
    }
}
