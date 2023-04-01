package lab_3.implementation;

public class AddToCartCommand implements Command {
    private Product product;

    public AddToCartCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        System.out.println("Added " + product.getName() + " to cart.");
    }
}