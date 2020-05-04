package model.bins;

import model.wasteItems.Letter;

import java.awt.*;
import java.util.List;

public class FoodScrapBin extends Bin {

    private static final List<Letter> itemsBelong = null;
//    public static final int DY = 2;
    private static final Color COLOR = new Color(16, 188, 83);

    public FoodScrapBin() {
        super("Food Scrap Bin",100);
        color = COLOR;
    }


//    @Override
//    public void render(Graphics g) {
//        Color savedCol = g.getColor();
//        g.setColor(COLOR);
//        g.fillRect(getX() - SIZE_X / 2, getY() - SIZE_Y / 2, SIZE_X, SIZE_Y);
//        g.setColor(savedCol);
//    }
}
