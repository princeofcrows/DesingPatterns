package creational.builder;

public class Test {
    public static void main(String[] args) {
        var document = new Word();

        document.addWordPage("page 1");
        document.addWordPage("page 2");

        var pdfBuilder = new PdfBuilder();
        document.export(pdfBuilder);

        var pdfDocument = pdfBuilder.getPdf();

        System.out.println(pdfDocument.getContent());
    }
}