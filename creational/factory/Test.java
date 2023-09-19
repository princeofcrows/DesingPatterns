package creational.factory;

import creational.factory.creator.CircleDrawer;
import creational.factory.creator.RectangleDrawer;

public class Test {
    public static void main(String[] args) {
        var circleDrawer = new CircleDrawer(5);
        circleDrawer.drawShape();


        var rectDrawer = new RectangleDrawer(10, 11);
        rectDrawer.drawShape();

        circleDrawer.resize(98);
        circleDrawer.drawShape();

        rectDrawer.resize(111, 222);
        rectDrawer.drawShape();
    }
}