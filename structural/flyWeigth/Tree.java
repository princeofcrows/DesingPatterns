package structural.flyWeigth;

public class Tree {
    public String getColor() {
        return color;
    }

    private final String color;
    int height;

    Tree(String color) {
        this.color = color;
        this.height = 6;
    }
}
