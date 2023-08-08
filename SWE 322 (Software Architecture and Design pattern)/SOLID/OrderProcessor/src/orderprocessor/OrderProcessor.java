/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orderprocessor;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private OrderClass order;
    private PaymentProcessor paymentProcessor;
    private NotificationServiceInterface notificationService;

    public OrderProcessor(OrderClass order, PaymentProcessor paymentProcessor, NotificationServiceInterface notificationService) {
        this.order = order;
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    public void processOrder() {
        paymentProcessor.processPayment(order);
        String invoice = order.generateInvoice();
        notificationService.sendNotification(invoice);
    }

    public static void main(String[] args) {
        int order_id = 1;
        List<Product> items = new ArrayList<>();
        items.add(new Product("Item 1", 100, 2));
        items.add(new Product("Item 2", 50, 3));
        double total_amount = 250;

        OrderClass order = new OrderClass(order_id, items, total_amount);
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        NotificationServiceInterface emailNotificationService = new EmailNotificationService();

        OrderProcessor orderProcessor = new OrderProcessor(order, paymentProcessor, emailNotificationService);
        orderProcessor.processOrder();
    }
}