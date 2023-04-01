package lab_3.implementation;

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String userEmail, String userPassword) {
        this.email = userEmail;
        this.password = userPassword;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}