package behavioral.visitor.element;

import behavioral.visitor.operation.Operation;

import java.util.ArrayList;
import java.util.List;

public class Document implements Element{
    private final List<Element> nodes = new ArrayList<>();

    public void add(Element node) {
        nodes.add(node);
    }

    @Override
    public void execute(Operation operation) {
        for(var node: nodes) {
            node.execute(operation);
        }
    }
}
