package lab_1.level_2;

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
