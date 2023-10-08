package creational.visitor.operation;

import creational.visitor.element.JsonElement;
import creational.visitor.element.XmlElement;

public class Print implements Operation {
    @Override
    public void action(JsonElement json) {
        System.out.println("Printing a JSON object ---");
    }

    @Override
    public void action(XmlElement xml) {
        System.out.println("Printing a XML object ---");
    }
}
