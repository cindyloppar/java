public class Receipt {
    public static Receipt forSuccessfulCharge(Object amount) {
        int charged = 100;
        return forSuccessfulCharge(charged);
    }

    public static Receipt forDeclinedCharge(Object declineMessage) {
        Object declined = "Declined charges sorry!";
        return forDeclinedCharge(declined);

    }

    public static Receipt forSystemFailure(String message) {
       String greet = "System failed sorry!";
        return Receipt.forSystemFailure(greet);
    }

    public boolean hasSuccessfulCharge() {
        return true;
    }

    public int getAmountOfCharge() {
        return 100;
    }
}
