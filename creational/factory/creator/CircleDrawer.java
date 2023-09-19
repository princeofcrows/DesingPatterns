package creational.factory.creator;

import creational.factory.product.Circle;
import creational.factory.product.Shape;

public class CircleDrawer extends Tool{
    int radius;
    public CircleDrawer(int radius) {
        this.radius = radius;
    }

    @Override
    protected Shape createShape() {
        return new Circle(radius);
    }
}
