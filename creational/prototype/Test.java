package creational.prototype;

public class Test {
    public static void main(String[] args) {
        var context = new Client();

        var circle = new Circle(2);
        context.addShape(circle);

        var rect = new Rectangle(2, 5);
        context.addShape(rect);

        var sq = new Square(7);

        context.addShape(sq);

        context.drawAllShape();

        circle.setRadius(8);
        context.duplicate(circle);

        context.drawAllShape();
    }
}