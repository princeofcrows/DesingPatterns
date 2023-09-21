package structural.facade;

public class Request {
    private final String token;

    private final String endPoint;

    public Request(String token, String endPoint) {
        this.token = token;
        this.endPoint = endPoint;
    }

    private String decodeToken() {
        return Integer.toHexString(token.hashCode());
    }

    public String getHeader() {
        return decodeToken();
    }

    public String getEndPoint() {
        return endPoint;
    }
}
