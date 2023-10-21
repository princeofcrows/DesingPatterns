package behavioral.chainOfResponsibility.actions;

import behavioral.chainOfResponsibility.elements.Request;

public abstract class Handler {
    private final Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(Request req) {
        if(!execute(req)) return;
        if(next == null) return;

        next.handle(req);
    }

    protected abstract boolean execute(Request req);
}
