package ui;

import model.WSGame;

import javax.swing.*;
import java.awt.*;

public class GameOverFrame extends JFrame {

    private JButton restartButton;
    private JLabel results;
    private JPanel gameOverPanel;
    private int sorted;
    private int misplaced;
    private Dimension dm = new Dimension(300, 240);

//    JPanel thisPanel;

    // construct a instruction panel explaining the rules

    public GameOverFrame(WSGame game) {
        super();
        setPreferredSize(new Dimension(400,300));
//        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        gameOverPanel = new JPanel();
        setBackground(new Color(184, 184, 184));
        setSize(dm);
        setVisible(true);
        sorted = game.getCorrectItems();
        misplaced = game.getIncorrectItems();
//        gameOverPanel.setLayout(new BorderLayout());
        centreOnScreen();
//        String resultString = myLabel.setText("<html><body>with<br>linebreak</body></html>");
        String resultString = "<html>You successfully sorted " + sorted +" waste items,<br/> you misplaced "
                                + misplaced +" waste items.<br/> Do you want to play again?<html>";
        results = new JLabel(resultString, SwingConstants.CENTER);

//        results.setPreferredSize(new Dimension(100,50));
        restartButton = new JButton("Play again!");

        restartButton.addActionListener(e -> {
            dispose();
            new InstructionFrame();
        });

        gameOverPanel.add(results, BorderLayout.PAGE_START);
        gameOverPanel.add(restartButton,BorderLayout.PAGE_END);
        add(gameOverPanel);
        pack();
    }

    private void centreOnScreen() {
        Dimension scrn = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((scrn.width - getWidth()) / 2, (scrn.height - getHeight()) / 2);
    }

}
