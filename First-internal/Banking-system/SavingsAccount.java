import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class SavingsAccount extends Account {
    LocalDate date;
    LocalDate currentDate;
    String username;
    String password;
    SavingsAccount() {
        super();
        date = LocalDate.now();
    }

    void createNetBanking(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void checkBalance() {
        currentDate = LocalDate.now();
        int months = (int)(ChronoUnit.DAYS.between(currentDate, date) / 30);
        double interest = balance * 0.12 * months;
        balance += interest;
        super.checkBalance();
    }


}
