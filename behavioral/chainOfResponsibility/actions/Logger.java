package behavioral.chainOfResponsibility.actions;

import behavioral.chainOfResponsibility.elements.Request;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    protected boolean execute(Request req) {
        System.out.println("Logging...." + req.header());
        return true;
    }
}
