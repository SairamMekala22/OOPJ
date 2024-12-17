public class CurrentAccount extends Account {
    double withdraftLimit = 700;
    CurrentAccount() {
        super();
    }

    void withdraw(double amount) {
        if (amount <= this.balance) {
            balance -= amount;
            System.out.println("You have withdrawed $" + amount);
            System.out.println("Current balance: $" + this.balance);
        } else if (amount <= balance + withdraftLimit) {
            withdraftLimit = withdraftLimit + (this.balance - amount);
            System.out.println("Withdrawn $" + (-(this.balance - amount)) + " from withdraw limit.");
            System.out.println("Updated withdraw limit: $" + withdraftLimit);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
