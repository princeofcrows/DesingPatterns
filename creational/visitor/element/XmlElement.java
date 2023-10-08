package creational.visitor.element;

import creational.visitor.operation.Operation;

public class XmlElement implements Element {
    @Override
    public void execute(Operation operation) {
        operation.action(this);
    }
}
