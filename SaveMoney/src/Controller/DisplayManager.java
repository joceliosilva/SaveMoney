package Controller;

import View.HomeScreen;
import View.LoginScreen;
import View.RegisterScreen;

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

    public void OpenHome() {
        HomeScreen open = new HomeScreen();
        open.setVisible(true);
    }
}
