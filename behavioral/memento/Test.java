package behavioral.memento;

public class Test {
    public static void main(String[] args) {
        var editor = new Originator("");
        var history = new CareTaker();

        editor.setState("Hello World!");
        editor.setState("Hello Memento!");
        history.add(editor.saveStateToMemento());

        editor.setState("Hello Java!");
        history.add(editor.saveStateToMemento());

        editor.setState("Hello GOF!");
        System.out.println("Current State: " + editor.getState());

        editor.getStateFromMemento(history.undo());
        System.out.println("First saved State: " + editor.getState());
        editor.getStateFromMemento(history.undo());
        System.out.println("Second saved State: " + editor.getState());
    }
}
