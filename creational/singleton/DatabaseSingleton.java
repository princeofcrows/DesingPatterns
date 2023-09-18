package creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class DatabaseSingleton {
    private final Map<String, Object> database = new HashMap<>();

    private static final DatabaseSingleton instance = new DatabaseSingleton();

    private DatabaseSingleton() {}

    public void add(String key, String data) {
        database.put(key, data);
    }

    public Object getByKey(String key) {
        return database.get(key);
    }

    public static DatabaseSingleton getInstance() {
        return instance;
    }
}
