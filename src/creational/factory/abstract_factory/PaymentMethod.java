package creational.factory.abstract_factory;

public interface PaymentMethod {
    void authorize();
    void startMoneyTransfer();
    void calculatePaymentFees();
}
