package lab_6.implementation;

public class BinaryExpression implements Expression {
    private final Expression left;
    private final Expression right;
    private final char operator;

    public BinaryExpression(Expression left, Expression right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public int interpret() {
        switch (operator) {
            case '+':
                return left.interpret() + right.interpret();
            case '-':
                return left.interpret() - right.interpret();
            case '*':
                return left.interpret() * right.interpret();
            case '/':
                return left.interpret() / right.interpret();
            default:
                return 0;
        }
    }
}