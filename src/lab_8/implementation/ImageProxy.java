package lab_8.implementation;

public class ImageProxy extends AbstractImage {
    private String filename;

    public ImageProxy(String filename) {
        super(null);
        this.filename = filename;
    }

    @Override
    public void display() {
        if (image == null) {
            if (filename.contains("jpg")) {
                image = new JPGImage(filename);
            } else {
                image = new PNGImage(filename);
            }
        }
        System.out.println("Displaying preview of " + filename);
        image.display();
    }
}