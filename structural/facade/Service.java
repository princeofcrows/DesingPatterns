package structural.facade;

public class Service {
    public static void get(String endpoint, String secret) {
        var server = new Server();

        var connection = server.connection();
        var token = connection.connect(secret);

        var req = new Request(token, endpoint);
        var res = server.getResponse(req);

        if(res.getStatusCode() == 200) {
            System.out.println(res.getBody());
        }

        connection.disconnect();
    }
}
