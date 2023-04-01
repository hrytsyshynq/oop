package lab_3.implementation;

public class RemoveFromCartCommand implements Command {
    private Product product;

    public RemoveFromCartCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        System.out.println("Removed " + product.getName() + " from cart.");
    }
}