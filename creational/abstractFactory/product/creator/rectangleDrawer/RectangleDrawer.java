package creational.abstractFactory.product.creator.rectangleDrawer;


import creational.abstractFactory.product.toolFactory.Tool;

public abstract class  RectangleDrawer extends Tool {
    public RectangleDrawer(double x, double y) {
        super(x, y);
    }
}
