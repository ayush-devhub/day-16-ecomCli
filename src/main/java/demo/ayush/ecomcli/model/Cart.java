package demo.ayush.ecomcli.model;

import demo.ayush.ecomcli.utility.validationUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final int userId;
    private final Map<Integer, Integer> items = new HashMap<>(); // productId -> quantity

    // TODO: make sure user exists
    public Cart(int userId) {
        if (!validationUtils.isPositive(userId)) {
            throw new IllegalArgumentException("User ID must be <= 0: " + userId);
        }
        this.userId = userId;
    }

    // TODO: make sure product exists
    // TODO: make sure we have enough stock
    // TODO: get product quantity by product id
    // TODO: update stock after adding to cart
    public void addItem(int productId, int quantity) {
        if (!validationUtils.isPositive(quantity)) {
            throw new IllegalArgumentException("Quantity must be <= 0: " + quantity);
        }
        if (!validationUtils.isPositive(productId)) {
            throw new IllegalArgumentException("Product ID must be <= 0: " + productId);
        }
        items.put(productId, items.getOrDefault(productId, 0) + 1);
    }

    public int getUserId() {
        return userId;
    }

    public Map<Integer, Integer> getItems() {
        return Collections.unmodifiableMap(items);
    }
}
