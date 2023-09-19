package creational.abstractFactory.product.creator.ellipsoidDrawer;

import creational.abstractFactory.product.shape.Ellipsoid;
import creational.abstractFactory.product.shape.Shape;

public class SpiderMonkeyEllipsoidDrawer extends EllipsoidDrawer {
    public SpiderMonkeyEllipsoidDrawer(double x, double y) {
        super(x, y);
    }

    @Override
    protected Shape createShape(double x, double y) {
        return new Ellipsoid(x, y);
    }

    @Override
    protected void engineParse() {
        System.out.println("Parsing ellipse Shape for spider monkey engine...");
    }

}
