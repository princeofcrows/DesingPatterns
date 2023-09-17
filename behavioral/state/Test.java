package behavioral.state;

public class Test {
    public static void main(String[] args) {
        var document = new DocumentContext();

        document.setCurrentDocument(new DocumentWord());
        document.print();
        document.format();

        document.setCurrentDocument(new DocumentExcel());
        document.print();
        document.format();
    }
}
