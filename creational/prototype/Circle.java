package creational.prototype;

public class Circle implements ShapePrototype{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering a Circle of radius " + radius);
    }

    @Override
    public Circle copy() {
        return new Circle(radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
