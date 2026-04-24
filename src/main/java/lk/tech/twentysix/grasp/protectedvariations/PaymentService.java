package lk.tech.twentysix.grasp.protectedvariations;

/**
 * Protected Variations (Захист від змін)
 * Ізолювати місця, які часто змінюються, через абстракції
 * Ввести інтерфейс та адаптери
 */
public class PaymentService {

    public void pay(String paymentType, double amount) {
        if (paymentType.equals("CARD")) {
            System.out.println("Оплата карткою: " + amount);
        } else if (paymentType.equals("PAYPAL")) {
            System.out.println("Оплата через PayPal: " + amount);
        } else if (paymentType.equals("CASH")) {
            System.out.println("Оплата готівкою: " + amount);
        } else {
            throw new RuntimeException("Невідомий тип оплати");
        }
    }
}