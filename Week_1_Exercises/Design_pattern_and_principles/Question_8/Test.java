public class Test {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy paypalPayment = new PayPalPayment("john.doe@example.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(100.0); 

        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.executePayment(200.0);
    }
}
