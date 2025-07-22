import java.io.Console;
import java.util.Scanner;
public class BankSession {
    static User user = BankSystem.login("phani", "1234");

    public static void startBankSession() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Main.BG_YELLOW+"--- Welcome to Simple Bank ---"+Main.RESET);

        while (true) {
            System.out.println(Main.BLUE+"1. Login");
            System.out.println("2. Exit"+Main.RESET);
            System.out.print(Main.BG_YELLOW+"Choose option: "+Main.RESET);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    user = login(scanner);
                    if (user != null) {
                        startUserSession(scanner);
                    }
                    break;

                case "2":
                    System.out.println(Main.CYAN+"Thank you for using the bank."+Main.RESET);
                    return;

                default:
                    System.out.println(Main.RED+"Invalid option."+Main.RESET);
            }
        }
    }

    private static User login(Scanner scanner) {
        int attempts = 3;

        while (attempts > 0) {
            System.out.println(Main.PURPLE+"Enter you name");
            String name = scanner.nextLine();
            System.out.println("Enter username: ");
            Console console = System.console();
            char[] passwordChars = console.readPassword();
            String username = new String(passwordChars);

            System.out.print("Enter password: "+Main.RESET);
            Console console1 = System.console();
            char[] passwordChar = console1.readPassword();
            String password = new String(passwordChar);

            User user = BankSystem.login(username, password);

            if (user != null) {
                System.out.println(Main.GREEN+"Login successful! Welcome, " + name+Main.RESET);
                return user;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println(Main.RED+"Invalid username or password. Attempts left: "+Main.CYAN + attempts+Main.RESET + "\n"+Main.RESET);
                } else {
                    System.out.println(Main.RED+"Maximum login attempts exceeded."+Main.RESET);
                }
            }
        }
        return null;
    }

    private static void register(Scanner scanner) {
        System.out.print(Main.PURPLE+"Enter new username: ");
        String username = scanner.nextLine();

        System.out.print("Enter new password: ");
        String password = scanner.nextLine();

        System.out.print("Enter initial balance: "+Main.RESET);
        String balanceInput = scanner.nextLine();

        if (!Main.isNumeric(balanceInput)) {
            System.out.println(Main.RED+"Invalid balance amount."+Main.RESET);
            return;
        }

        int balance = Integer.parseInt(balanceInput);
        if (balance < 0) {
            System.out.println(Main.RED+"Balance cannot be negative."+Main.RESET);
            return;
        }

        boolean success = BankSystem.registerUser(username, password, balance);
        if (success) {
            System.out.println(Main.GREEN+"Registration successful! You can now log in."+Main.RESET);
        } else {
            System.out.println("Username already exists.");
        }
    }

    private static void startUserSession(Scanner scanner) {
        while (true) {
            System.out.println(Main.BG_YELLOW+"--- Bank Menu ---"+Main.RESET);
            System.out.println(Main.BLUE+"1. View Balance");
            System.out.println("2. Add Money");
            System.out.println("3. Logout"+Main.RESET);
            System.out.print(Main.BG_YELLOW+"Choose option: "+Main.RESET);

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println(Main.PURPLE+"Current Balance: ₹" + user.getBalance()+Main.RESET);
                    break;

                case "2":
                    System.out.print("Enter amount to add: ");
                    String addInput = scanner.nextLine();
                    if (Main.isNumeric(addInput)) {
                        int amount = Integer.parseInt(addInput);
                        if (amount > 0) {
                            user.addMoney(amount);
                            System.out.println(Main.PURPLE+"₹" + amount + " added to your balance."+Main.RESET);
                        } else {
                            System.out.println(Main.PURPLE+"Amount must be positive."+Main.RESET);
                        }
                    } else {
                        System.out.println(Main.RED+"Invalid input."+Main.RESET);
                    }
                    break;

                case "3":
                    System.out.println(Main.BRIGHT_RED+"Logged out."+Main.RESET);
                    return;

                default:
                    System.out.println(Main.RED+"Invalid option."+Main.RESET);
            }
        }
    }
}
