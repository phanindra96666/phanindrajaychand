import java.util.*;

public class Buy {
    static Scanner sc = new Scanner(System.in);
    static double bill = 0;
    static LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

    private static double grandBill = 0; // Add this at the top of your class

    public static int getBill() {
        return (int)grandBill;
    }

    private static void printBill() {
        System.out.println("				------BILL DETAILS------");
        Set s = hm.entrySet();
        for (Object x : s) {
            System.out.println("				" + x);
        }
        System.out.printf("				Bill       			: %.2f\n", bill);
        System.out.println("				----------------------------------------------------");
        System.out.printf("				Grand Total			: %.2f\n", (bill));
        System.out.println("				----------------------------------------------------");
        System.out.println("				------THANK YOU VISIT AGAIN------");

        System.out.println();
    }

    private static void printGrandBill() {
            System.out.println("\n\t------ GRAND BILL SUMMARY ------");
            System.out.printf("\tTotal Bill\t: %.2f\n", grandBill);
            System.out.printf("\tGST (5%%)\t: %.2f\n", grandBill * 0.05);
            System.out.println("\t-------------------------------");
            System.out.printf("\tGrand Total\t: %.2f\n", grandBill +  grandBill*0.05);
            System.out.println("\t-------------------------------\n");
    }


    private static void buyLoopFGs1() {
        while (true) {
            boolean billPaid = false;
            System.out.println();
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.fgs1();

            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();
                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs1();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs1();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter a valid option.");
                    continue;
                }

                if (e == 1) {
                    break; // Go back to Selection.fgs1()
                }
                else if (e == 2) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method
                }
                else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }



    private static void buyLoopFGs2() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.fgs2();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs2();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs2();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }
            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopFGs3() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.fgs3();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs3();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs3();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill;
                    }
                    bill = 0;
                    hm.clear();
                    return;   // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");

                }
            }
        }
    }

    private static void buyLoopFGs4() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.fgs4();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs4();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs4();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println("Enter valid input");
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopFGs5() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.fgs5();  // user buys something

            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs5();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopFGs5();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }
            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;   // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF1s1() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f1s1();  // user buys something

            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s1();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s1();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF1s2() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f1s2();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s2();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s2();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF1s3() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f1s3();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s3();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s3();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;   // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF1s4() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f1s4();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s4();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s4();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF1s5() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f1s5();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s5();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF1s5();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF2s1() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f2s1();  // user buys something

            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s1();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s1();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF2s2() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f2s2();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s2();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s2();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }


            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF2s3() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f2s3();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s3();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s3();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }


            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
    private static void buyLoopF2s4() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f2s4();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s4();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s4();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }


            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;   // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
    private static void buyLoopF2s5() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f2s5();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s5();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF2s5();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }


            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;   // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
    private static void buyLoopF3s1() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f3s1();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF3s1();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF3s1();
                    } else if (n == 2) {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                        break;
                    } else {
                        System.out.println("Enter valid input");
                    }
                }
            }


            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
    private static void buyLoopF3s2() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f3s2();  // user buys something

            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF3s2();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF3s2();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
    private static void buyLoopF3s3() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f3s3();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else {
                try {
                    System.out.println("Amount Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF3s3();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
                catch(InputMismatchException e){
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    int n = sc.nextInt();

                    if (n == 1) {
                        BankSession.startBankSession();
                        buyLoopF3s3();
                    } else if (n == 2) {
                        System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                        break;
                    } else {
                        System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    }
                }
            }

            while (true) {
                System.out.println("1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu");

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println("Invalid input. Please enter valid option.");
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println("Starting a new order...");
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;   // exit buyLoop method, go back to main menu
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void buyLoopF3s4() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f3s4();  // user buys something

            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();

                    billPaid = true;
                }
            }
            else{
                System.out.println(Main.BLUE+"Amount Not Sufficent");
                System.out.println("1. Do you want to add money ?");
                System.out.println("2. Exit"+Main.RESET);
                int n = sc.nextInt();

                if(n==1){
                    System.out.print(Main.PURPLE+"Enter amount :"+Main.RESET);
                    int x = sc.nextInt();
                    User.addMoney(x);
                }
                else if(n==2){
                    System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                    break;//test again
                }
                else{
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    buyLoopFGs1();
                }
            }

            while (true) {
                System.out.println(Main.BLUE+"1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu"+Main.RESET);

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println(Main.RESET+"Invalid input. Please enter valid option."+Main.RESET);
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if (!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println(Main.PURPLE+"Starting a new order..."+Main.RESET);
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;  // exit buyLoop method, go back to main menu
                } else {
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);
                }
            }
        }
    }
    private static void buyLoopF3s5() {
        boolean billPaid = false;
        while (true) {
            System.out.println(Main.BG_YELLOW+"Select any option from top"+Main.RESET);
            Selection.f3s5();  // user buys something
            if (bill > 0) {
                if (BankSession.user.buyItem((int)bill)) {
                    grandBill += bill;
                    printBill();
                   
                    billPaid = true;
                }
            }
            else{
                System.out.println(Main.BLUE+"Amount Not Sufficent");
                System.out.println("1. Do you want to add money ?");
                System.out.println("2. Exit"+Main.RESET);
                int n = sc.nextInt();

                if(n==1){
                    System.out.print(Main.PURPLE+"Enter amount :"+Main.RESET);
                    int x = sc.nextInt();
                    User.addMoney(x);
                }
                else if(n==2){
                    System.out.println(Main.BRIGHT_RED+"Exiting.."+Main.RESET);
                    break;//test again
                }
                else{
                    System.out.println(Main.BG_YELLOW+"Enter valid input"+Main.RESET);
                    buyLoopFGs1();
                }
            }

            while (true) {
                System.out.println(Main.BLUE+"1. Place Another Order (add more items)");
                System.out.println("2. Start New Order (clear previous items)");
                System.out.println("3. Exit to Main Menu"+Main.RESET);

                String orderInput = Main.scanner.next();
                int e;
                if (Main.isNumeric(orderInput)) {
                    e = Integer.parseInt(orderInput);
                } else {
                    System.out.println(Main.RED+"Invalid input. Please enter valid option."+Main.RESET);
                    continue;  // stay in inner loop
                }

                if (e == 1) {
                    // Continue buying (loop buyLoop again)
                    break; // breaks inner loop, goes back to buyLoop start (buy again)
                } else if (e == 2) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before resetting
                    }
                    bill = 0;
                    hm.clear();
                    System.out.println(Main.PURPLE+"Starting a new order..."+Main.RESET);
                    break; // continue the buyLoop
                } else if (e == 3) {
                    if(!billPaid) {
                        grandBill += bill; // accumulate bill before exiting
                    }
                    bill = 0;
                    hm.clear();
                    return;   // exit buyLoop method, go back to main menu
                } else {
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);
                }
            }
        }
    }

    public static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(Main.scanner.next());
            } catch (NumberFormatException e) {
                System.out.println(Main.RED+"Invalid input. Please enter a valid number."+Main.RESET);
            }
        }
    }


    public static void buyGfs1() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);

            switch (c) {
                case 1:
                    // Enter the buy loop, keep buying until user chooses to stop
                    buyLoopFGs1();
                    break;

                case 2:
                    new fG().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;
                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);
            }
        }
    }


    public static void buyGfs2() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopFGs2();
                    break;
                case 2:
                    new fG().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);
            }
        }
    }
    public static void buyGfs3() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);

            switch (c) {
                case 1:
                    buyLoopFGs3();
                    break;

                case 2:
                    new fG().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }


    public static void buyGfs4() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopFGs4();
                    break;

                case 2:
                    new fG().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);
            }
        }
    }
    public static void buyGfs5() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopFGs5();
                    break;

                case 2:
                    new fG().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }
//ground floor end


    public static void buyF1s1() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF1s1();
                    break;

                case 2:
                    new f1().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }
    public static void buyF1s2() {//ERROR
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF1s2();
                    break;

                case 2:
                    new f1().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);
            }
        }
    }

    public static void buyF1s3() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);

            switch (c) {
                case 1:
                    buyLoopF1s3();
                    break;

                case 2:
                    new f1().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }
    public static void buyF1s4() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF1s4();
                    break;

                case 2:
                    new f1().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    return;
                case 5:
                    BankSession.startBankSession();
                    break;


                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }
    public static void buyF1s5() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF1s5();
                    break;

                case 2:
                    new f1().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }
    //first floor ended

    public static void buyF2s1() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF2s1();
                    break;
                case 2:
                    new f2().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }

    public static void buyF2s2() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF2s2();
                    break;

                case 2:
                    new f2().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;

                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }

    public static void buyF2s3() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF2s3();
                    break;
                case 2:
                    new f2().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }

    public static void buyF2s4() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF2s4();
                    break;
                case 2:
                    new f2().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }

    public static void buyF2s5() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                case 1:
                    buyLoopF2s5();
                    break;

                case 2:
                    new f2().display();
                    f = false;
                    break;

                case 3:
                    ViewMap.Map();
                    f = false;
                    break;
                case 4:
                    printGrandBill();
                    Parking.okParking();
                    f = false;
                    break;
                case 5:
                    BankSession.startBankSession();
                    break;

                default:
                    System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

            }
        }
    }

    //floor 2 ended

    public static void buyF3s1() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                    case 1:
                        buyLoopF3s1();
                        break;

                    case 2:
                        new f3().display();
                        f = false;
                        break;

                    case 3:
                        ViewMap.Map();
                        f = false;
                        break;
                    case 4:
                        printGrandBill();
                        Parking.okParking();
                        f = false;
                        break;
                    case 5:
                        BankSession.startBankSession();
                        break;

                    default:
                        System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

                }
            }
    }

    public static void buyF3s2() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                    case 1:
                        buyLoopF3s2();
                        break;
                    case 2:
                        new f3().display();
                        f = false;
                        break;

                    case 3:
                        ViewMap.Map();
                        f = false;
                        break;
                    case 4:
                        printGrandBill();
                        Parking.okParking();
                        f = false;
                        break;
                    case 5:
                        BankSession.startBankSession();
                        break;
                    default:
                        System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

                }
            }
        }

    public static void buyF3s3() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                    case 1:
                        buyLoopF3s3();
                        break;
                    case 2:
                        new f3().display();
                        f = false;
                        break;

                    case 3:
                        ViewMap.Map();
                        f = false;
                        break;
                    case 4:
                        printGrandBill();
                        Parking.okParking();
                        f = false;
                        break;
                    case 5:
                        BankSession.startBankSession();
                        break;
                    default:
                        System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

                }
            }
        }

    public static void buyF3s4() {
        boolean f = true;
        while (f) {
            System.out.println(Main.BLUE+"1. Buy");
            System.out.println("2. Change shop");
            System.out.println("3. Change floor");
            System.out.println("4. Grand Bill");
            System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);


            switch (c) {
                    case 1:
                        buyLoopF3s4();
                        break;

                    case 2:
                        new f3().display();
                        f = false;
                        break;

                    case 3:
                        ViewMap.Map();
                        f = false;
                        break;
                    case 4:
                        printGrandBill();
                        Parking.okParking();
                        f = false;
                        break;
                    case 5:
                        BankSession.startBankSession();
                        break;
                    default:
                        System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

                }
            }
    }

    public static void buyF3s5() {
        boolean f = true;
        while (f) {
                System.out.println(Main.BLUE+"1. Buy");
                System.out.println("2. Change shop");
                System.out.println("3. Change floor");
                System.out.println("4. Grand Bill");
                System.out.println("5. Banking"+Main.RESET);

            int c = getIntInput(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);

            switch (c) {
                    case 1:
                        buyLoopF3s5();
                        break;

                    case 2:
                        new f3().display();
                        f = false;
                        break;

                    case 3:
                        ViewMap.Map();
                        f = false;
                        break;
                    case 4:
                        printGrandBill();
                        Parking.okParking();
                        f = false;
                        break;
                    case 5:
                        BankSession.startBankSession();
                        break;
                    default:
                        System.out.println(Main.RED+"Invalid option. Please try again."+Main.RESET);

                }
            }
    }
}