import java.io.Console;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    // Global scanner
    public static Scanner scanner = new Scanner(System.in);

    // Text Reset1
    public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Bold
    public static final String BOLD = "\u001B[1m";

    // Underline
    public static final String UNDERLINE = "\u001B[4m";

    // High Intensity (Bright) Colors
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    // Background Colors
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    // Bright Background Colors
    public static final String BG_BRIGHT_BLACK = "\u001B[100m";
    public static final String BG_BRIGHT_RED = "\u001B[101m";
    public static final String BG_BRIGHT_GREEN = "\u001B[102m";
    public static final String BG_BRIGHT_YELLOW = "\u001B[103m";
    public static final String BG_BRIGHT_BLUE = "\u001B[104m";
    public static final String BG_BRIGHT_PURPLE = "\u001B[105m";
    public static final String BG_BRIGHT_CYAN = "\u001B[106m";
    public static final String BG_BRIGHT_WHITE = "\u001B[107m";

    // Example Combined Styles
    public static final String BOLD_RED = "\u001B[1;31m";
    public static final String UNDERLINE_GREEN = "\u001B[4;32m";


    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Safe method to get integer input
    public static int getValidIntegerInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(RED + "Invalid input. Please enter a valid number." + RESET);
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }

    public static void calling() {
        Random random = new Random();
        System.out.println(BG_YELLOW + "--- Admin Menu ---" + RESET);
        System.out.println(BLUE + "1. Check parking");
        System.out.println("2. Check Security Guards");
        System.out.println("3. Check Workers");
        System.out.println("4. Back (Logout)" + RESET);
        String input = scanner.next();
        int x = 0;
        if (isNumeric(input)) {
            x = Integer.parseInt(input);
        } else {
            System.out.println(RED + "Invalid input please enter valid" + RESET);
            calling();
        }
        switch (x) {
            case 1:
                System.out.println(AdminLogin.adminCheckParking());
                calling();
                break;

            case 2:
                int securityGuardID = random.nextInt(5) + 26;
                System.out.println(PURPLE + "Security Guard Present Today: " + RESET + BRIGHT_CYAN + securityGuardID + RESET);
                System.out.println(PURPLE + "Security Guard Total is 30" + RESET);
                calling();
                break;

            case 3:
                int cleanerID = random.nextInt(11) + 19;
                System.out.println(PURPLE + "Cleaner Present Today: " + RESET + BRIGHT_CYAN + cleanerID + RESET);
                System.out.println(PURPLE + "Cleaner Total is 30" + RESET);
                calling();
                break;

            case 4:
                System.out.println(BOLD_RED + "Logging out..." + RESET);
                Main();
                break;
            default:
                System.out.println(BG_YELLOW + "Please select a valid option." + RESET);
                calling();
        }
    }

    public static void Main() {
        Random random = new Random();
        LoginHandler handler;
        System.out.println(BOLD + UNDERLINE + BG_YELLOW + "Choose an option:" + RESET);
        System.out.println(BLUE + "1. Security login");
        System.out.println("2. Admin login");
        System.out.println("3. Shop Owner login");
        System.out.println("4. Customer");
        System.out.println("5. Exit" + RESET);
        String input = scanner.next();
        int choice = 0;
        if (isNumeric(input)) {
            choice = Integer.parseInt(input);
        } else {
            System.out.println(RED + "Invalid input please enter valid" + RESET);
            Main();
        }
        switch (choice) {
            case 1: // Security login
                handler = new SecurityLogin();
                Console console = System.console();
                if (console == null) {
                    System.out.println("Console is not available. (Try running from terminal)");
                    return;
                }
                boolean securityLoginSuccess = false;
                int securityAttempts = 3;
                while (securityAttempts > 0 && !securityLoginSuccess) {
                    System.out.println(PURPLE + "Enter password to login (Attempts left: " + RESET + BRIGHT_CYAN + securityAttempts + RESET + PURPLE + "):" + RESET);
                    char[] passwordChars = console.readPassword();
                    String enteredPassword = new String(passwordChars);

                    if (handler.isLoginSuccessful(enteredPassword)) {
                        System.out.println(GREEN + "Login Successful!" + RESET);
                        SecurityLogin.afterSecurityLogin();//menu after securitylogin
                        securityLoginSuccess = true;
                    } else {
                        System.out.println(RED + "Incorrect password." + RESET);
                        securityAttempts--;
                        if (securityAttempts == 0) {
                            System.out.println(RED + "Too many failed attempts. Access denied." + RESET);
                        }
                    }
                }
                break;

            case 2: // Admin login
                handler = new AdminLogin();
                Console console1 = System.console();
                if (console1 == null) {
                    System.out.println("Console is not available. (Try running from terminal)");
                    return;
                }
                System.out.println(PURPLE + "Enter Admin Password:" + RESET);
                char[] passwordChars1 = console1.readPassword();
                String enteredPassword1 = new String(passwordChars1);

                if (handler.isLoginSuccessful(enteredPassword1)) {
                    System.out.println(GREEN + "Login successful!" + RESET);
                    calling();  // Admin menu with its own loop
                } else {
                    System.out.println(RED + "Incorrect password." + RESET);
                    Main();
                }
                break;

            case 3: // Shop Owner login
                if (SecurityLogin.mopen) {
                    System.out.println(PURPLE + "Choose your Floor : " + RESET);
                    ViewMapOfShop.Map();
                } else {
                    System.out.println(BG_BRIGHT_BLUE + "Mall is closed" + RESET);
                    System.out.println();
                    Main();
                }
                break;

            case 4: // Customer
                if (!SecurityLogin.mopen) {
                    System.out.println(BOLD + BRIGHT_CYAN + "Mall is closed" + RESET);
                    System.out.println();
                    Main();
                }
                break;

            case 5: // Exit
                System.out.println(RED + "Exiting program." + RESET);
                return;  // Exit the program
            default:
                System.out.println(RED + "Please Enter Correct Number" + RESET);
                Main();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        try {
            System.out.println("\n\n\n");
            String welcome = Main.BG_BRIGHT_BLACK+"✨ WELCOME TO KRISHNA MALL ✨"+Main.RESET;


            for (char ch : welcome.toCharArray()) {
                System.out.print(ch);
                Thread.sleep(100);
            }
            Thread.sleep(600);

        } catch (InterruptedException e) {
            System.out.println("Something went wrong while loading...");
        }

        String asciiArt =
                "                                            \n" +
                        BRIGHT_YELLOW + "  * * *                                      \n" +
                        "       *                            \n" +
                        "        *                                    \n" +
                        "          *  * * * *  * * * * * * * * * * * *  *   \n" +
                        "           *                                  *    \n" +
                        "             *           **    **            *    \n" +
                        "              *          **   **            *   \n" +
                        "               *         ** **             *     \n" +
                        "                *        **   **          *      \n" +
                        "                 *       **    **        *       \n" +
                        "                  *             **      *         \n" +
                        "                   * * * * * * * * * * *           \n " +
                        "                    *                                 \n" +
                        "                     * * * * * * * * * * * \n" +
                        "                       * *       * *\n" +
                        "                      *   *     *   *\n" +
                        "                       * *       * *\n" + RESET;
        System.out.println();
        System.out.println(asciiArt);
        try {
            System.out.println(Main.BLUE);
            Thread.sleep(100);

            System.out.println("██╗░░██╗ ██████╗░ ██╗ ░██████╗ ██╗░░██╗ ███╗░░██╗ ░█████╗░  ███╗░░░███╗ ░█████╗░ ██╗░░░░░ ██╗░░░░░");
            Thread.sleep(300);
            System.out.println("██║░██╔╝ ██╔══██╗ ██║ ██╔════╝ ██║░░██║ ████╗░██║ ██╔══██╗  ████╗░████║ ██╔══██╗ ██║░░░░░ ██║░░░░░");
            Thread.sleep(300);
            System.out.println("█████═╝░ ██████╔╝ ██║ ╚█████╗░ ███████║ ██╔██╗██║ ███████║  ██╔████╔██║ ███████║ ██║░░░░░ ██║░░░░░");
            Thread.sleep(300);
            System.out.println("██╔═██╗░ ██╔══██╗ ██║ ░╚═══██╗ ██╔══██║ ██║╚████║ ██╔══██║  ██║╚██╔╝██║ ██╔══██║ ██║░░░░░ ██║░░░░░");
            Thread.sleep(300);
            System.out.println("██║░╚██╗ ██║░░██║ ██║ ██████╔╝ ██║░░██║ ██║░╚███║ ██║░░██║  ██║░╚═╝░██║ ██║░░██║ ███████╗ ███████╗");
            Thread.sleep(300);
            System.out.println("╚═╝░░╚═╝ ╚═╝░░╚═╝ ╚═╝ ╚═════╝░ ╚═╝░░╚═╝ ╚═ ╝░░╚══╝ ╚═╝░░╚═╝  ╚═╝░░░░░╚═╝ ╚═╝░░╚═╝ ╚══════╝ ╚══════╝" + Main.RESET);
            Thread.sleep(400);



            System.out.println("\nLoading Krishna Mall...");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Unexpected error in welcome animation.");
        }

        System.out.println();
        Main();
    }
}