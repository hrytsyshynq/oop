package lab_8.implementation;

public class PNGImage implements Image {
    private String filename;

    public PNGImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Displaying PNG image " + filename);
    }
}