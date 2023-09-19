package creational.abstractFactory.product.shape;

public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void reShape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract boolean  renderPoint(double x, double y);
    public abstract String getLabel();
}
