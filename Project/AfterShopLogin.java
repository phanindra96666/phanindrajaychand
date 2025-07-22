import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class AfterShopLogin {
    public static void afterShopLogin() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(Main.BLUE+"1. Admin login");
        System.out.println("2. Costumer");
        System.out.println("3. ShopOwner Login");
        System.out.println("4. Open All Shops");
        System.out.println("5. Exit"+Main.RESET);
        System.out.println(Main.BG_YELLOW+"Select the option"+Main.RESET);
        String input = scanner.next();
        int opt = 0;
        if(Main.isNumeric(input)){
            opt = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            afterShopLogin();
        }
        switch (opt) {
            case 1:
                AdminLogin handler = new AdminLogin();
                System.out.println(Main.BG_YELLOW+"Enter password to login:"+Main.RESET);
                Console console1 = System.console();
                if (console1 == null) {
                    System.out.println("Console is not available. (Try running from terminal)");
                    return;
                }
                char[] passwordChars1 = console1.readPassword();
                String enteredPassword1 = new String(passwordChars1);

                if (handler.isLoginSuccessful(enteredPassword1)) {
                    Main.calling();
                }
                else {
                    System.out.println(Main.RED+"Incorrect password"+Main.RESET);
                    afterShopLogin();
                }
                break;
            case 2:
                System.out.println("Customer");
                if (SecurityLogin.mopen) {
                    Customer.afterCustomer();

                } else {
                    System.out.print(Main.BG_BRIGHT_BLUE+"Mall is closed"+Main.RESET);
                }
                break;
            case 3:
                ViewMapOfShop.Map();
                break;
            case 4:
                ViewMapOfShop.openAllShops();
                AfterShopLogin.afterShopLogin();
                //print
                break;
            case 5 :
                return;
            default:
                System.out.println(Main.BG_YELLOW+"Enter invalid"+Main.RESET);
                afterShopLogin();
        }
    }
}
