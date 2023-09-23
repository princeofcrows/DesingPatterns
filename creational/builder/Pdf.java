package creational.builder;

public class Pdf {
    private String content = "";

    public void addPage(String data) {
        content += data;
    }

    public String getContent() {
        return content;
    }
}
