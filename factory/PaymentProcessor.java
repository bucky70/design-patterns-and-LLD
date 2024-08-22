package factory;

public class PaymentProcessor {
    public void processPayment(Payment payment) {
        if (payment.getType() == PaymentType.CREDIT_CARD) {
            CreditCardPaymentProcessor processor = new CreditCardPaymentProcessor();
            processor.process(payment);
        } else if (payment.getType() == PaymentType.PAYPAL) {
            PayPalPaymentProcessor processor = new PayPalPaymentProcessor();
            processor.process(payment);
        }
    }
}

public abstract class PaymentProcessor {
    public abstract void process(Payment payment);
}

public class CreditCardPaymentProcessor extends PaymentProcessor {
    @Override
    public void process(Payment payment) {
        // Credit card specific processing
    }
}

public class PayPalPaymentProcessor extends PaymentProcessor {
    @Override
    public void process(Payment payment) {
        // PayPal specific processing
    }
}