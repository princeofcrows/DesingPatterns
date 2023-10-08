package creational.visitor.element;

import creational.visitor.operation.Operation;

public interface Element {
    void execute(Operation operation);
}
