package lab_2.implementation;

public class VehicleBuilder {
    private Vehicle vehicle;

    public VehicleBuilder(Vehicle vehicle) {
        this.vehicle = vehicle.clone();
    }

    public VehicleBuilder setNumWheels(int numWheels) {
        vehicle.setNumWheels(numWheels);
        return this;
    }

    public VehicleBuilder setColor(String color) {
        vehicle.setColor(color);
        return this;
    }

    public VehicleBuilder setMaxSpeed(int maxSpeed) {
        vehicle.setMaxSpeed(maxSpeed);
        return this;
    }

    public Vehicle build() {
        return vehicle;
    }
}