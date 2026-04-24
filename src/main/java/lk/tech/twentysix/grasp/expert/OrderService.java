package lk.tech.twentysix.grasp.expert;

/**
 * Information Expert (Інформаційний експерт)
 * Відповідальність має отримати клас, який володіє потрібними даними
 */
public class OrderService {

    public double calculateTotal(Order order) {
        double total = 0;

        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }
}