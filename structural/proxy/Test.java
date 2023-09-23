package structural.proxy;

public class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("Hello.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println();

        //image will not be loaded from disk
        image.display();
    }
}