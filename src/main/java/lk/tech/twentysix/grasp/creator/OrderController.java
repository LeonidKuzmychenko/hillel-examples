package lk.tech.twentysix.grasp.creator;

/**
 * Creator (Творець)
 * Клас створює інший клас, якщо він його містить, використовує або тісно пов’язаний з ним
 * Делегувати створення пов’язаному класу
 */
public class OrderController {

    public void createOrder() {
        // Контролер сам створює Order без потреби
        Order order = new Order("Іван");

        System.out.println("Замовлення створено для: " + order.getCustomerName());
    }
}