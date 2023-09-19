package creational.abstractFactory;


import creational.abstractFactory.factory.ChromeBrowser;
import creational.abstractFactory.factory.Client;
import creational.abstractFactory.factory.FirefoxBrowser;

public class Test {
    public static void main(String[] args) {
        new Client().render(new FirefoxBrowser());
        new Client().render(new ChromeBrowser());
    }
}