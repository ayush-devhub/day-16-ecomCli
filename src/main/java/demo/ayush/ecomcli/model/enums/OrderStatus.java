package demo.ayush.ecomcli.model.enums;

public enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    public static boolean isInstance(OrderStatus input) {
        return input instanceof OrderStatus;
    }

}
