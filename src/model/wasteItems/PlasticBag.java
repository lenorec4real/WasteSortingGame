package model.wasteItems;

public class PlasticBag extends WasteItem {
    private static final int code = 4;
    public static final String belongsTo = "Garbage Bin";

    public PlasticBag(int x) {
        super(x);
        belongedBin = belongsTo;
        codeNum = code;
        this.name = "Plastic Bag";
    }

}
