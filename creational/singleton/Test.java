package creational.singleton;

public class Test {
    public static void main(String[] args) {
        var db1 = DatabaseSingleton.getInstance();

        db1.add("001", "Luke Skywalker");
        db1.add("002", "Han Solo");

        var db2 = DatabaseSingleton.getInstance();

        System.out.println(db2.getByKey("001"));

        db2.add("003", "Leia Organa");

        System.out.println(db1.getByKey("003"));
        System.out.println(db1.getByKey("002"));
        //System.out.println((db1 == db2 ? "Same" : "Oh no..."));
    }
}