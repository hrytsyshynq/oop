package lab_7.implementation;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document();
        document.setText("Some text before visitor visit"); // 5 words

        DocumentStatisticsVisitor visitor = new DocumentStatisticsVisitor();
        document.accept(visitor);
        document.setText("Text after visitor have visited the document"); // 7 words

        System.out.println("Words count: " + visitor.getWordsCount());

        document.restoreVersion(0);
        System.out.println(document.getText());

        document.restoreVersion(1);
        System.out.println(document.getText());
    }
}