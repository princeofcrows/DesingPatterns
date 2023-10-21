package behavioral.visitor.operation;

import behavioral.visitor.element.JsonElement;
import behavioral.visitor.element.XmlElement;

public interface Operation {
    void action(JsonElement json);
    void action(XmlElement xml);
}
