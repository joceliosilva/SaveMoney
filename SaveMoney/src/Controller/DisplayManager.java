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

    public void OpenFrame(JFrame open) {
        open.setVisible(true);
    }

    public void OpenInternalFrame(JDesktopPane pane, JInternalFrame open) {
        pane.add(open);
        pane.setPosition(open, 0);
        open.setVisible(true);
    }
    
    public void OpenCategory(JDesktopPane pane) {
        CategoryScreen open = new CategoryScreen();
        pane.add(open);
        pane.setPosition(open, 0);
        open.setVisible(true);
    }
    
    public void OpenExpense(JDesktopPane pane) throws SQLException {
        ExpenseScreen open = new ExpenseScreen();
        pane.add(open);
        pane.setPosition(open, 0);
        open.setVisible(true);
    }
}