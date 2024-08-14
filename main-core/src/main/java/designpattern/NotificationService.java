package designpattern;

public class NotificationService {

    public void sendNotification(String type, String message) {
        Notification notification = null;

        if (type.equals("EMAIL")) {
            notification = new EmailNotification();
        } else if (type.equals("SMS")) {
            notification = new SMSNotification();
        } else if (type.equals("PUSH")) {
            notification = new PushNotification();
        }

        if (notification != null) {
            notification.send(message);
        } else {
            System.out.println("Invalid notification type");
        }
    }
}
