package lab_3.implementation;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String cardNumber, String cvv, String dateOfExpiry) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card.");
    }
}