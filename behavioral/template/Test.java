package behavioral.template;

public class Test {
    public static void run(Connection db) {
        db.run();
    }
    public static void main(String[] args) {
        var sqlCon = new ConnectMySQL();
        var mongoCon = new ConnectMongo();

        run(sqlCon);
        run(mongoCon);
    }
}