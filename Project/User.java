public class User {
    String username;
    String password;
    static int balance;

    public User(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public int getBalance() {
        return balance;
    }

    public static void addMoney(int amount) {
        balance += amount;
    }

    public boolean buyItem(int cost) {
        if (balance >= cost) {
            balance -= cost;
            return true;
        }
        return false;
    }
}
