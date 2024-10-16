public class SavingsAccount extends Account {

    String username;
    String password;
    SavingsAccount() {
        super();
    }

    void createNetBanking(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
