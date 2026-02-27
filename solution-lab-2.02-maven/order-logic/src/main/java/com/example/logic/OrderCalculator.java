package com.example.logic;

import com.example.data.Order;
import com.example.data.OrderItem;
import com.example.data.OrderProcessor;

public class OrderCalculator {
    public static void main(String[] args) {
        String sampleJson = "{ \"orderId\": \"ORD-123\", \"customer\": \"Veli Aliyev\", \"items\": [ {\"name\": \"Notebook\", \"price\": 1500.0}, {\"name\": \"Mouse\", \"price\": 50.0} ], \"total\": 1550.0 }";

        Order order = OrderProcessor.parseOrderJson(sampleJson);

        System.out.println("=== ORDER LOGIC MODULE ===");
        System.out.println("Order Tracking: " + order.getOrderId());

        double calculatedTotal = 0;
        for (OrderItem item : order.getItems()) {
            calculatedTotal += item.getPrice();
        }

        System.out.println("Total from JSON: " + order.getTotal());
        System.out.println("Calculated Total: " + calculatedTotal);

        if (Double.compare(calculatedTotal, order.getTotal()) == 0) {
            System.out.println("Result: Correct!");
        } else {
            System.out.println("Result: Error!");
        }
    }
}