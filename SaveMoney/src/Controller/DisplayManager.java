package Controller;

import View.Internal.CategoryScreen;
import View.Internal.ExpenseScreen;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Jocelio
 */
public class DisplayManager {

    public void openFrame(JFrame open) {
        open.setVisible(true);
    }
    
    public void closeFrame(JFrame open) {
        open.setVisible(false);
    }

    public void openInternalFrame(JDesktopPane pane, JInternalFrame open) {
        pane.add(open);
        pane.setPosition(open, 0);
        open.setVisible(true);
    }
    
    public void openCategory(JDesktopPane pane) {
        CategoryScreen open = new CategoryScreen();
        pane.add(open);
        pane.setPosition(open, 0);
        open.setVisible(true);
    }
    
    public void openExpense(JDesktopPane pane) throws SQLException {
        ExpenseScreen open = new ExpenseScreen();
        pane.add(open);
        pane.setPosition(open, 0);
        open.setVisible(true);
    }
}