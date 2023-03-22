package lab_1.level_1;

public class Demo {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.drive();

        CarFactory minivanFactory = new MinivanFactory();
        Car minivan = minivanFactory.createCar();
        minivan.drive();

        CarFactory hatchbackFactory = new HatchbackFactory();
        Car hatchback = hatchbackFactory.createCar();
        hatchback.drive();

        /*
        Output:
            Driving sedan...
            Driving minivan...
            Driving hatchback...
         */
    }
}