# Рівень 2
### Програма, яка дозволяє використовувати різний транспорт, в залежності від вибору користувача. Імплементація із використанням породжуючого Factory method.

&nbsp;
####  Створимо інтерфейс Vehicle, який буде імплементований різними типами транспорту.

```java
public interface Vehicle {
    void start();
    void stop();
}
```
#### Далі, створюємо класи Car та Motorcycle для кожного типу транспортного засобу, реалізуючи інтерфейс Vehicle.
```java
public class Car implements Vehicle {
    public void start() {
        System.out.println("Starting the car");
    }

    public void stop() {
        System.out.println("Stopping the car");
    }
}
```
```java
public class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Starting the motorcycle");
    }

    public void stop() {
        System.out.println("Stopping the motorcycle");
    }
}
```

#### Наступний крок -- це створення фабричного класу  VehicleFactory, який повертає екземпляр класу транспортного засобу на основі введених даних користувачем.
```java
public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car();
            case MOTORCYCLE:
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType.getName());
        }
    }
}
```

#### Також для зручності введення даних, створимо enum VehicleType
```java
public enum VehicleType {
    CAR("Car"),
    MOTORCYCLE("Motorcycle");

    private final String name;

    VehicleType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

#### Демонстрація роботи
```java
public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.CAR);
        vehicle.start();
        vehicle.stop();

        vehicle = VehicleFactory.getVehicle(VehicleType.MOTORCYCLE);
        vehicle.start();
        vehicle.stop();
    }

    /*
        Output:
            Starting the car
            Stopping the car
            Starting the motorcycle
            Stopping the motorcycle
     */
}
```