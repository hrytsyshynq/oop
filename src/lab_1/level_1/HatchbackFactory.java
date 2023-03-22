package lab_1.level_1;

public class HatchbackFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Hatchback();
    }
}