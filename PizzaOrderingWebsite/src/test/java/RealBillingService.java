public class RealBillingService {
    public RealBillingService(FakeCreditCardProcessor processor, InMemoryTransactionLog transactionLog) {

    }

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        System.out.println("hello");

        return null;
    }
}
