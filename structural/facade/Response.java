package structural.facade;

public class Response {
    private final String header;

    private final String body;

    private int statusCode;

    public Response(String header, String body, int statusCode) {
        this.header = header;
        this.body = body;
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        System.out.println("header->" + header);
        return body;
    }
}
