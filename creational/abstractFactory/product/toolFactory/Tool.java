package creational.abstractFactory.product.toolFactory;

import creational.abstractFactory.product.shape.Shape;

public abstract class Tool {
    private final Shape shape;

    private void draw() {
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

    protected abstract Shape createShape(double x, double y);

    protected abstract void engineParse();

    public Tool(double x, double y) {
        this.shape = createShape(x, y);
    }

    public void render() {
        engineParse();
        System.out.println("Drawing a " + shape.getLabel());
        draw();
    }

    public void resize(double x, double y) {
        shape.reShape(x, y);
    }
}
