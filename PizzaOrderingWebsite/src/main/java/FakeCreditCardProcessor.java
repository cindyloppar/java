public class FakeCreditCardProcessor extends CreditCardProcessor {
    public CreditCard getCardOfOnlyCharge() {
        return null;
    }

    public int getAmountOfOnlyCharge() {
        return 100;
    }
}
