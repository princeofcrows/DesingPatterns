package behavioral.mediator;

public class ArticlesDialogBox {
    private ListBox articleListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        articleListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articleListBox.setSelection("Test Article");
        titleTextBox.setContent("Test Article");
        System.out.println("TextBox Content: " + titleTextBox.getContent());
        System.out.println("Button Enabled?: " + saveButton.isEnabled());

        articleListBox.setSelection("");
        titleTextBox.setContent("");
        System.out.println("TextBox Content: " + titleTextBox.getContent());
        System.out.println("Button Enabled?: " + saveButton.isEnabled());
    }

    private void articleSelected() {
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}