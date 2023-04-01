package lab_1.level_2;

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
