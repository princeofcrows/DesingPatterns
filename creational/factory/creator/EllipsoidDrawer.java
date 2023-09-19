package creational.factory.creator;

import creational.factory.product.Ellipsoid;
import creational.factory.product.Shape;

public class EllipsoidDrawer extends Tool{
    public EllipsoidDrawer(double x, double y) {
        super(x, y);
    }

    @Override
    protected Shape createShape(double x, double y) {
        return new Ellipsoid(x, y);
    }
}
