package lk.tech.twentysix.solid.o;

public class PremiumDiscountCalc implements DiscountCalculator{
    @Override
    public double calculate(double price) {
        return price * 0.15;
    }
}
