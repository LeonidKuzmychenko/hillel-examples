package lk.tech.twentysix.solid.o;

public class VipDiscountCalc implements DiscountCalculator{
    @Override
    public double calculate(double price) {
        return price * 0.10;
    }
}
