package behavioral.memento;


import java.util.Stack;

// History
public class CareTaker {
    private final Stack<Memento> mementoList = new Stack<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento undo() {
        return mementoList.pop();
    }
}
