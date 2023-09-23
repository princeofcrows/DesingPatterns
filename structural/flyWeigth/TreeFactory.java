package structural.flyWeigth;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private final Map<String, Tree> treeMap;

    public TreeFactory() {
        treeMap = new HashMap<>();
    }

    public Tree getTree(String color) {
        if (treeMap.containsKey( color) )
            return treeMap.get(color);

        var tree = new Tree(color);
        treeMap.put(color, tree);

        return tree;
    }
}
