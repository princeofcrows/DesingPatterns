package creational.factory;

import creational.factory.creator.EllipsoidDrawer;
import creational.factory.creator.RectangleDrawer;

public class Test {
    public static void main(String[] args) {
        var ellipsoidDrawer = new EllipsoidDrawer(5.0, 8.0);
        ellipsoidDrawer.drawShape();
        ellipsoidDrawer.resize(5.0, 4.0);
        ellipsoidDrawer.drawShape();


        var rectDrawer = new RectangleDrawer(4, 2);
        rectDrawer.drawShape();
        rectDrawer.resize(4, 4);
        rectDrawer.drawShape();
    }
}