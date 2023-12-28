package behavioral.observer;

public class Test {
    public static void main(String[] args) {
        var eventManager = new EventManager();
        var logger = new LoggingListener(eventManager);
        var formView = new FormView(eventManager);

        eventManager.addObserver(logger);
        eventManager.addObserver(formView);

        eventManager.setValue(11);
        eventManager.removeObserver(logger);

        eventManager.setValue(13);
    }
}