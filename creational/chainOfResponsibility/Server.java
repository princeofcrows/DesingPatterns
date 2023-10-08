package creational.chainOfResponsibility;

import creational.chainOfResponsibility.actions.Handler;
import creational.chainOfResponsibility.elements.Request;

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
