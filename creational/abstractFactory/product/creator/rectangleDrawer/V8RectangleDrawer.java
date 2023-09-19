package creational.abstractFactory.product.creator.rectangleDrawer;

import creational.abstractFactory.product.shape.Rectangle;
import creational.abstractFactory.product.shape.Shape;

public class V8RectangleDrawer extends RectangleDrawer   {
    public V8RectangleDrawer(double x, double y) {
        super(x, y);
    }

    @Override
    protected Shape createShape(double x, double y) {
        return new Rectangle(x, y);
    }

    @Override
    protected void engineParse() {
        System.out.println("Parsing rectangle Shape for v8 engine...");
    }

}
