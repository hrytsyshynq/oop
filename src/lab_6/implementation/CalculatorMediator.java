package lab_6.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalculatorMediator {
    private Stack<Expression> stack = new Stack<>();
    private List<String> history = new ArrayList<>();

    public void interpret(String expression) {
        String[] elements = expression.split(" ");
        for (String element : elements) {
            if (isOperator(element)) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new BinaryExpression(left, right, element.charAt(0)));
            } else {
                Expression number = new NumberExpression(Integer.parseInt(element));
                stack.push(number);
            }
        }
        int result = stack.pop().interpret();
        history.add(expression + " = " + result);
        System.out.println(result);
    }

    public void showHistory() {
        for (String expression : history) {
            System.out.println(expression);
        }
    }

    private boolean isOperator(String element) {
        return element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/");
    }
}