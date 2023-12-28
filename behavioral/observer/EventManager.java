package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements ObservableSubject{
    private final List<Observer> observers = new ArrayList<>();
    private  int formValue;

    public int getValue() {
        return formValue;
    }

    public void setValue(int value) {
        this.formValue = value;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (var observer : observers)
            observer.update();
    }
}
