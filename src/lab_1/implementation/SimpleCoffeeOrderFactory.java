package lab_1.implementation;

public class SimpleCoffeeOrderFactory extends CoffeeOrderFactory {
    private Coffee coffee;
    private CoffeeAddonFactory addOnFactory;

    public SimpleCoffeeOrderFactory(CoffeeAddonFactory addOnFactory) {
        this.addOnFactory = addOnFactory;
    }

    public Coffee createCoffee() {
        return this.coffee;
    }

    public void addMilk() {
        CoffeeAddon milk = addOnFactory.createMilk();
        System.out.println(milk.getName());
    }

    public void addSugar() {
        CoffeeAddon sugar = addOnFactory.createSugar();
        System.out.println(sugar.getName());
    }
}