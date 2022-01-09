package decorator;

public class PushNotifcation implements Notification {

    // decorator handling other operation inside one operation
    private Notification notification;

    public PushNotifcation(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        System.out.println("Push notification sent...............");

        if (notification != null){
            notification.send();
        }
    }
}
