package lk.tech.twentysix.solid.o;

/***
 * Open/Closed Principle (Принцип відкритості/закритості)
 * Код має бути відкритий для розширення, але закритий для зміни
 * Рішення: Використати поліморфізм, Strategy Pattern
 */
public class DiscountService {

    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("REGULAR")) {
            return amount * 0.05;
        } else if (customerType.equals("VIP")) {
            return amount * 0.10;
        } else if (customerType.equals("PREMIUM")) {
            return amount * 0.15;
        }
        return 0;
    }
}