package behavioral.observer;

public class FormView implements Observer{
    private final EventManager eventManager;

    public FormView(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @Override
    public void update() {
        System.out.println("Form value got updated: Updating view -" + eventManager.getValue());
    }
}
