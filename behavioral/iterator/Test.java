package behavioral.iterator;

public class Test {
    public static Container initRepo(Container repo) {
        repo.add("Item 1");
        repo.add("Item 2");
        repo.add("Item 3");
        return repo;
    }

    public static void iterate(Container repo) {
        var itr = repo.getIterator();
        while (itr.hasNext()) {
            System.out.println(itr.current());
            itr.next();
        }

        itr.root();

        System.out.println("Item removed --> " + repo.remove());

        while (itr.hasNext()) {
            System.out.println(itr.current());
            itr.next();
        }
    }
    public static void main(String[] args) {
        System.out.println("Static Data Iterator---");

        var staticRepo = new StaticDataRepository();
        staticRepo = (StaticDataRepository) initRepo(staticRepo);

        iterate(staticRepo);

        System.out.println("Dynamic Data Iterator---");

        var dynamicRepo = new DynamicDataRepository();
        dynamicRepo = (DynamicDataRepository) initRepo(dynamicRepo);

        iterate(dynamicRepo);
    }
}
