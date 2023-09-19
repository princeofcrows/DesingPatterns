package creational.factory.creator;

import creational.factory.product.Rectangle;
import creational.factory.product.Shape;

public class RectangleDrawer extends Tool{
    Rectangle rectangle;

    public RectangleDrawer(int width, int height) {
        rectangle = new Rectangle(width, height);
    }


    @Override
    protected Shape createShape() {
        return  rectangle;
    }

    public void resize(int width, int heigth) {
        rectangle.setHeight(heigth);
        rectangle.setWidth(width);
    }
}
