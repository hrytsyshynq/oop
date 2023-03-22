package lab_1.level_1;

public class SedanFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }
}