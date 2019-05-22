public class ChargeResult {
    public boolean wasSuccessful() {
        return true;
    }

    public Object getDeclineMessage() {
        System.out.println("Sorry no funds");
        return null;
    }
}
