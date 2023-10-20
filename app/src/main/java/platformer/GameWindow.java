package platformer;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private GamePanel gamePanel;
    public GameWindow(GamePanel gamePanel) throws HeadlessException {
        this.gamePanel = gamePanel;
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(gamePanel);
        this.setVisible(true);
    }
}
