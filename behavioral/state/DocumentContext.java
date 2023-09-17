package behavioral.state;

public class DocumentContext {
    private DocumentState currentDocument;

    public void format() {
        currentDocument.format();
    }

    public void print() {
        currentDocument.print();
    }

    public DocumentState getCurrentDocument() {
        return currentDocument;
    }

    public void setCurrentDocument(DocumentState currentDocument) {
        this.currentDocument = currentDocument;
    }

}
