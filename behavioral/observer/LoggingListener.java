package behavioral.observer;

public class LoggingListener implements Observer{
    private final EventManager eventManager;

    public LoggingListener(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @Override
    public void update() {
        System.out.println("Form value got updated: Logging - " + eventManager.getValue());
    }
}
