import java.io.Console;

public class TerminalLogin {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Run this in a terminal.");
            return;
        }

        String username = console.readLine("Enter username: ");
        char[] passwordChars = console.readPassword("Enter password: ");
        String password = new String(passwordChars);

        System.out.println("Login Info Captured.");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password); 
    }
}
