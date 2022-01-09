package decorator;

public class SMSNotification implements Notification {

    // decorator handling other operation inside one operation
    private Notification notification;

    public SMSNotification(Notification emailNotification) {
        notification = emailNotification;
    }

    @Override
    public void send() {
        System.out.println("SMS sent...............");

        if (notification != null) {
            notification.send();
        }
    }
}
