package behavioral.state;

public class DocumentWord implements DocumentState {
    @Override
    public void format() {
        System.out.println("Formatting Word Document...");
    }

    @Override
    public void print() {
        System.out.println("Printing Word Document...");
    }
}
