package behavioral.strategy;

public class TextEditorContext {
    private String text;

    public TextEditorContext(String text) {
        this.text = text;
    }

    public void format(FormatterStrategy formatter) {
        text = formatter.apply(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
