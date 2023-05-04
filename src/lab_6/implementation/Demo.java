package lab_6.implementation;

public class Demo {
    public static void main(String[] args) {
        CalculatorMediator calculator = new CalculatorMediator();
        calculator.interpret("2 6 +");
        calculator.interpret("4 5 *");
        calculator.interpret("25 5 /");
        calculator.showHistory();
    }
}