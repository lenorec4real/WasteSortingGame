package model.wasteItems;

public class PlasticBag extends WasteItem {
    private static final int code = 4;
    public static final String belongsTo = "Garbage Bin";

    //Icons made by <a href="https://www.flaticon.com/authors/good-ware"
    // title="Good Ware">Good Ware</a> from
    // <a href="https://www.flaticon.com/" title="Flaticon"> www.flaticon.com</a>
    private static final String IMAGE_PATH = "src/data/plastic_bag.png";

    public PlasticBag(int x) {
        super(x);
        belongedBin = belongsTo;
        codeNum = code;
        this.name = "Plastic Bag";
        imagePath = IMAGE_PATH;
    }

}
