package ui;

import model.WSGame;

import javax.swing.*;
import java.awt.*;

public class GameOverFrame extends JFrame {

    private JButton restartButton;
    private JPanel gameOverPanel;
    private Dimension dm = new Dimension(300, 240);

//    JPanel thisPanel;

    // construct a instruction panel explaining the rules

    public GameOverFrame(WSGame game) {
        super();
        gameOverPanel = new JPanel();
        setBackground(new Color(184, 184, 184));
        setSize(dm);
        setVisible(true);
//        gameOverPanel.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        centreOnScreen();
        restartButton = new JButton("Play again!");

        restartButton.addActionListener(e -> {
            dispose();
            new InstructionFrame();
        });

        gameOverPanel.add(restartButton);
        add(gameOverPanel);
    }

    private void centreOnScreen() {
        Dimension scrn = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((scrn.width - getWidth()) / 2, (scrn.height - getHeight()) / 2);
    }

}
