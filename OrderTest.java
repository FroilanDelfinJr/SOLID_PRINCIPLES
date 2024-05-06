public class OrderTest {
    public static void main(String[] args) {
        OrderCalculator orderCalculator = new OrderAction();
        orderCalculator.calculateTotal(10.0, 2);

        OrderPlacer orderPlacer = new OrderAction();
        orderPlacer.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoiceGenerator = new OrderAction();
        invoiceGenerator.generateInvoice("order_123.pdf");

        EmailNotifier emailNotifier = new OrderAction();
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}