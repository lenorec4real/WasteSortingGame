package model.bins;

import java.awt.*;

public class FoodScrapBin extends Bin {

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
