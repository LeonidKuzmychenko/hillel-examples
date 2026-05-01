package lk.tech.twentysix.grasp.protectedvariations;

public class VipDiscountCalc implements DiscountCalculator {
    @Override
    public double calculate(double price) {
        return price * 0.10;
    }
}
