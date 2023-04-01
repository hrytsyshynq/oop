package lab_2.implementation;

public class Car extends Vehicle {
    public Car() {
        numWheels = 4;
        color = "green";
        maxSpeed = 250;
    }

    public Car clone() {
        return new Car();
    }
}
