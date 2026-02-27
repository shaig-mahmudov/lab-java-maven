package com.example.data;
import java.util.List;

public class Order {
    private String orderId;
    private String customer;
    private List<OrderItem> items;
    private double total;

    public String getOrderId() { return orderId; }
    public String getCustomer() { return customer; }
    public List<OrderItem> getItems() { return items; }
    public double getTotal() { return total; }
}