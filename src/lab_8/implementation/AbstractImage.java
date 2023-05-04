package lab_8.implementation;

public abstract class AbstractImage {
    protected Image image;

    public AbstractImage(Image image) {
        this.image = image;
    }

    public abstract void display();
}