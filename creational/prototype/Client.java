package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final List <ShapePrototype> shapeStore = new ArrayList<>();

    public void duplicate(ShapePrototype shape) {
        addShape(shape.copy());
    }

    public void addShape(ShapePrototype shape) {
        shapeStore.add(shape);
    }
    
    public void drawAllShape() {
        for (var shape: shapeStore) {
            shape.render();
        }
    }
}
