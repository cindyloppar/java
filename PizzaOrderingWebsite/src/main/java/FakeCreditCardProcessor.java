public abstract class FakeCreditCardProcessor implements CreditCardProcessor {
    public CreditCard getCardOfOnlyCharge() {
        return null;
    }

    public int getAmountOfOnlyCharge() {
        return 100;
    }
}
