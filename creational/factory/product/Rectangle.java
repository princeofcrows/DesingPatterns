package creational.factory.product;

public class Rectangle extends Shape {

    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public boolean renderPoint(double x, double y) {
        double OFFSET_X = 0;
        double OFFSET_Y = 0;

        if( x == OFFSET_X) {
            return (y >= OFFSET_Y) && (y <= OFFSET_Y + this.y);
        } else if(x == OFFSET_X + this.x) {
            return (y >= OFFSET_Y) && (y <= OFFSET_Y + this.y);
        }

        if( y == OFFSET_Y) {
            return (x >= OFFSET_X) && (x <= OFFSET_X + this.x);
        } else if(y == OFFSET_Y + this.y) {
            return (x >= OFFSET_X) && (x <= OFFSET_X + this.x);
        }

        return false;
    }

    @Override
    public String getLabel() {
        return "Rectangle";
    }
}
