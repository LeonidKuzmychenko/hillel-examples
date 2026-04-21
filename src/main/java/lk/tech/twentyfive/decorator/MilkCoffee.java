package lk.tech.twentyfive.decorator;

public class MilkCoffee extends SimpleCoffee {
    @Override
    public String getDescription() {
        return super.getDescription() + " з молоком";
    }

    @Override
    public double cost() {
        return super.cost() + 30;
    }
}
