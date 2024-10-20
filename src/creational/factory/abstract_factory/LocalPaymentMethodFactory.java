package creational.factory.abstract_factory;

public class LocalPaymentMethodFactory implements PaymentMethodFactory{

    @Override
    public PaymentMethod createPaymentMethod(CardType cardType, String cardNumber, String expiryDate, String cvv, String cardHolder) {

        if(cardType == CardType.DINERS)
            return new DinersPaymentMethod(cardNumber, expiryDate, cvv, cardHolder);

        if(cardType == CardType.CARTE_BANCAIRE)
            return new CarteBancairePaymentMethod(cardNumber, expiryDate, cvv, cardHolder);

        throw new UnsupportedOperationException("Unsupported Operation");
    }
}
