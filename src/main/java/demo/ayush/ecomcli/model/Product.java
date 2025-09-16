package demo.ayush.ecomcli.model;

import demo.ayush.ecomcli.utility.ValidationUtils;

public class Product {
    private final int id;
    private String name;
    private double price;
    private int stock;

    // TODO: make system assign productID (5 digit)
    public Product(int id, String name, double price, int stock) {
        if (!ValidationUtils.isPositive(id)) {
            throw new IllegalArgumentException("Product ID must be <= 0: " + id);
        }
        if (!ValidationUtils.isNotBlank(name)) {
            throw new IllegalArgumentException("Product name can't be blank.");
        }
        if (!ValidationUtils.isPositive(price)) {
            throw new IllegalArgumentException("Price must be <= 0: " + price);
        }
        if (!ValidationUtils.isPositive(stock)) {
            throw new IllegalArgumentException("Price must be <= 0: " + stock);
        }
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!ValidationUtils.isNotBlank(name)) {
            throw new IllegalArgumentException("Product name can't be blank.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (!ValidationUtils.isPositive(price)) {
            throw new IllegalArgumentException("Price must be <= 0: " + price);
        }
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (!ValidationUtils.isPositive(stock)) {
            throw new IllegalArgumentException("Price must be <= 0: " + stock);
        }
        this.stock = stock;
    }
}
