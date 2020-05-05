package model.wasteItems;

public class GlassBottle extends WasteItem {
    private static final int code = 3;
    public static final String belongsTo = "Recyclable Containers Bin";


    public GlassBottle(int x) {
        super(x);
        belongedBin = belongsTo;
        codeNum = code;
        this.name = "Glass bottle";
    }

}
