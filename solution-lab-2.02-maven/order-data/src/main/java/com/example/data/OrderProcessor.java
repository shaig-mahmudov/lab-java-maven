package com.example.data;
import com.google.gson.Gson;

public class OrderProcessor {

    public static Order parseOrderJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Order.class);
    }

    public static void main(String[] args) {

        String sampleJson = "{ \"orderId\": \"ORD-123\", \"customer\": \"Veli Aliyev\", \"items\": [ {\"name\": \"Notebook\", \"price\": 1500.0}, {\"name\": \"Mouse\", \"price\": 50.0} ], \"total\": 1550.0 }";

        Order order = parseOrderJson(sampleJson);

        System.out.println("=== ORDER DATA MODULE ===");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomer());
        System.out.println("Items: " + order.getItems().size());
    }
}