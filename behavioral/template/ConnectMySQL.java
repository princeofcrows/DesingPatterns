package behavioral.template;

public class ConnectMySQL extends Connection{
    @Override
    protected void setDBDriver() {
        System.out.println("Setting MySQL DB drivers...");
    }

    @Override
    protected void setCredentials() {
        System.out.println("Setting credentials for MySQL DB...");
    }
}
