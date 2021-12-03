package domain;

public class Account {

    private final Balance balance;

    public Account(Balance balance) {
        this.balance = balance;
    }

    public Balance currentBalance() {
        return balance;
    }
}
