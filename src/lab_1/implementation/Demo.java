package lab_1.implementation;

public class Demo {
    public static void main(String[] args) {
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        System.out.println(espresso.getName());

        CoffeeAddonFactory simpleAddOnFactory = new SimpleCoffeeAddonFactory();
        CoffeeOrderFactory espressoOrder = new SimpleCoffeeOrderFactory(simpleAddOnFactory);
        espressoOrder.addMilk();
        espressoOrder.addSugar();

        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        System.out.println(latte.getName());

        CoffeeAddonFactory simpleCoffeeOrderFactory = new SimpleCoffeeAddonFactory();
        CoffeeOrderFactory latteOrder = new SimpleCoffeeOrderFactory(simpleCoffeeOrderFactory);
        latteOrder.addMilk();
        latteOrder.addSugar();

        /*
        Output:
            Espresso
            - Milk
            - Sugar
            Latte
            - Milk
            - Sugar
     */
    }
}