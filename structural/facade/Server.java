package structural.facade;

public class Server {
    public Connection connection() {
        return new Connection();
    }

    public Response getResponse(Request req) {
        System.out.println("Request at " + req.getEndPoint());
        System.out.println("Sending response...");
        return new Response(req.getHeader(), "Response success", 200);
    }
}
