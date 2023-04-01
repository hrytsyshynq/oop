package lab_3.implementation;

public class PriceObserver implements Observer {
    private String name;

    public PriceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " received price update: " + price);
    }
}