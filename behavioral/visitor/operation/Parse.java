package behavioral.visitor.operation;

import behavioral.visitor.element.JsonElement;
import behavioral.visitor.element.XmlElement;

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
