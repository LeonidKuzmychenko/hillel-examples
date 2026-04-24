package lk.tech.twentysix.grasp.creator;

public class Order {
    private String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}