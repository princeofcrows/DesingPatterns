package creational.factory.product;

public class Ellipsoid extends Shape {

    public Ellipsoid(double x, double y) {
        super(x, y);
    }

    double errorPercentage(double value, double target) {
        return Math.abs(value - target) / target * 100.0;
    }

    boolean isBelowAccepted(double value) {
        double ACCEPTED = 5.0;
        return value <= ACCEPTED;
    }
    @Override
    public boolean renderPoint(double x, double y) {
        double xDiff = x * x / this.x / this.x;
        double yDiff = y * y / this.y / this.y;
        double totalDiff = xDiff + yDiff;

        return isBelowAccepted(errorPercentage(totalDiff, 1.0));
    }

    @Override
    public String getLabel() {
        return "Ellipsoid";
    }
}
