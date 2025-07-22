import java.io.Console;
import java.util.Scanner;
import java.util.Random;
public class SecurityLogin extends LoginHandler {
    static boolean mopen = false;

    public SecurityLogin() {
        super("security123"); // Set a specific password for security
    }

    @Override
    public boolean isLoginSuccessful(String pass) {
        if (password.equals(pass)) {
            mopen = true;
            return true;
        } else {
            return false;
        }
    }
    public static void ad(){
        Random random = new Random();
        System.out.println(Main.BLUE+"1.Check parking");
        System.out.println("2.Check SecurityGuards");
        System.out.println("3.Check Workers");
        System.out.println("4.Login as Customer");
        System.out.println("5. Back"+Main.RESET);
        System.out.println(Main.BG_YELLOW+Main.UNDERLINE+"Please select one"+Main.RESET);
        String input = Main.scanner.next();
        int y = 0;
        if(Main.isNumeric(input)){
            y = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid number"+Main.RESET);
            ad();
        }
        switch (y) {
            case 1:
                System.out.println(AdminLogin.adminCheckParking());
                ad();
                break;
            case 2:
                int securityGuardID = random.nextInt(5) + 23; // 26 to 30
                System.out.println(Main.PURPLE+"Security Guard Present Today: "+Main.RESET+Main.CYAN + securityGuardID+Main.RESET);
                System.out.println(Main.PURPLE+"Security Guard Total is 30"+Main.RESET);
                ad();
                break;
            case 3:
                int cleanerID = random.nextInt(11) + 27; // 40 to 50
                System.out.println(Main.PURPLE+"Cleaner Present Today: "+Main.RESET+Main.CYAN + cleanerID+Main.RESET);
                System.out.println(Main.PURPLE+"Cleaner Total is 30"+Main.RESET);
                ad();
                break;
            case 4:
                Customer.afterCustomer();
                break;
            case 5:
                afterSecurityLogin();
                break;
            default:
                System.out.println(Main.BG_YELLOW+"Please select valid one"+Main.RESET);
        }
    }
    public static void afterAllShops(){
        AdminLogin handlerr = new AdminLogin();
        System.out.println("Enter password to login:");
        Console console2 = System.console();
        if (console2 == null) {
            System.out.println("Console is not available. (Try running from terminal)");
            return;
        }
        //System.out.println("Enter password to login");
        char[] passwordChars = console2.readPassword();
        String enteredPassword = new String(passwordChars);

        if (handlerr.isLoginSuccessful(enteredPassword)) {
            ad();
        } else {
            System.out.println(Main.RED+"Incorrect password."+Main.RESET);
            afterAllShops();
        }
    }

    public static void afterSecurityLogin() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(Main.BLUE+"1. Admin login");
        System.out.println("2. Shop Owner login");
        System.out.println("3. Open All Shops");
        System.out.println("4. Costumer");
        System.out.println("5. Exit"+Main.RESET);
        String input = scanner.next();
        int opt = 0;
        if(Main.isNumeric(input)){
            opt = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            afterSecurityLogin();
        }
        switch (opt) {
            case 1://admin
                AdminLogin handler = new AdminLogin();
                System.out.println(Main.PURPLE+"Enter Admin Password: "+Main.RESET);
                Console console1 = System.console();
                if (console1 == null) {
                    System.out.println("Console is not available. (Try running from terminal)");
                    return;
                }
                char[] passwordChars1 = console1.readPassword();
                String enteredPassword1 = new String(passwordChars1);

                if (handler.isLoginSuccessful(enteredPassword1)) {
                    System.out.println(Main.GREEN+"Login successful!"+Main.RESET);
                    ad();
                } else {
                    System.out.println(Main.RED+"Incorrect password."+Main.RESET);
                    afterSecurityLogin();
                }
                break;
            case 2:
                System.out.println(Main.CYAN+"Shop owner"+Main.RESET);
                if (SecurityLogin.mopen) {
                    ViewMapOfShop.Map();
                } else {
                    System.out.print(Main.BG_BRIGHT_BLUE+"Mall is closed"+Main.RESET);
                }
                break;
            case 3:
                if (SecurityLogin.mopen){
                    ViewMapOfShop.openAllShops();
                    System.out.println(Main.BLUE+"1. Login to Customer");
                    System.out.println("2. Login to Admin"+Main.RESET);
                    int x = scanner.nextInt();
                    switch (x){
                        case 1 : Customer.afterCustomer();
                        break;
                        case 2 :
                            afterAllShops();
                            break;
                        default:
                            System.out.println(Main.RED+"Invalid input"+Main.RESET);
                    }
                }//break;
                break;
            case 4:
                if (SecurityLogin.mopen) {
                    Customer.afterCustomer();
                }
                else {
                    System.out.print(Main.BG_BRIGHT_BLUE+"Mall is closed"+Main.RESET);
                }
                break;
            case 5:
                System.out.println(Main.RED+"Exiting"+Main.RESET);
                break;
            default:
                System.out.println(Main.BG_YELLOW+"Select valid option"+Main.RESET);
                afterSecurityLogin();
        }
    }
}