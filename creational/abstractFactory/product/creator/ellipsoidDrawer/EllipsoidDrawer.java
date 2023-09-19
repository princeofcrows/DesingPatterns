package creational.abstractFactory.product.creator.ellipsoidDrawer;


import creational.abstractFactory.product.toolFactory.Tool;

public abstract class EllipsoidDrawer extends Tool {
    public EllipsoidDrawer(double x, double y) {
        super(x, y);
    }
}
