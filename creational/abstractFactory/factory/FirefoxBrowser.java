package creational.abstractFactory.factory;

import creational.abstractFactory.product.creator.ellipsoidDrawer.EllipsoidDrawer;
import creational.abstractFactory.product.creator.ellipsoidDrawer.SpiderMonkeyEllipsoidDrawer;
import creational.abstractFactory.product.creator.rectangleDrawer.RectangleDrawer;
import creational.abstractFactory.product.creator.rectangleDrawer.SpiderMonkeyRectangleDrawer;


public class FirefoxBrowser implements DrawerFactory{
    @Override
    public RectangleDrawer createRectangleDrawer(double x, double y) {
        return new SpiderMonkeyRectangleDrawer(x, y);
    }

    @Override
    public EllipsoidDrawer createEllipsoidDrawer(double x, double y) {
        return new SpiderMonkeyEllipsoidDrawer(x, y);
    }
}
