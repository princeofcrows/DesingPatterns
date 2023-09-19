package creational.abstractFactory.product.shape;

public class Ellipsoid extends Shape {

    public Ellipsoid(double x, double y) {
        super(x, y);
    }

    double errorPercentage(double value) {
        return Math.abs(value - 1.0)  * 100.0;
    }

    boolean isBelowAccepted(double value) {
        double ACCEPTED = 15.0;
        return value <= ACCEPTED;
    }
    @Override
    public boolean renderPoint(double x, double y) {
        double xDiff = x * x / this.x / this.x;
        double yDiff = y * y / this.y / this.y;
        double totalDiff = xDiff + yDiff;


        return isBelowAccepted(errorPercentage(totalDiff));
    }

    @Override
    public String getLabel() {
        return "Ellipsoid: a -> " + x + " b -> " + y;
    }
}
