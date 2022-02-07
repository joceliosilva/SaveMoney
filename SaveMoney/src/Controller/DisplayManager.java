package Controller;

import View.Internal.CategoryScreen;
import View.Internal.CardScreen;
import View.*;
import java.sql.SQLException;
import javax.swing.JDesktopPane;

/**
 *
 * @author Jocelio
 */
public class DisplayManager {

    public void OpenRegister() {
        RegisterScreen open = new RegisterScreen();
        open.setVisible(true);
    }

    public void OpenLogin() {
        LoginScreen open = new LoginScreen();
        open.setVisible(true);
    }

    public void OpenHome() throws SQLException, Exception {
        HomeScreen open = new HomeScreen();
        open.setVisible(true);
    }
    
    public void OpenCategory(JDesktopPane pane) {
        CategoryScreen open = new CategoryScreen();
        pane.add(open);
        pane.setPosition(open, 0);
        open.setVisible(true);
    }
    
    public void OpenCard(JDesktopPane pane) {
        CardScreen open = new CardScreen();
        pane.add(open);
        pane.setPosition(open, 0);
        open.setVisible(true);
    }
}
