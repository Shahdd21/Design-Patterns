package creational.factory.abstract_factory;

public interface PaymentMethodFactory {
    PaymentMethod createPaymentMethod(CardType cardType, String cardNumber, String expiryDate, String cvv, String cardHolder);
}
