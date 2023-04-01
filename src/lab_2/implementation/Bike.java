package lab_2.implementation;

public class Bike extends Vehicle {
    public Bike() {
        numWheels = 2;
        color = "blue";
        maxSpeed = 100;
    }

    public Bike clone() {
        return new Bike();
    }

    @Override
    public String toString() {
        return "Bike{" +
                "numWheels=" + numWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}