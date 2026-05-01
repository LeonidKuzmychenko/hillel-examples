package lk.tech.twentysix.solid.o;

public class RegularDiscountCalc implements DiscountCalculator{
    @Override
    public double calculate(double price) {
        return price * 0.05;
    }
}
