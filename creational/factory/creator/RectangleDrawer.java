package creational.factory.creator;

import creational.factory.product.Rectangle;
import creational.factory.product.Shape;

public class RectangleDrawer extends Tool{
    int width;
    int height;

    public RectangleDrawer(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    protected Shape createShape() {
        return new Rectangle(10, 10);
    }
}
