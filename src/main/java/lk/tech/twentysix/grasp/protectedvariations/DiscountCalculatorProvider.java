package lk.tech.twentysix.grasp.protectedvariations;

public class DiscountCalculatorProvider {

    public DiscountCalculator provide(String type) {
        if (type.equals("vip")) {
            return new VipDiscountCalc();
        }

        if (type.equals("regular")) {
            return new RegularDiscountCalc();
        }

        if (type.equals("premium")) {
            return new PremiumDiscountCalc();
        }

        throw new IllegalArgumentException("Invalid discount calculator type");
    }
}
