package creational.factory.product;

public class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering a Circle of radius " + radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
