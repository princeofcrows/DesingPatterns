package behavioral.chainOfResponsibility.actions;

import behavioral.chainOfResponsibility.elements.Request;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean execute(Request req) {
        System.out.println("Authenticating....");
        return req.header().equals("xSwxaw4a");
    }
}
