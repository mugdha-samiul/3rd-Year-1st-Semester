/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderprocessor;

import java.util.List;

public class DiscountedOrder extends OrderClass {
    private double discount;

    public DiscountedOrder(int order_id, List<Product> items, double total_amount, double discount) {
        super(order_id, items, total_amount);
        this.discount = discount;
    }

    @Override
    public double calculateTotalAmount() {
        double total = super.calculateTotalAmount();
        total -= discount;
        return total;
    }
}
