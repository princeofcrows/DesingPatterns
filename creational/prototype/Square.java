package creational.prototype;

public class Square implements ShapePrototype {
    int length;

    public Square(int length) {
       this.length = length;
    }

    @Override
    public void render() {
        System.out.println("Rendering a Square of Length " + length);
    }

    @Override
    public Square copy() {
        return new Square(length);
    }
}
