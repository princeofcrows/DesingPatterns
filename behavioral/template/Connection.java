package behavioral.template;

public abstract class Connection {
    public final void run() {
        setDBDriver();
        setCredentials();
        connect();
    }
    protected abstract void setDBDriver();

    protected abstract void setCredentials();

    private void connect() {
        System.out.println("Connecting...");
    }
}
