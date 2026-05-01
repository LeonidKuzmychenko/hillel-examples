package lk.tech.twentysix.grasp.creator;

/**
 * Creator (Творець)
 * Клас створює інший клас, якщо він його містить, використовує або тісно пов’язаний з ним
 * Делегувати створення пов’язаному класу
 */
public class OrderController {

    private final OrderProvider orderProvider;

    public OrderController(OrderProvider orderProvider) {
        this.orderProvider = orderProvider;
    }

    public void createOrder() {
        // Контролер сам створює Order без потреби
        Order order = orderProvider.provideOrder("Іван");
        System.out.println("Замовлення створено для: " + order.getCustomerName());
    }
}