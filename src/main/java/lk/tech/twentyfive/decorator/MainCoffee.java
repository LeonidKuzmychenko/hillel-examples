package lk.tech.twentyfive.decorator;

public class MainCoffee {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription());
        System.out.println(simpleCoffee.cost());

        Coffee milkCoffee = new MilkCoffee();
        System.out.println(milkCoffee.getDescription());
        System.out.println(milkCoffee.cost());

        Coffee milk2Coffee = new Milk2Coffee(simpleCoffee);
        System.out.println(milk2Coffee.getDescription());
        System.out.println(milk2Coffee.cost());

    }
}
