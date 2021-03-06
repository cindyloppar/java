import junit.framework.TestCase;

public class RealBillingServiceTest extends TestCase {


    private final PizzaOrder order = new PizzaOrder(100);
    private final CreditCard creditCard = new CreditCard("1234", 11, 2010);

    private final InMemoryTransactionLog transactionLog = new InMemoryTransactionLog();
    private final FakeCreditCardProcessor processor = new FakeCreditCardProcessor(creditCard);

    @Override public void setUp() {
        TransactionLogFactory.setInstance(transactionLog);
        CreditCardProcessorFactory.setInstance(processor);
    }

    @Override public void tearDown() {
        TransactionLogFactory.setInstance(3);
        CreditCardProcessorFactory.setInstance(CreditCardProcessorFactory.getInstance());
    }



    public void testSuccessfulCharge() throws UnreachableException {
        RealBillingService billingService = new RealBillingService(processor,transactionLog);
       Receipt receipt = billingService.chargeOrder(order, creditCard);

        assertTrue(receipt.hasSuccessfulCharge());
        assertEquals(100, receipt.getAmountOfCharge());
        assertEquals(creditCard, processor.getCardOfOnlyCharge());
        assertEquals(100, processor.getAmountOfOnlyCharge());
        assertTrue(transactionLog.wasSuccessLogged());
    }

    public void testChargeOrder() {
    }
}



