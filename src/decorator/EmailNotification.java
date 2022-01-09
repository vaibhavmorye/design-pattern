package decorator;

public class EmailNotification implements Notification {

    // decorator handling other operation inside one operation
    private final Notification notification;


    public EmailNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        System.out.println("Email sent...............");

        if (notification != null){
            notification.send();
        }
    }
}
