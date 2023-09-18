package behavioral.template;

public class ConnectMongo extends Connection{
    @Override
    protected void setDBDriver() {
        System.out.println("Setting Mongo DB drivers...");
    }

    @Override
    protected void setCredentials() {
        System.out.println("Setting credentials for MySQL DB...");
    }
}
