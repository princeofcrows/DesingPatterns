package creational.visitor.operation;

import creational.visitor.element.JsonElement;
import creational.visitor.element.XmlElement;

public interface Operation {
    void action(JsonElement json);
    void action(XmlElement xml);
}
