import java.util.HashMap;

public class BankSystem {
    public static HashMap<String, User> users = new HashMap<>();

    static {
        users.put("Phani", new User("phani", "1234", 10000));
    }

    public static User login(String username, String password) {
        for (User user : users.values()) {
            if (user.getUsername().equalsIgnoreCase(username) && user.checkPassword(password)) {
                return user;
            }
        }
        return null;
    }

    public static boolean registerUser(String username, String password, int balance) {
        if (users.containsKey(username)) {
            return false;
        }
        users.put(username, new User(username, password, balance));
        return true;
    }
}
