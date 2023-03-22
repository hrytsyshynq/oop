package lab_1.level_1;

public class MinivanFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Minivan();
    }
}