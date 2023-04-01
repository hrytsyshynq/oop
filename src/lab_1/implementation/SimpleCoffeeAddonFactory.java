package lab_1.implementation;

public class SimpleCoffeeAddonFactory extends CoffeeAddonFactory {
    public CoffeeAddon createMilk() {
        return new Milk();
    }

    public CoffeeAddon createSugar() {
        return new Sugar();
    }
}