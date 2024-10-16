public abstract class Account {
    double balance;
    static long startingAccountNumber = 724184500;
    long accountNumber;
    Account() {
        accountNumber = startingAccountNumber + 1;
        startingAccountNumber++;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawed $" + amount);
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("You deposited $" + amount);
        System.out.println("Current balance: $" + balance);
    }
}