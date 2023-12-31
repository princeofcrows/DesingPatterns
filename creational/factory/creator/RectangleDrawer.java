package creational.factory.creator;

import creational.factory.product.Rectangle;
import creational.factory.product.Shape;

public class RectangleDrawer extends Tool{
    public RectangleDrawer(double x, double y) {
        super(x, y);
    }

    @Override
    protected Shape createShape(double x, double y) {
        return  new Rectangle(x, y);
    }
}
