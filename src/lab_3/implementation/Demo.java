package lab_3.implementation;

public class Demo {
    public static void main(String[] args) {
        PaymentStrategy strategy = new CreditCardStrategy("5375 2848 1252 8242", "522", "12/24");
        strategy.pay(150.00);

        strategy = new PayPalStrategy("username@example.com", "12jJsau2ds*U");
        strategy.pay(20.00);

        Product product = new Product("Product 1", 12.50);
        product.registerObserver(new PriceObserver("Observer 1"));
        product.registerObserver(new PriceObserver("Observer 2"));

        product.setPrice(55.20);

        Product product1 = new Product("Product 2", 15.00);
        Product product2 = new Product("Product 3", 26.00);

        ShoppingCart cart = new ShoppingCart();
        cart.addCommand(new AddToCartCommand(product1));
        cart.addCommand(new AddToCartCommand(product2));
        cart.executeCommands();

        cart.addCommand(new RemoveFromCartCommand(product1));
        cart.executeCommands();

        /*
            Output:
            Paid 150.0 using credit card.
            Paid 20.0 using PayPal.
            Observer 1 received price update: 55.2
            Observer 2 received price update: 55.2
            Added Product 2 to cart.
            Added Product 3 to cart.
            Removed Product 2 from cart.
         */
    }
}
