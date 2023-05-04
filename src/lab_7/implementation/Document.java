package lab_7.implementation;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private String text;
    private List<DocumentMemento> versions = new ArrayList<>();

    public void setText(String text) {
        this.text = text;
        versions.add(new DocumentMemento(text));
    }

    public String getText() {
        return text;
    }

    public void restoreVersion(int versionNumber) {
        text = versions.get(versionNumber).getText();
    }

    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}