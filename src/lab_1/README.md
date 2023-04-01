### Програма, яка дозволяє використовувати різний типи кави та додатків. Імплементація із використанням породжуючого Factory method та Abstract Factory.

&nbsp;
#### Імплементація Factory Method
#### Створимо інтерфейс Coffee, який визначає методи для конкретного типу кави.

```java
public interface Coffee {
    String getName();

    double getPrice();
}
```
#### Далі, створюємо класи Espresso та Latte для кожного типу кави, реалізуючи інтерфейс Coffee.
```java
public class Espresso implements Coffee {
    public String getName() {
        return "Espresso";
    }

    public double getPrice() {
        return 30.99;
    }
}
```
```java
public class Latte implements Coffee {
    public String getName() {
        return "Latte";
    }

    public double getPrice() {
        return 25.99;
    }
}
```

#### Наступний крок -- це створення фабричного класу CoffeeFactory.
```java
public abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
}
```

#### Далі створимо класи EspressoFactory та LatteFactory, які наслідують абстрактний клас CoffeeFactory та реалізують його метод createCoffee().
```java
public class EspressoFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Espresso();
    }
}
```
```java

public class LatteFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Latte();
    }
}
```

#### Імплементація Abstract Factory
#### Створимо інтерфейс CoffeeAddon, який визначає методи для конкретного додатку кави.

```java
public interface CoffeeAddon {
    String getName();

    double getPrice();
}
```
#### Далі, створюємо класи Milk та Sugar для кожного типу додатку кави, реалізуючи інтерфейс Coffee.
```java
public class Milk implements CoffeeAddon {
    public String getName() {
        return "- Milk";
    }

    public double getPrice() {
        return 3.0;
    }
}
```
```java
public class Sugar implements CoffeeAddon {
    public String getName() {
        return "- Sugar";
    }

    public double getPrice() {
        return 2.50;
    }
}
```
#### Cтворюємо абстрактний клас CoffeeAddonFactory, в якому визначимо методи для створення додатків до кави.
```java
public abstract class CoffeeAddonFactory {
    public abstract CoffeeAddon createMilk();

    public abstract CoffeeAddon createSugar();
}
```
#### Реалізуємо клас SimpleCoffeeAddonFactory, які розширює абстрактний клас CoffeeAddonFactory і реалізовують методи createMilk() та createSugar().
```java
public class SimpleCoffeeAddonFactory extends CoffeeAddonFactory {
    public CoffeeAddon createMilk() {
        return new Milk();
    }

    public CoffeeAddon createSugar() {
        return new Sugar();
    }
}
```

#### Далі створюємо абстрактний клас CoffeeOrderFactory, який визначає методи для створення кави та додатків.
```java
public abstract class CoffeeOrderFactory {
    public abstract Coffee createCoffee();
    public abstract void addMilk();
    public abstract void addSugar();
}
```

#### Реалізуємо клас CoffeeOrderFactory в новому класі SimpleCoffeeOrderFactory.
```java
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
```

#### Демонстрація роботи
```java
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
```