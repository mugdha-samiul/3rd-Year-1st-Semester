/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderprocessor;

public class SMSNotificationService implements NotificationServiceInterface {
    @Override
    public void sendNotification(String message) {
        // Logic to send SMS notification
        System.out.println("Sending SMS notification: " + message);
    }
}