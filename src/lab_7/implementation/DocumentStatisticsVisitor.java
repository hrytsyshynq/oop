package lab_7.implementation;

public class DocumentStatisticsVisitor implements DocumentVisitor {
    private int wordsCount;

    public void visit(Document document) {
        wordsCount = document.getText().split("\\s+").length;
    }

    public int getWordsCount() {
        return wordsCount;
    }
}