package lk.tech.twentysix.grasp.protectedvariations;

/**
 * Protected Variations (Захист від змін)
 * Ізолювати місця, які часто змінюються, через абстракції
 * Ввести інтерфейс та адаптери
 */
public class DiscountService {
    private final DiscountCalculatorProvider provider;

    public DiscountService(DiscountCalculatorProvider provider) {
        this.provider = provider;
    }

    public double calculateDiscount(String type, double amount) {
        DiscountCalculator discountCalculator = provider.provide(type);
        return discountCalculator.calculate(amount);
    }
}