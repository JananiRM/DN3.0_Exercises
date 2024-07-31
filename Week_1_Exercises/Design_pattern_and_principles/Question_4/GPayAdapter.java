public class GPayAdapter implements PaymentProcessor {
    private GPayGateway GPayGateway;

    public GPayAdapter() {
        this.GPayGateway = new GPayGateway();
    }

    @Override
    public void processPayment(double amount) {
        GPayGateway.charge(amount);
    }
}
