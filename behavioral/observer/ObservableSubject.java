package behavioral.observer;

public interface  ObservableSubject {
     void addObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObserver();
}
