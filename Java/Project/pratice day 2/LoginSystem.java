import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
    // A map to store username and password pairs. In a real application, use a secure database.
    private static HashMap<String, String> userCredentials = new HashMap<>();
    private static String loggedInUser = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pre-populate with some users (for demonstration purposes)
        userCredentials.put("user1", "password123");
        userCredentials.put("user2", "mypassword");

        boolean running = true;
        while (running) {
            if (loggedInUser == null) {
                System.out.println("\nMenu:");
                System.out.println("1. Create User");
                System.out.println("2. Delete User");
                System.out.println("3. Login");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");
                int option = in.nextInt();
                in.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        createUser(in);
                        break;
                    case 2:
                        deleteUser(in);
                        break;
                    case 3:
                        loginUser(in);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } else {
                System.out.println("\nLogged in as: " + loggedInUser);
                System.out.println("1. Log Out");
                System.out.println("2. Exit");
                System.out.print("Select an option: ");
                int option = in.nextInt();
                in.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        loggedInUser = null; // Log out
                        System.out.println("Logged out successfully.");
                        break;
                    case 2:
                        System.out.println("Exiting...");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }

        in.close();
    }

    // Method to create a new user
    public static void createUser(Scanner in) {
        System.out.print("Enter new username: ");
        String username = in.nextLine();

        if (userCredentials.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different username.");
            return;
        }

        System.out.print("Enter new password: ");
        String password = in.nextLine();

        // Check password strength
        String strengthMessage = Password_Checker.checkPasswordStrength(password);
        if (strengthMessage.equals("Your password is strong.")) {
            userCredentials.put(username, password);
            System.out.println("User created successfully.");
        } else {
            System.out.println(strengthMessage);
        }
    }

    // Method to delete an existing user
    public static void deleteUser(Scanner in) {
        System.out.print("Enter username to delete: ");
        String username = in.nextLine();

        if (userCredentials.containsKey(username)) {
            userCredentials.remove(username);
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("Username not found.");
        }
    }

    // Method to handle user login
    public static void loginUser(Scanner in) {
        System.out.print("Enter username: ");
        String username = in.nextLine();

        System.out.print("Enter password: ");
        String password = in.nextLine();

        boolean isLoggedIn = authenticateUser(username, password);

        if (isLoggedIn) {
            loggedInUser = username;
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    // Method to authenticate the user
    public static boolean authenticateUser(String username, String password) {
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }
}
