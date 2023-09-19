package creational.factory.creator;

import creational.factory.product.Shape;

public abstract class Tool {
    public void drawShape() {
        var shape = createShape();
        shape.render();
    }

    protected abstract Shape createShape();
}
