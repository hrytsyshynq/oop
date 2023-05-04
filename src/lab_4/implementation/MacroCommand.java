package lab_4.implementation;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand {

    private List<OrderProcessor> orderProcessors = new ArrayList<>();

    public void add(OrderProcessor orderProcessor) {
        orderProcessors.add(orderProcessor);
    }

    public void execute() {
        for (OrderProcessor orderProcessor : orderProcessors) {
            orderProcessor.processOrder();
        }
    }
}