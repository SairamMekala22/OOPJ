import java.util.ArrayList;

public class Customer {
    String name;
    long phoneNumber;
    int numOfCurrentAccounts = 0;
    int numOfSavingsAccounts = 0;
    ArrayList<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();
    ArrayList<CurrentAccount> currentAccounts = new ArrayList<CurrentAccount>();
    ArrayList<Account> accounts = new ArrayList<Account>();
    Customer(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    SavingsAccount createSavingsAccount(double minBalance) {
        SavingsAccount sa = new SavingsAccount();
        accounts.add(sa);
        savingsAccounts.add(sa);
        sa.deposit(minBalance);
        numOfSavingsAccounts++;
        return sa;
    }

    CurrentAccount createCurrentAccount(double minBalance) {
        CurrentAccount ca = new CurrentAccount();
        accounts.add(ca);
        currentAccounts.add(ca);
        ca.deposit(minBalance);
        numOfCurrentAccounts++;
        return ca;
    }
}
