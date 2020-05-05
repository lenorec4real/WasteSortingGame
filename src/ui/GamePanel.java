package ui;

import model.WSGame;

import javax.swing.*;
import java.awt.*;

// The game is rendered here.

public class GamePanel extends JPanel {
    private static final String OVER = "Game Over!";
    private static final String REPLAY = "R to replay";
    private WSGame game;

    // Constructs a game panel
    // effects:  sets size and background colour of panel,
    //           updates this with the game to be displayed
    public GamePanel(WSGame g) {
        setPreferredSize(new Dimension(WSGame.WIDTH, WSGame.HEIGHT));
        setBackground(Color.GRAY);
        this.game = g;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        renderGame(g);

        if (game.isOver()){
            gameOver(g);

        }
    }

    // Draws the "game over" message and replay instructions
    // modifies: g
    // effects:  draws "game over" and replay instructions onto g
    private void gameOver(Graphics g) {
        Color saved = g.getColor();
        g.setColor(new Color( 0, 0, 0));
        g.setFont(new Font("Arial", 20, 20));
        FontMetrics fm = g.getFontMetrics();
        centreString(OVER, g, fm, WSGame.HEIGHT / 2);
        centreString(REPLAY, g, fm, WSGame.HEIGHT / 2 + 40);
        g.setColor(saved);
    }

    // Draws the game
    // modifies: g
    // effects:  the game is drawn onto the Graphics object g
    private void renderGame(Graphics g) {
        game.render(g);
    }

    // Centres a string on the screen
    // modifies: g
    // effects:  centres the string str horizontally onto g at vertical position yPos
    private void centreString(String str, Graphics g, FontMetrics fm, int yPos) {
        int width = fm.stringWidth(str);
        g.drawString(str, (WSGame.WIDTH - width) / 2, yPos);
    }
}
