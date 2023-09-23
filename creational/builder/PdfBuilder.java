package creational.builder;

public class PdfBuilder implements Builder{
    private final Pdf pdf = new Pdf();
    @Override
    public void buildPart(String content) {
        pdf.addPage(content);
    }

    public Pdf getPdf() {
        return pdf;
    }
}
