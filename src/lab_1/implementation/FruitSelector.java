package lab_1.implementation;

public class FruitSelector {
    private FruitFactory fruitFactory;

    public FruitSelector(FruitFactory fruitFactory) {
        this.fruitFactory = fruitFactory;
    }

    public Fruit chooseFruit() {
        return fruitFactory.createFruit();
    }
}