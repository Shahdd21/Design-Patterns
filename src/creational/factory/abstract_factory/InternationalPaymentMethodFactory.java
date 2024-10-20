package creational.factory.abstract_factory;

public class InternationalPaymentMethodFactory implements PaymentMethodFactory{
    @Override
    public PaymentMethod createPaymentMethod(CardType cardType, String cardNumber, String expiryDate, String cvv, String cardHolder) {
        if(cardType == CardType.MASTER_CARD)
            return new MasterCardPaymentMethod(cardNumber, expiryDate, cvv, cardHolder);

        if(cardType == CardType.AMERICAN_EXPRESS)
            return new AmericanExpressPaymentMethod(cardNumber, expiryDate, cvv, cardHolder);

        if(cardType == CardType.VISA)
            return new VisaPaymentMethod(cardNumber, expiryDate, cvv, cardHolder);

        throw new UnsupportedOperationException("Unsupported Operation");
    }
}
