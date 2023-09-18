package creational.prototype;

public class Rectangle implements ShapePrototype{
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

    @Override
    public Rectangle copy() {
        return new Rectangle(width, height);
    }
}
