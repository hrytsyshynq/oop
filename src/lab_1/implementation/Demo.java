package lab_1.implementation;

public class Demo {
    public static void main(String[] args) {
        FruitSelector appleChooser = new FruitSelector(new AppleFactory());
        Fruit apple = appleChooser.chooseFruit();
        System.out.println("Selected " + apple.getName());

        FruitSelector orangeChooser = new FruitSelector(new OrangeFactory());
        Fruit orange = orangeChooser.chooseFruit();
        System.out.println("Selected " + orange.getName());

        /** output:
         * Selected Apple
         * Selected Orange
         */
    }
}