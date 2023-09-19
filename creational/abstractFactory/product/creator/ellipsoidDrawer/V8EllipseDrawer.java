package creational.abstractFactory.product.creator.ellipsoidDrawer;

import creational.abstractFactory.product.shape.Ellipsoid;
import creational.abstractFactory.product.shape.Shape;

public class V8EllipseDrawer extends EllipsoidDrawer {
    public V8EllipseDrawer(double x, double y) {
        super(x, y);
    }

    @Override
    protected Shape createShape(double x, double y) {
        return new Ellipsoid(x, y);
    }

    @Override
    protected void engineParse() {
        System.out.println("Parsing rectangle Shape for v8 engine...");
    }

}
