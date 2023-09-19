package creational.factory.creator;

import creational.factory.product.Shape;

public abstract class Tool {
    private final Shape shape;

    public Tool(double x, double y) {
        this.shape = createShape(x, y);
    }

    public void drawShape() {
        System.out.println("Drawing a " + shape.getLabel());
        double y1 = 10.0;

        for(double y = -y1; y<= y1; y+=1.0) {
            StringBuilder line = new StringBuilder();
            double x1 = 50.0;

            for (double x = -x1; x<= x1; x+=1.0) {
                if(shape.renderPoint(x, y)) line.append("*");
                else line.append(".");
            }
            System.out.println(line);
        }
    }

    public void resize(double x, double y) {
        shape.reShape(x, y);
    }
    protected abstract Shape createShape(double x, double y);
}
