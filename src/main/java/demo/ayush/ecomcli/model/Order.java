package demo.ayush.ecomcli.model;

import demo.ayush.ecomcli.model.enums.OrderStatus;
import demo.ayush.ecomcli.utility.validationUtils;

import java.util.List;

// TODO: Assign unique order id to each order
// TODO: Make sure no 2 orders have same id
// TODO: Make sure user exists
// TODO: Make sure product exists
public class Order {
    private final int id;
    private final int userId;
    private final List<Product> products;
    private OrderStatus status;
//    private AtomicInteger ORDER_ID = new AtomicInteger(1);

    public Order(int id, int userId, List<Product> products) {
        this.id = id;
        this.userId = userId;
        this.products = products;
        this.status = OrderStatus.PENDING;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Status can't be null.");
        }
        if (!validationUtils.isValidEnum(status)) {
            throw new IllegalArgumentException("Invalid status: " + status);
        }
        this.status = status;
    }
}
