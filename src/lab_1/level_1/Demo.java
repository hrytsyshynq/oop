package lab_1.level_1;

public class Demo {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.drive();

        CarFactory suvFactory = new MinivanFactory();
        Car suv = suvFactory.createCar();
        suv.drive();

        CarFactory sportsCarFactory = new HatchbackFactory();
        Car sportsCar = sportsCarFactory.createCar();
        sportsCar.drive();

        /*
        Output:
            Driving sedan...
            Driving minivan...
            Driving hatchback...
         */
    }
}