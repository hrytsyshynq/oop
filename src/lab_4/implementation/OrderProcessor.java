package lab_4.implementation;

public abstract class OrderProcessor {

    // Template method for processing an order
    public final void processOrder() {
        validateOrder();
        if (isGift()) {
            wrapGift();
        }
        processPayment();
        shipOrder();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void validateOrder();

    protected abstract boolean isGift();

    protected abstract void wrapGift();

    protected abstract void processPayment();

    protected abstract void shipOrder();
}