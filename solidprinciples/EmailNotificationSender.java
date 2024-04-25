package solidprinciples;

public class EmailNotificationSender implements EmailNotification {

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to " + email);
    }
}
