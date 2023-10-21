package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.actions.Handler;
import behavioral.chainOfResponsibility.elements.Request;

public class Server {
    private final Handler handler;


    public Server(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest(Request req){
        handler.handle(req);
        System.out.println("------");
    }
}
