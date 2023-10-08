package creational.chainOfResponsibility.actions;

import creational.chainOfResponsibility.elements.Request;

public class Validator extends Handler {
    public Validator(Handler next) {
        super(next);
    }

    @Override
    protected boolean execute(Request req) {
        System.out.println("Validating....");
        return req.header() != null && req.header().equals( "");
    }
}
