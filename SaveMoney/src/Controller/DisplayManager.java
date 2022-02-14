package Controller;

import View.Internal.CardsScreen;
import View.Internal.CategoryScreen;
import View.Internal.ExpenseScreen;
import java.awt.Dimension;
import java.awt.Toolkit;
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

    public void pegarResolucao(JFrame frame) {         //Calcula a resoluçao para se adaptara diferentes telas
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        frame.setSize((dimensao.width + 5), (dimensao.height - 38));
    }
}
