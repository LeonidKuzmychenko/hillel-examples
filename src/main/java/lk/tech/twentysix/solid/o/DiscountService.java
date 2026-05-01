package lk.tech.twentysix.solid.o;

/***
 * Open/Closed Principle (Принцип відкритості/закритості)
 * Код має бути відкритий для розширення, але закритий для зміни
 * Рішення: Використати поліморфізм, Strategy Pattern
 */
public class DiscountService {

    public double calculateDiscount(DiscountCalculator discountCalculator, double amount) {
        return discountCalculator.calculate(amount);
    }
}