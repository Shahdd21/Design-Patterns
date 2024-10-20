package creational.factory.abstract_factory;

public class DinersPaymentMethod extends LocalPaymentMethod{
    public DinersPaymentMethod(String cardNumber, String expiryDate, String cvv, String cardHolder) {
        super(cardNumber, expiryDate, cvv, cardHolder);
    }

    @Override
    public void authorize() {
        System.out.println("Authorizing Diners Card....");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("Transferring money to Diners Card....");
    }

    @Override
    public void calculatePaymentFees() {
        System.out.println("Calculating payment fees for Diners Card....");
    }
}
