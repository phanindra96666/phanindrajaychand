import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {
    static Scanner scanner = new Scanner(System.in);

    public static void afterCustomer() {
        System.out.println(Main.BLUE+"1. Banking");
        System.out.println("2. Parking"+Main.RESET);
        int n;
        try{
            n = scanner.nextInt();
        }
        catch(InputMismatchException E){
            System.out.print(Main.BG_YELLOW+"Enter Correct Input"+Main.RESET);
            n = scanner.nextInt();
        }
        if(n==1){
            BankSession.startBankSession();
            afterCustomer();
        }
        else if(n==2) {
            Parking.display();
            ViewMap.Map();
        }
        else{
            System.out.println(Main.RED+"Invalid Range"+Main.RESET);
            afterCustomer();
        }
    }
}
