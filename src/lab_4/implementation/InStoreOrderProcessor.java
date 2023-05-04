package lab_4.implementation;

public class InStoreOrderProcessor extends OrderProcessor {

    @Override
    protected void validateOrder() {
        System.out.println("Validating in-store order...");
    }

    @Override
    protected boolean isGift() {
        return true;
    }

    @Override
    protected void wrapGift() {
        System.out.println("Wrapping gift...");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing in-store payment...");
    }

    @Override
    protected void shipOrder() {
        System.out.println("Preparing in-store order for pickup...");
    }
}