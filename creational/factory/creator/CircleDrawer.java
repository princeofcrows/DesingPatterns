package creational.factory.creator;

import creational.factory.product.Circle;
import creational.factory.product.Shape;

public class CircleDrawer extends Tool{
   Circle circle;
    public CircleDrawer(int radius) {
        circle = new Circle(radius);
    }

    @Override
    protected Shape createShape() {
        return circle;
    }

    public void resize(int radius) {
        circle.setRadius(radius);
    }
}
