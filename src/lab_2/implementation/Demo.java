package lab_2.implementation;

public class Demo {
    public static void main(String[] args) {
        Bike bike = new Bike().clone();
        System.out.println(bike.toString());

        Vehicle customBike = new VehicleBuilder(new Bike().clone()) // перевизначимо за допомогою VehicleBuilder нові парамеетри для об'єкту Bike
                .setColor("red")
                .setMaxSpeed(300)
                .build();
        System.out.println(customBike.toString());
    }
}