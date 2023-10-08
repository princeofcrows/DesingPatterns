package creational.visitor;

import creational.visitor.element.Document;
import creational.visitor.element.JsonElement;
import creational.visitor.element.XmlElement;
import creational.visitor.operation.Parse;
import creational.visitor.operation.Print;

public class Test {
    public static void main(String[] args) {
        var document = new Document();

        document.add(new JsonElement());
        document.add(new XmlElement());

        document.execute(new Parse());
        document.execute(new Print());
    }
}