package structural.facade;

public class Connection {
    String connect(String secret) {
        System.out.println("Connecting to Server...");
        return Integer.toHexString(secret.hashCode());
    }

    void disconnect() {
        System.out.println("Disconnecting from Server...");
    }
}
