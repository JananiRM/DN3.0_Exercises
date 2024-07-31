public class Test {
    public static void main(String[] args) {
        PaymentProcessor paytmProcessor = new PaytmAdapter();
        PaymentProcessor GPayProcessor = new GPayAdapter();

        paytmProcessor.processPayment(100.0);
        GPayProcessor.processPayment(150.0);
    }
}
