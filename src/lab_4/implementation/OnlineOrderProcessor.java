package lab_4.implementation;

public class OnlineOrderProcessor extends OrderProcessor {

    @Override
    protected void validateOrder() {
        System.out.println("Validating online order...");
    }

    @Override
    protected boolean isGift() {
        return false;
    }

    @Override
    protected void wrapGift() {
        // Not applicable for online orders
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing online payment...");
    }

    @Override
    protected void shipOrder() {
        System.out.println("Shipping online order...");
    }
}