package lab_4.implementation;

public class Demo {
    public static void main(String[] args) {
        OrderProcessor onlineOrderProcessor = new OnlineOrderProcessor();
        OrderProcessor inStoreOrderProcessor = new InStoreOrderProcessor();

        onlineOrderProcessor.processOrder();
        System.out.println();

        inStoreOrderProcessor.processOrder();
        System.out.println();

        MacroCommand macroCommand = new MacroCommand();
        macroCommand.add(onlineOrderProcessor);
        macroCommand.add(inStoreOrderProcessor);

        macroCommand.execute();
    }
}