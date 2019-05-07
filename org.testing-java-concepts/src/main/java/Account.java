public class Account {

    private int accountNumber;
    private String personName;
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getBalance() {
        if (balance <= 0) {
            System.out.println("You have negative funds, please contact your bank service provider.");
            return -1;
        } else {
            System.out.println(balance);
            return balance;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
