package model.bins;

import java.awt.*;

public abstract class Bin {

    public static final int HEIGHT = 50;
    public static final int WIDTH = 40;
    protected static final int DY = 1;
    //width & height
    protected static final int SIZE_X = 30;
    protected static final int SIZE_Y = 90;
    //coordinates
    protected int x;
    protected int y;


    protected String name;

    public Bin(String name, int x) {
        this.name = name;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public int getSizeX() { return SIZE_X; }

    public int getSizeY() { return SIZE_Y; }

    public int getX() { return x;}

    public int getY() { return y;}


    public abstract void draw(Graphics g);

}
