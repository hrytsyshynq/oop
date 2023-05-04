package lab_1.implementation;

public class AppleFactory implements FruitFactory {
    public Fruit createFruit() {
        return new Apple();
    }
}