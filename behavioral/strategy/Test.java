package behavioral.strategy;

public class Test {
    public static void main(String[] args) {
        var editor = new TextEditorContext("hello");

        editor.format(new UpperCaseFormatter());
        System.out.println(editor.getText());

        editor.format(new LowerCaseFormatter());
        System.out.println(editor.getText());

        editor.setText("    hello World");

        System.out.println(editor.getText());
        editor.format(new Trimmer());
        System.out.println(editor.getText());
    }
}