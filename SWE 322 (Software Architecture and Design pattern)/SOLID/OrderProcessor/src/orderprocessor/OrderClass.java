/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderprocessor;

import java.util.List;

public class OrderClass {
    private int order_id;
    private List<Product> items;
    private double total_amount;

    public OrderClass(int order_id, List<Product> items, double total_amount) {
        this.order_id = order_id;
        this.items = items;
        this.total_amount = total_amount;
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public String generateInvoice() {
        StringBuilder invoice = new StringBuilder("Invoice for Order " + order_id + "\n");
        for (Product item : items) {
            invoice.append(item.getName()).append(": ").append(item.getPrice()).append(" x ").append(item.getQuantity()).append("\n");
        }
        invoice.append("Total Amount: ").append(total_amount).append("\n");
        return invoice.toString();
    }
}