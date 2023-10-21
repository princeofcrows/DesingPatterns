package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.actions.Authenticator;
import behavioral.chainOfResponsibility.actions.Logger;
import behavioral.chainOfResponsibility.actions.Validator;
import behavioral.chainOfResponsibility.elements.Request;

public class Test {
    public static void main(String[] args) {
        var logger = new Logger(null);
        var authenticator = new Authenticator(logger);
        var validator = new Validator(authenticator);

        var server = new Server(validator);

        server.handleRequest(new Request("xSwxaw4a"));

        server.handleRequest(new Request("as"));
        server.handleRequest(new Request(null));

        var server2 = new Server(new Logger(new Validator( new Authenticator(null))));
        server2.handleRequest(new Request("xSwxaw4a"));

        server2.handleRequest(new Request("as"));
        server2.handleRequest(new Request(null));
    }
}