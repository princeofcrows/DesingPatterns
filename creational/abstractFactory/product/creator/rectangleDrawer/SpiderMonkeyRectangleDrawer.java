package creational.abstractFactory.product.creator.rectangleDrawer;

import creational.abstractFactory.product.shape.Rectangle;
import creational.abstractFactory.product.shape.Shape;

public class SpiderMonkeyRectangleDrawer extends RectangleDrawer   {
    public SpiderMonkeyRectangleDrawer(double x, double y) {
        super(x, y);
    }

    @Override
    protected Shape createShape(double x, double y) {
        return new Rectangle(x, y);
    }

    @Override
    protected void engineParse() {
        System.out.println("Parsing rectangle Shape for spider monkey engine...");
    }

}
