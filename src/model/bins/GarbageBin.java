package model.bins;

import java.awt.*;

public class GarbageBin extends Bin {

    private static final Color COLOR = new Color(23, 23, 23);

    public GarbageBin() {
        super("Garbage Bin",700);
        this.color = COLOR;
    }

}
