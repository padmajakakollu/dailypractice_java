package abstraction;

interface Payment{
    // Abstract method
    void processPayment(double amount);
}
class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of amount :: "+ amount);
    }
}

class CreditCard implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CreditCard Payment of amount :: "+ amount);

    }
}
class UPIPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of amount :: "+ amount);

    }
}


public class PaymentAbstractionThroughInterfaceExample {
    public static void main(String[] args) {
        Payment payment;
        payment = new CreditCard();
        payment.processPayment(300);

        payment = new PayPalPayment();
        payment.processPayment(800);

        payment = new UPIPayment();
        payment.processPayment(500);
    }
}
