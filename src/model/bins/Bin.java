package model.bins;

import model.WSGame;

import java.awt.*;

public abstract class Bin {

    //width & height
    protected static final int SIZE_X = 100;
    protected static final int SIZE_Y = 90;
    //coordinates
    protected int x;
    protected int y;
    protected Color color;

    protected String name;

    public Bin(String name, int x) {
        this.name = name;
        this.x = x;
        this.y = WSGame.HEIGHT- SIZE_Y / 2;
    }

    public String getName() {
        return name;
    }

    public int getSizeX() { return SIZE_X; }

    public static int getSizeY() { return SIZE_Y; }

    public int getX() { return x;}

    public int getY() { return y;}

    public void render(Graphics g) {
        Color savedCol = g.getColor();
        g.setColor(color);
        g.fillRect(x - SIZE_X / 2, WSGame.HEIGHT - SIZE_Y / 2, SIZE_X, SIZE_Y);
        g.setColor(savedCol);
    }
}
