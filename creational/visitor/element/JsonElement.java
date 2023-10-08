package creational.visitor.element;

import creational.visitor.operation.Operation;

public class JsonElement implements Element {
    @Override
    public void execute(Operation operation) {
        operation.action(this);
    }
}
