package lk.tech.twentyfive.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Milk2Coffee implements Coffee {

    private Coffee simpleCoffee;

    @Override
    public String getDescription() {
        return simpleCoffee.getDescription() + " з молоком";
    }

    @Override
    public double cost() {
        return simpleCoffee.cost() + 30;
    }
}
