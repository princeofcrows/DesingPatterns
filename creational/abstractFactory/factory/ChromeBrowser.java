package creational.abstractFactory.factory;

import creational.abstractFactory.product.creator.ellipsoidDrawer.EllipsoidDrawer;
import creational.abstractFactory.product.creator.ellipsoidDrawer.V8EllipseDrawer;
import creational.abstractFactory.product.creator.rectangleDrawer.RectangleDrawer;
import creational.abstractFactory.product.creator.rectangleDrawer.V8RectangleDrawer;


public class ChromeBrowser implements DrawerFactory{
    @Override
    public RectangleDrawer createRectangleDrawer(double x, double y) {
        return new V8RectangleDrawer(x, y);
    }

    @Override
    public EllipsoidDrawer createEllipsoidDrawer(double x, double y) {
        return new V8EllipseDrawer(x, y);
    }
}
