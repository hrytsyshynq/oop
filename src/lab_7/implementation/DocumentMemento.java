package lab_7.implementation;

public class DocumentMemento {
    private final String text;

    public DocumentMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}