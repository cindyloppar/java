public class CreditCardProcessorFactory {
    private static CreditCardProcessor instance;

    public static void setInstance(CreditCardProcessor processor) {
        instance = processor;
    }

    public static CreditCardProcessor getInstance() {
        if (instance == null) {
            return new SquareCreditCardProcessor() {
                @Override
                public ChargeResult charge(CreditCard creditCard, Object amount) {
                    return null;
                }
            };
        }

        return instance;
    }
}
