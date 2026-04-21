package lk.tech.twentyfive.decorator;

class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Кава";
    }

    @Override
    public double cost() {
        return 60; // Ціна простої кави
    }
}