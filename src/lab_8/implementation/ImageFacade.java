package lab_8.implementation;

public class ImageFacade {
    public static void displayImage(String filename) {
        AbstractImage image = new ImageProxy(filename);
        image.display();
    }
}
