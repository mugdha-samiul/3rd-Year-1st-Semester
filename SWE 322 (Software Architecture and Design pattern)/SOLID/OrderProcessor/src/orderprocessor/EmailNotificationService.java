/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderprocessor;

public class EmailNotificationService implements NotificationServiceInterface {

    /**
     *
     * @param message
     */
    @Override
    public void sendNotification(String message) {
        // Logic to send email notification
        System.out.println("Sending email notification: " + message);
    }
}