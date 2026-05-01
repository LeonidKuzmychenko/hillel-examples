package lk.tech.twentysix.grasp.creator;

import java.sql.SQLException;

public class OrderProvider {

    public Order provideOrder(String customerName) {
        return new Order(customerName);
    }

}
