package structural.bridge;

public class Test {
    public static void main(String[] args) {
        Shape square = new Square(new Blue());

        System.out.println(square.draw());
    }
}