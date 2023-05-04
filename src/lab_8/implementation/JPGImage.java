package lab_8.implementation;

public class JPGImage implements Image {
    private String filename;

    public JPGImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Displaying JPG image " + filename);
    }
}