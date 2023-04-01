package lab_2.implementation;

public class Truck extends Vehicle {
    public Truck() {
        numWheels = 6;
        color = "green";
        maxSpeed = 150;
    }

    public Truck clone() {
        return new Truck();
    }
}