// import java.lang.reflect.Array;
// import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Customer jaffa = new Customer("Jaffa", 87376463);
        jaffa.createCurrentAccount(1000);
        jaffa.createSavingsAccount(1000);
        jaffa.createSavingsAccount(1000);
        jaffa.createSavingsAccount(1000);
        jaffa.createSavingsAccount(1000);
        jaffa.createSavingsAccount(1000);
        jaffa.createCurrentAccount(1000);
        jaffa.createCurrentAccount(1000);
        System.out.println("Number of savings accounts: " + jaffa.numOfSavingsAccounts);
        System.out.println("Number of current account: " + jaffa.numOfCurrentAccounts);
        System.out.println(jaffa.savingsAccounts.get(2).accountNumber);
        jaffa.savingsAccounts.get(1).withdraw(100);
        
    }
}
