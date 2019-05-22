public class PaypalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        System.out.println("ChargeResult");
        return null;
    }
}
