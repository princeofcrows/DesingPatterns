package creational.factory.product;

public class Rectangle implements Shape {
    int width;

    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void render() {
        System.out.println("Rendering a Rectangle of Width " + width + " & height " + height);
    }
}
