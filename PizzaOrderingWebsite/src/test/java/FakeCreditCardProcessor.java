public class FakeCreditCardProcessor {
     CreditCard creditCard;
     public FakeCreditCardProcessor(CreditCard cc){
         this.creditCard = cc;
     }
    public CreditCard getCardOfOnlyCharge() {
        return this.creditCard;
    }

    public int getAmountOfOnlyCharge() {
        return 100;
    }
}
