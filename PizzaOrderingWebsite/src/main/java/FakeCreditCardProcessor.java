public class FakeCreditCardProcessor implements CreditCardProcessor {
    public CreditCard getCardOfOnlyCharge() {
        return getCardOfOnlyCharge();
    }

    public int getAmountOfOnlyCharge() {
        return 100;
    }

    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        return charge(creditCard, amount);
    }
}
