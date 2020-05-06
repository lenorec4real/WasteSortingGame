package model.bins;

import model.WSGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public abstract class Bin {

    //width & height
    protected static final int SIZE_X = 100;
    protected static final int SIZE_Y = 90;
    //coordinates
    protected int x;
    protected int y;
    protected Color color;
    protected String imagePath;

    protected String name;
    protected Image i;



    public Bin(String name, int x) {
        this.name = name;
        this.x = x;
        this.y = WSGame.HEIGHT- SIZE_Y / 2;
        {
            try {
                i = ImageIO.read(new File(getPath())).getScaledInstance(SIZE_X,SIZE_Y,Image.SCALE_DEFAULT);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.print("fail to read image of bins");
            }
        }
    }

    protected abstract String getPath();

//    public String getName() {
//        return name;
//    }
//
//    public int getSizeX() { return SIZE_X; }

    public static int getSizeY() { return SIZE_Y; }
//
//    public int getX() { return x;}
//
//    public int getY() { return y;}

    public void render(Graphics g){
        Color savedCol = g.getColor();
        g.setColor(color);
//        g.fillRect(x - SIZE_X / 2, y, SIZE_X, SIZE_Y);
//        Image i = ImageIO.read(new File(imagePath)).getScaledInstance(SIZE_X,SIZE_Y,Image.SCALE_DEFAULT);
        g.drawImage(i,x- SIZE_X / 2, y - SIZE_Y / 2,null);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial Black", 1,15));
        g.drawString(name,x- SIZE_X / 2,y);
        g.setColor(savedCol);
    }
}
