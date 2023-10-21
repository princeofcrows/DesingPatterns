package behavioral.visitor.element;

import behavioral.visitor.operation.Operation;

public interface Element {
    void execute(Operation operation);
}
