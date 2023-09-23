package structural.flyWeigth;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Tree> trees;
    private final List<TreePosition> treePositions;
    private final TreeFactory treeFactory;

    public Game() {
        this.trees = new ArrayList<>();
        this.treePositions = new ArrayList<>();

        this.treeFactory = new TreeFactory();
    }

    public void addTree(int x, int y, String color) {
        trees.add(treeFactory.getTree(color));
        treePositions.add(new TreePosition(x, y));

        renderTree(trees.size() - 1);
    }

    public void renderTree(int id) {
        System.out.println( "Tree " + id
                + " with " + trees.get(id).getColor() + " color"
                + " rendered at " + treePositions.get(id).getX() + ", " + treePositions.get(id).getY());
    }
}
