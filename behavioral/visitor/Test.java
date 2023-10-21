package behavioral.visitor;

import behavioral.visitor.element.Document;
import behavioral.visitor.element.JsonElement;
import behavioral.visitor.element.XmlElement;
import behavioral.visitor.operation.Parse;
import behavioral.visitor.operation.Print;

public class Test {
    public static void main(String[] args) {
        var document = new Document();

        document.add(new JsonElement());
        document.add(new XmlElement());

        document.execute(new Parse());
        document.execute(new Print());
    }
}