package lab_2.implementation;

public abstract class Vehicle {
    protected int numWheels;
    protected String color;
    protected int maxSpeed;

    public abstract Vehicle clone();

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numWheels=" + numWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}