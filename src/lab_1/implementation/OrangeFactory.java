package lab_1.implementation;

public class OrangeFactory implements FruitFactory {
    public Fruit createFruit() {
        return new Orange();
    }
}
