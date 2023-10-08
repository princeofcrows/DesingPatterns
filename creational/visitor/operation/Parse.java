package creational.visitor.operation;

import creational.visitor.element.JsonElement;
import creational.visitor.element.XmlElement;

public class Parse implements Operation{
    @Override
    public void action(JsonElement json) {
        System.out.println("Parsing a JSON ---");
    }

    @Override
    public void action(XmlElement xml) {
        System.out.println("Parsing a XML ---");
    }
}
