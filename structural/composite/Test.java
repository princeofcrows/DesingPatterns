package structural.composite;

public class Test {
    public static void main(String[] args) {
        var group1 = new Group();
        var group2 = new Group();

        group1.add(new Dot());
        group1.add(new Dash());

        group1.render();

        System.out.println("-----------------");

        group2.add(group1);
        group2.add(new Dot());
        group1.add(new Dash());
        group2.render();
    }
}