package lab_1.level_2;

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
