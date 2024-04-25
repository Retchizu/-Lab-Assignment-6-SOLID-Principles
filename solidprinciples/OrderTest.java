package solidprinciples;

public class OrderTest {

    public static void main(String[] args) {
        Order order = new OrderAction();
        Invoice invoice = new InvoiceGenerator();
        EmailNotification emailNotification = new EmailNotificationSender();

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        invoice.generateInvoice("order_123.pdf");
        emailNotification.sendEmailNotification("johndoe@example.com");
    }
}