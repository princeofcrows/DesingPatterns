package creational.abstractFactory.factory;

import creational.abstractFactory.product.creator.ellipsoidDrawer.EllipsoidDrawer;
import creational.abstractFactory.product.creator.rectangleDrawer.RectangleDrawer;


public interface DrawerFactory {
    RectangleDrawer createRectangleDrawer(double x, double y);
    EllipsoidDrawer createEllipsoidDrawer(double x, double y);
}
