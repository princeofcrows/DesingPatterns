package behavioral.state;

public class DocumentExcel implements DocumentState{
    @Override
    public void format() {
        System.out.println("Formatting Excel Document...");
    }

    @Override
    public void print() {
        System.out.println("Printing Excel Document...");
    }
}
