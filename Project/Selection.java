import java.util.InputMismatchException;
import java.util.Scanner;

public class Selection extends Buy{
    static Scanner sc = new Scanner(System.in);

    public static void method(){
        BankSession.startBankSession();
    }

    private static int getQuantity() {
        int c1 = -1;
        while (true) {
            try {
                c1 = sc.nextInt();

                // Check if the quantity is less than 1
                if (c1 < 1) {
                    throw new IllegalArgumentException(Main.RED+"Quantity must be greater than 0."+Main.RESET);
                }
                break; // If the input is valid, exit the loop
            } catch (InputMismatchException e) {
                System.out.println(Main.RED+"			Invalid quantity. Please enter a number."+Main.RESET);
                sc.nextLine(); // Clear invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return c1;
    }


    public static void fgs1() {
        int n1;
        try {
            System.out.println();
            System.out.print("			Select Game (1-5): ");
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            fgs1(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*3999;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Call of Duty - Modern Warfare II  "+c1+" * 3999", c1 * 3999);
                    bill = bill + c1 * 3999;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money...?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*4499;
                if(BankSession.user.getBalance() > totalCost){
                    hm.put("FIFA 24                            "+c1+" * 4499", c1 * 4499);
                    bill = bill + c1 * 4499;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*2999;
                if(BankSession.user.getBalance() > totalCost){
                    hm.put("Grand Theft Auto V                 "+c1+" * 2999", c1 * 2999);
                    bill = bill + c1 * 2999;
                    break;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*2499;
                if(BankSession.user.getBalance() > totalCost){
                    hm.put("The Witcher 3: Wild Hunt           "+c1+" * 2499", c1 * 2499);
                    bill = bill + c1 * 2499;
                    break;
                }
                else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1999;
                if(BankSession.user.getBalance() > totalCost){
                    hm.put("Minecraft                          "+c1+" * 1999", c1 * 1999);
                    bill = bill + c1 * 1999;
                    break;
                }
                else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                fgs1();
            }
        }
    }

    public static void fgs2() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"			Select Game (1-5): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            fgs2(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*3499;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Red Dead Redemption 2         " + c1 + " * 3499", c1 * 3499);
                    bill = bill + c1 * 3499;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs2();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*3999;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Assassin's Creed Valhalla     " + c1 + " * 3999", c1 * 3999);
                    bill = bill + c1 * 3999;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs2();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1999;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Fortnite                      " + c1 + " * 1999", 1999);
                    bill = bill + c1 * 1999;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs2();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*4999;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("God of War: Ragnarok          " + c1 + " * 4999", c1 * 4999);
                    bill = bill + c1 * 4999;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs2();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*3799;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Cyberpunk 2077                " + c1 + " * 3799", c1 * 3799);
                    bill = bill + c1 * 3799;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs2();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                fgs2();
            }
        }
    }

    public static void fgs3() {
        int n1;

        try {
            System.out.print(Main.BG_YELLOW+"			Select items (1-10): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            fgs3(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*299;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Perfect Radiance Day Cream    " + c1 + " * 299", c1 * 299);
                    bill = bill + c1 * 299;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*499;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("9 to 5 Lip Color              " + c1 + " * 499", c1 * 499);
                    bill = bill + c1 * 499;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*210;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Eyeconic Kajal                " + c1 + " * 210", c1 * 210);
                    bill = bill + c1 * 210;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*700;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Makeup Primer                 " + c1 + " * 700", c1 * 700);
                    bill = bill + c1 * 700;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*199;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Radiance Compact              " + c1 + " * 199", c1 * 199);
                    bill = bill + c1 * 199;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*130;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Insta Eye Liner               " + c1 + " * 130", c1 * 130);
                    bill = bill + c1 * 130;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*399;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Skin Gloss Gel Crème          " + c1 + " * 399", c1 * 399);
                    bill = bill + c1 * 399;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*350;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Sun Expert SPF 50 Lotion      " + c1 + " * 350", c1 * 350);
                    bill = bill + c1 * 350;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = sc.nextInt();
                int totalCost = c1*750;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Argan Oil Serum Foundation    " + c1 + " * 750", c1 * 750);
                    bill = bill + c1 * 750;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*600;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Mousse Foundation             " + c1 + " * 600", c1 * 600);
                    bill = bill + c1 * 600;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs3();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                fgs3();
            }
        }
    }


    public static void fgs4() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"			Select items (1-10): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            fgs4(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*250;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Spot-less Fairness Cream        " + c1 + " * 250", c1 * 250);
                    bill = bill + c1 * 250;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*275;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Super Light Gel Moisturizer     " + c1 + " * 275", c1 * 275);
                    bill = bill + c1 * 275;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*180;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Bright Beauty Face Wash         " + c1 + " * 180", c1 * 180);
                    bill = bill + c1 * 180;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*599;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Age Miracle Night Cream         " + c1 + " * 599", c1 * 599);
                    bill = bill + c1 * 599;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*200;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Anti-Pollution Face Wash        " + c1 + " * 200", c1 * 200);
                    bill = bill + c1 * 200;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*225;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Micellar Water D-Toxx           " + c1 + " * 225", c1 * 225);
                    bill = bill + c1 * 225;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*150;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Moisturizing Cold Cream         " + c1 + " * 150", c1 * 150);
                    bill = bill + c1 * 150;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*180;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Men Oil Control Face Wash       " + c1 + " * 180", c1 * 180);
                    bill = bill + c1 * 180;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*299;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("BB+ Cream                       " + c1 + " * 299", c1 * 299);
                    bill = bill + c1 * 299;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*350;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Sunscreen SPF 50                " + c1 + " * 350", c1 * 350);
                    bill = bill + c1 * 350;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs4();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                fgs4();
            }
        }
    }


    public static void fgs5() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"			Select items (1-5): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            fgs5(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*299;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Lakme Radiance Cream           " + c1 + " * 299", c1 * 299);
                    bill = bill + c1 * 299;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs5();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*250;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Pond's Fairness Cream          " + c1 + " * 250", c1 * 250);
                    bill = bill + c1 * 250;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs5();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();

                int totalCost = c1*699;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("L'Oréal Crystal Gel Cream      " + c1 + " * 699", c1 * 699);
                    bill = bill + c1 * 699;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs5();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*549;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Neutrogena Water Gel           " + c1 + " * 549", c1 * 549);
                    bill = bill + c1 * 549;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs5();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*249;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Nivea Moisturizer              " + c1 + " * 249", c1 * 249);
                    bill = bill + c1 * 249;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        fgs5();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                fgs5(); // Ensure fgs5() points back to this menu
            }
        }
    }
    public static void f1s1() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"			Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f1s1(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*899;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Slim Fit Formal Shirt           " + c1 + " * 899", c1 * 899);
                    bill = bill + c1 * 899;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*699;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Casual Polo T-Shirt             " + c1 + " * 699", c1 * 699);
                    bill = bill + c1 * 699;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1199;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Denim Jeans                     " + c1 + " * 1199", c1 * 1199);
                    bill = bill + c1 * 1199;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*999;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Cotton Chinos                   " + c1 + " * 999", c1 * 999);
                    bill = bill + c1 * 999;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*3499;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Leather Jacket                  " + c1 + " * 3499", c1 * 3499);
                    bill = bill + c1 * 3499;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1299;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Floral Print Summer Dress       " + c1 + " * 1299", c1 * 1299);
                    bill = bill + c1 * 1299;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1199;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("High Waist Skinny Jeans         " + c1 + " * 1199", c1 * 1199);
                    bill = bill + c1 * 1199;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*2999;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Silk Saree                      " + c1 + " * 2999", c1 * 2999);
                    bill = bill + c1 * 2999;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = sc.nextInt();
                int totalCost = c1*599;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Crop Top                        " + c1 + " * 599", c1 * 599);
                    bill = bill + c1 * 599;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*2499;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Long Overcoat                   " + c1 + " * 2499", c1 * 2499);
                    bill = bill + c1 * 2499;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 11: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*399;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Cartoon Print T-Shirt           " + c1 + " * 399", c1 * 399);
                    bill = bill + c1 * 399;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 12: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*499;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Denim Shorts                    " + c1 + " * 499", c1 * 499);
                    bill = bill + c1 * 499;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 13: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*799;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Frock for Girls                 " + c1 + " * 799", c1 * 799);
                    bill = bill + c1 * 799;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 14: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*899;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Hooded Sweatshirt               " + c1 + " * 899", c1 * 899);
                    bill = bill + c1 * 899;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            case 15: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1199;
                if (BankSession.user.getBalance() > totalCost){
                    hm.put("Party Wear Suit                 " + c1 + " * 1199", c1 * 1199);
                    bill = bill + c1 * 1199;
                }
                else{
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money ?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if(m==1){
                        method();
                        f1s1();
                    }
                    else if(m==2){
                        break;//check it
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                f1s1(); // Redirects back to clothing menu
            }
        }
    }
    public static void f1s2() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f1s2();
            return;
        }

        switch(n1){
            case 1: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*499;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Casual T-Shirts                " + c1 + " * 499", c1 * 499);
                    bill += c1 * 499;
                } else {
                    System.out.println(Main.BLUE +"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 2: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*999;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Slim Fit Jeans                 " + c1 + " * 999", c1 * 999);
                    bill += c1 * 999;
                } else {
                    System.out.println(Main.PURPLE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 3: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1099;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Hooded Sweatshirt              " + c1 + " * 1099", c1 * 1099);
                    bill += c1 * 1099;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 4: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*899;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Formal Shirts                  " + c1 + " * 899", c1 * 899);
                    bill += c1 * 899;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 5: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*849;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Joggers                        " + c1 + " * 849", c1 * 849);
                    bill += c1 * 849;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 6: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*699;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Floral Print Tops              " + c1 + " * 699", c1 * 699);
                    bill += c1 * 699;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 7: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1199;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Denim Jackets                  " + c1 + " * 1199", c1 * 1199);
                    bill += c1 * 1199;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 8: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1299;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Anarkali Kurtis                " + c1 + " * 1299", c1 * 1299);
                    bill += c1 * 1299;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 9: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1099;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("High Waist Jeans               " + c1 + " * 1099", c1 * 1099);
                    bill += c1 * 1099;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 10: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1499;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Maxi Dresses                   " + c1 + " * 1499", c1 * 1499);
                    bill += c1 * 1499;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 11: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*399;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Cartoon Print T-Shirt          " + c1 + " * 399", c1 * 399);
                    bill += c1 * 399;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 12: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*499;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Denim Shorts                   " + c1 + " * 499", c1 * 499);
                    bill += c1 * 499;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 13: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*799;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Frock for Girls                " + c1 + " * 799", c1 * 799);
                    bill += c1 * 799;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 14: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*899;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Printed Hoodies                " + c1 + " * 899", c1 * 899);
                    bill += c1 * 899;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            case 15: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1099;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Party Wear Outfits             " + c1 + " * 1099", c1 * 1099);
                    bill += c1 * 1099;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s2();
                    }
                }
                break;
            }

            default: {
                System.out.println(Main.RED+"Invalid Selection, Please Select Again"+Main.RESET);
                f1s2();
            }
        }
    }



    public static void f1s3() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine();
            f1s3();
            return;
        }

        switch (n1) {
            case 1: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*699;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Casual T-Shirts " + c1 + " * 699", c1 * 699);
                    bill += c1 * 699;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 2: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1499;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Slim Fit Jeans " + c1 + " * 1499", c1 * 1499);
                    bill += c1 * 1499;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 3: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1799;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Hooded Sweatshirt " + c1 + " * 1799", c1 * 1799);
                    bill += c1 * 1799;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 4: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1299;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Formal Shirts " + c1 + " * 1299", c1 * 1299);
                    bill += c1 * 1299;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 5: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1599;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Cargo Pants " + c1 + " * 1599", c1 * 1599);
                    bill += c1 * 1599;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 6: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*899;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Floral Print Tops " + c1 + " * 899", c1 * 899);
                    bill += c1 * 899;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 7: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1799;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Denim Jackets " + c1 + " * 1799", c1 * 1799);
                    bill += c1 * 1799;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 8: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*999;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Wrap Skirts " + c1 + " * 999", c1 * 999);
                    bill += c1 * 999;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 9: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1399;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("High Waist Jeans " + c1 + " * 1399", c1 * 1399);
                    bill += c1 * 1399;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 10: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1699;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Maxi Dresses " + c1 + " * 1699", c1 * 1699);
                    bill += c1 * 1699;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 11: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*399;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Cartoon Print T-Shirt " + c1 + " * 399", c1 * 399);
                    bill += c1 * 399;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 12: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*599;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Denim Shorts " + c1 + " * 599", c1 * 599);
                    bill += c1 * 599;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 13: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*899;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Frock for Girls " + c1 + " * 899", c1 * 899);
                    bill += c1 * 899;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 14: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1099;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Printed Hoodies " + c1 + " * 1099", c1 * 1099);
                    bill += c1 * 1099;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            case 15: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1499;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Party Wear Outfits " + c1 + " * 1499", c1 * 1499);
                    bill += c1 * 1499;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s3();
                    }
                }
                break;
            }

            default: {
                System.out.println(Main.RED+"Invalid Selection, Please Select Again"+Main.RESET);
                f1s3();
            }
        }
    }


    public static void f1s4() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f1s4(); // Recursively call the method again
            return;
        }

        switch (n1) {
            case 1: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*549;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Casual T-Shirts " + c1 + " * 549", c1 * 549);
                    bill += c1 * 549;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1099;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Slim Fit Jeans " + c1 + " * 1099", c1 * 1099);
                    bill += c1 * 1099;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1299;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Hooded Sweatshirt " + c1 + " * 1299", c1 * 1299);
                    bill += c1 * 1299;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*949;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Formal Shirts " + c1 + " * 949", c1 * 949);
                    bill += c1 * 949;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1299;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Cargo Pants " + c1 + " * 1299", c1 * 1299);
                    bill += c1 * 1299;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*649;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Floral Print Tops " + c1 + " * 649", c1 * 649);
                    bill += c1 * 649;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1999;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Denim Jackets " + c1 + " * 1999", c1 * 1999);
                    bill += c1 * 1999;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*899;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Wrap Skirts " + c1 + " * 899", c1 * 899);
                    bill += c1 * 899;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1099;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("High Waist Jeans " + c1 + " * 1099", c1 * 1099);
                    bill += c1 * 1099;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*1299;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Maxi Dresses " + c1 + " * 1299", c1 * 1299);
                    bill += c1 * 1299;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 11: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*399;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Cartoon Print T-Shirt " + c1 + " * 399", c1 * 399);
                    bill += c1 * 399;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 12: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*499;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Denim Shorts " + c1 + " * 499", c1 * 499);
                    bill += c1 * 499;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 13: {
                System.out.print("SELECT QUANTITY: ");
                int c1 = getQuantity();
                int totalCost = c1*799;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Frock for Girls " + c1 + " * 799", c1 * 799);
                    bill += c1 * 799;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 14: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int totalCost = c1*899;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Printed Hoodies " + c1 + " * 899", c1 * 899);
                    bill += c1 * 899;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }
            case 15: {
                System.out.print("SELECT QUANTITY: ");
                int c1 = getQuantity();
                int totalCost = c1*1099;
                if (BankSession.user.getBalance() > totalCost) {
                    hm.put("Party Wear Outfits " + c1 + " * 1099", c1 * 1099);
                    bill += c1 * 1099;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s4();
                    }
                }
                break;
            }

            default: {
                System.out.println(Main.RED+"Invalid Selection, Please Select Again"+Main.RESET);
                f1s4();
            }
        }
    }

    public static void f1s5() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine();
            f1s5();
            return;
        }

        switch (n1) {
            case 1: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 799;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Casual T-Shirts           " + c1 + " * 799", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 1299;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Slim Fit Jeans            " + c1 + " * 1299", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 699;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Polo T-Shirts             " + c1 + " * 699", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 3299;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Blazers                   " + c1 + " * 3299", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 999;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Chinos                    " + c1 + " * 999", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 1099;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Printed Kurtis            " + c1 + " * 1099", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 1599;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Denim Jackets             " + c1 + " * 1599", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 999;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Palazzo Pants             " + c1 + " * 999", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 1299;

                if (BankSession.user.getBalance() > total) {
                    hm.put("High Waist Jeans          " + c1 + " * 1299", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 1499;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Maxi Dresses              " + c1 + " * 1499", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 11: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 499;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Cartoon Print T-Shirt     " + c1 + " * 499", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 12: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 499;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Denim Shorts              " + c1 + " * 499", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 13: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 1199;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Party Dresses for Girls   " + c1 + " * 1199", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 14: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 899;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Printed Hoodies           " + c1 + " * 899", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            case 15: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1 * 1399;

                if (BankSession.user.getBalance() > total) {
                    hm.put("Ethnic Wear Sets          " + c1 + " * 1399", total);
                    bill += total;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f1s5();
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"Invalid Selection, Please Select Again"+Main.RESET);
                f1s5();
            }
        }
    }



    public static void f2s1() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"Select items (1-17): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f2s1();
            return;
        }

        switch (n1) {
            case 1: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*199;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Big Mac                " + c1 + " * 199", c1 * 199);
                    bill += c1 * 199;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*179;
                if (BankSession.user.getBalance() > total) {
                    hm.put("McChicken              " + c1 + " * 179", c1 * 179);
                    bill += c1 * 179;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*189;
                if (BankSession.user.getBalance() > total) {
                    hm.put("McSpicy Paneer         " + c1 + " * 189", c1 * 189);
                    bill += c1 * 189;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*59;
                if (BankSession.user.getBalance() > total) {
                    hm.put("McAloo Tikki           " + c1 + " * 59", c1 * 59);
                    bill += c1 * 59;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*129;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Cheeseburger           " + c1 + " * 129", c1 * 129);
                    bill += c1 * 129;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 6: {
                System.out.print("SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*149;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chicken Kebab Wrap     " + c1 + " * 149", c1 * 149);
                    bill += c1 * 149;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*199;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Veg Maharaja Mac Wrap  " + c1 + " * 199", c1 * 199);
                    bill += c1 * 199;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Grilled Chicken Wrap   " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*99;
                if (BankSession.user.getBalance() > total) {
                    hm.put("French Fries           " + c1 + " * 99", c1 * 99);
                    bill += c1 * 99;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*149;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chicken Nuggets        " + c1 + " * 149", c1 * 149);
                    bill += c1 * 149;
                } else {
                    System.out.println(Main.PURPLE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 11: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*109;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Veggie Strips          " + c1 + " * 109", c1 * 109);
                    bill += c1 * 109;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 12: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*129;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Cheesy Bites           " + c1 + " * 129", c1 * 129);
                    bill += c1 * 129;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 13: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*60;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Coca-Cola              " + c1 + " * 60", c1 * 60);
                    bill += c1 * 60;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 14: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*60;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Fanta                  " + c1 + " * 60", c1 * 60);
                    bill += c1 * 60;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 15: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*60;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Sprite                 " + c1 + " * 60", c1 * 60);
                    bill += c1 * 60;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 16: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*99;
                if (BankSession.user.getBalance() > total) {
                    hm.put("McCafe Coffee          " + c1 + " * 99", c1 * 99);
                    bill += c1 * 99;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }
            case 17: {
                System.out.print(Main.PURPLE+"SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*89;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Iced Tea               " + c1 + " * 89", c1 * 89);
                    bill += c1 * 89;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s1();
                    }
                }
                break;
            }

            default: {
                System.out.println(Main.RED+"Invalid Selection, Please Select Again"+Main.RESET);
                f2s1();
            }
        }
    }


    public static void f2s2() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"			Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f2s2(); // Recursively call the method again
            return;
        }
        switch (n1) {
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*89;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Vanilla                   " + c1 + " * 89", c1 * 89);
                    bill += c1 * 89;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*89;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chocolate                 " + c1 + " * 89", c1 * 89);
                    bill += c1 * 89;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*89;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Strawberry                " + c1 + " * 89", c1 * 89);
                    bill += c1 * 89;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*89;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Butterscotch              " + c1 + " * 89", c1 * 89);
                    bill += c1 * 89;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*89;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Mango                     " + c1 + " * 89", c1 * 89);
                    bill += c1 * 89;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*129;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Cookies and Cream         " + c1 + " * 129", c1 * 129);
                    bill += c1 * 129;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*149;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Belgian Chocolate         " + c1 + " * 149", c1 * 149);
                    bill += c1 * 149;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*139;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Black Forest              " + c1 + " * 139", c1 * 139);
                    bill += c1 * 139;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*149;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Red Velvet                " + c1 + " * 149", c1 * 149);
                    bill += c1 * 149;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*129;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Mint Chocolate Chip       " + c1 + " * 129", c1 * 129);
                    bill += c1 * 129;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 11: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*159;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Hot Fudge Sundae          " + c1 + " * 159", c1 * 159);
                    bill += c1 * 159;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 12: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Brownie Sundae            " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 13: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Banana Split              " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 14: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Caramel Crunch Sundae     " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            case 15: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*149;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Strawberry Delight Sundae " + c1 + " * 149", c1 * 149);
                    bill += c1 * 149;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s2();
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                f2s2();
            }
        }
    }

    public static void f2s3() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"			Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f2s3(); // Recursively call the method again
            return;
        }

        switch(n1) {
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*749;
                if (BankSession.user.getBalance() > total) {
                    hm.put("10-Piece Hot & Crispy Chicken Bucket      " + c1 + " * 749", c1 * 749);
                    bill += c1 * 749;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*789;
                if (BankSession.user.getBalance() > total) {
                    hm.put("8-Piece Smoky Grilled Chicken Bucket      " + c1 + " * 789", c1 * 789);
                    bill += c1 * 789;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*289;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Popcorn Chicken Bucket                     " + c1 + " * 289", c1 * 289);
                    bill += c1 * 289;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Boneless Strips Bucket                     " + c1 + " * 389", c1 * 389);
                    bill += c1 * 389;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Wings Bucket                               " + c1 + " * 489", c1 * 489);
                    bill += c1 * 489;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*179;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Zinger Burger                              " + c1 + " * 179", c1 * 179);
                    bill += c1 * 179;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*299;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Double Down Burger                         " + c1 + " * 229", c1 * 229);
                    bill += c1 * 299;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*170;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chicken Wrap                               " + c1 + " * 170", c1 * 170);
                    bill += c1 * 170;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*149;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Classic Chicken Burger                     " + c1 + " * 149", c1 * 149);
                    bill += c1 * 149;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*129;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Veggie Burger                              " + c1 + " * 129", c1 * 129);
                    bill += c1 * 129;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 11: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*159;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chicken Popcorn                            " + c1 + " * 159", c1 * 159);
                    bill += c1 * 159;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 12: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("French Fries                               " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 13: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chicken Strips                             " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 14: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Potato Wedges                              " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            case 15: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*149;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Hot Wings                                  " + c1 + " * 149", c1 * 149);
                    bill += c1 * 149;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s3();
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                f2s3();
            }
        }
    }

    public static void f2s4() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"			Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f2s4(); // Recursively call the method again
            return;
        }
        switch (n1) {
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*149;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Margherita Pizza           " + c1 + " * 149", c1 * 149);
                    bill += c1 * 149;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Veggie Supreme Pizza       " + c1 + " * 389", c1 * 389);
                    bill += c1 * 389;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chicken Supreme Pizza      " + c1 + " * 389", c1 * 389);
                    bill += c1 * 389;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Pepperoni Pizza            " + c1 + " * 489", c1 * 489);
                    bill += c1 * 489;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Tandoori Paneer Pizza      " + c1 + " * 389", c1 * 389);
                    bill += c1 * 389;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*479;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Cheese Maxx Pizza          " + c1 + " * 479", c1 * 479);
                    bill += c1 * 479;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*329;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Triple Chicken Feast Pizza " + c1 + " * 329", c1 * 329);
                    bill += c1 * 329;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*370;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Country Feast Pizza        " + c1 + " * 370", c1 * 370);
                    bill += c1 * 370;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 9: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*249;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Spicy Veggie Pizza         " + c1 + " * 249", c1 * 249);
                    bill += c1 * 249;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 10: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*529;
                if (BankSession.user.getBalance() > total) {
                    hm.put("BBQ Chicken Pizza          " + c1 + " * 529", c1 * 529);
                    bill += c1 * 529;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 11: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*159;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Garlic Breadsticks         " + c1 + " * 159", c1 * 159);
                    bill += c1 * 159;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 12: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Cheesy Garlic Bread        " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 13: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*199;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Potato Wedges              " + c1 + " * 199", c1 * 199);
                    bill += c1 * 199;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 14: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*199;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chicken Wings              " + c1 + " * 199", c1 * 199);
                    bill += c1 * 199;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            case 15: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*159;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Veggie Pops                " + c1 + " * 159", c1 * 159);
                    bill += c1 * 159;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s4();
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                f2s4();
            }
        }
    }

    public static void f2s5() {
        int n1;
        try {
            System.out.print(Main.PURPLE+"			Select items (1-15): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f2s5(); // Recursively call the method again
            return;
        }
        switch (n1) {
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*349;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chocolate Truffle Cake      " + c1 + " * 349", c1 * 349);
                    bill += c1 * 349;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Red Velvet Cake             " + c1 + " * 389", c1 * 389);
                    bill += c1 * 389;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Black Forest Cake           " + c1 + " * 389", c1 * 389);
                    bill += c1 * 389;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Pineapple Cake              " + c1 + " * 489", c1 * 489);
                    bill += c1 * 489;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 5: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Butterscotch Cake           " + c1 + " * 389", c1 * 389);
                    bill += c1 * 389;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 6: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*79;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chocolate Pastry            " + c1 + " * 79", c1 * 79);
                    bill += c1 * 79;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 7: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*69;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Vanilla Pastry              " + c1 + " * 69", c1 * 69);
                    bill += c1 * 69;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 8: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*70;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Strawberry Pastry           " + c1 + " * 70", c1 * 70);
                    bill += c1 * 70;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 9: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*249;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Red Velvet Pastry           " + c1 + " * 249", c1 * 249);
                    bill += c1 * 249;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 10: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*529;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Black Forest Pastry         " + c1 + " * 529", c1 * 529);
                    bill += c1 * 529;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 11: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*59;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Vanilla Ice Cream           " + c1 + " * 59", c1 * 59);
                    bill += c1 * 59;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 12: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Chocolate Ice Cream         " + c1 + " * 169", c1 * 169);
                    bill += c1 * 169;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 13: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*99;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Mango Ice Cream             " + c1 + " * 99", c1 * 99);
                    bill += c1 * 99;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 14: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*99;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Butterscotch Ice Cream      " + c1 + " * 99", c1 * 99);
                    bill += c1 * 99;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            case 15: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*99;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Cookies and Cream Ice Cream " + c1 + " * 99", c1 * 99);
                    bill += c1 * 99;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f2s5();
                    }
                }
                break;
            }
            default: {
                System.out.println("			Invalid Selection, Please Select Again");
                f2s5();
            }
        }
    }
    public static void f3s1() {
        int n1;
        try {
            System.out.print("			Select items (1-8): ");
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("			Invalid input. Please enter a number.");
            sc.nextLine(); // Clear invalid input
            f3s1(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*1299;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Bata Power Sneaker          " + c1 + " * 1299", c1 * 1299);
                    bill += c1 * 1299;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s1();
                    }
                }
                break;
            }
            case 2: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*1799;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Bata Formal Lace-Up         " + c1 + " * 1799", c1 * 1799);
                    bill += c1 * 1799;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s1();
                    }
                }
                break;
            }
            case 3: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*1389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Bata Comfit Sandals         " + c1 + " * 1389", c1 * 1389);
                    bill += c1 * 1389;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s1();
                    }
                }
                break;
            }
            case 4: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Bata Red Label Loafers      " + c1 + " * 2489", c1 * 2489);
                    bill += c1 * 2489;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s1();
                    }
                }
                break;
            }
            case 5: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Bata Canvas Casuals         " + c1 + " * 2389", c1 * 2389);
                    bill += c1 * 2389;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s1();
                    }
                }
                break;
            }
            case 6: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*1179;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Bata Comfort Slippers       " + c1 + " * 1179", c1 * 1179);
                    bill += c1 * 1179;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s1();
                    }
                }
                break;
            }
            case 7: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Bata School Shoes           " + c1 + " * 2169", c1 * 2169);
                    bill += c1 * 2169;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s1();
                    }
                }
                break;
            }
            case 8: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2470;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Bata Block Heels            " + c1 + " * 2470", c1 * 2470);
                    bill += c1 * 2470;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s1();
                    }
                }
                break;
            }
            default: {
                System.out.println("			Invalid Selection, Please Select Again");
                f3s1();
            }
        }
    }

    public static void f3s2() {
        int n1;
        try {
            System.out.print("			Select items (1-8): ");
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("			Invalid input. Please enter a number.");
            sc.nextLine(); // Clear invalid input
            f3s2(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*15299;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Adidas Ultraboost 22               " + c1 + " * 15299", c1 * 15299);
                    bill += c1 * 15299;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s2();
                    }
                }
                break;
            }
            case 2: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*4799;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Adidas Grand Court                 " + c1 + " * 4799", c1 * 4799);
                    bill += c1 * 4799;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s2();
                    }
                }
                break;
            }
            case 3: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*3389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Adidas Lite Racer                  " + c1 + " * 3389", c1 * 3389);
                    bill += c1 * 3389;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s2();
                    }
                }
                break;
            }
            case 4: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Adidas Predator Football Shoes     " + c1 + " * 2489", c1 * 2489);
                    bill += c1 * 2489;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s2();
                    }
                }
                break;
            }
            case 5: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2389;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Adidas Adilette Slides             " + c1 + " * 2389", c1 * 2389);
                    bill += c1 * 2389;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s2();
                    }
                }
                break;
            }
            case 6: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*1179;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Adidas RunFalcon 3.0               " + c1 + " * 1179", c1 * 1179);
                    bill += c1 * 1799;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s2();
                    }
                }
                break;
            }
            case 7: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2169;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Adidas Superstar Originals         " + c1 + " * 2169", c1 * 2169);
                    bill += c1 * 2169;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s2();
                    }
                }
                break;
            }
            case 8: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*3270;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Adidas Galaxy 6                    " + c1 + " * 3270", c1 * 3270);
                    bill += c1 * 3270;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s2();
                    }
                }
                break;
            }
            default: {
                System.out.println("			Invalid Selection, Please Select Again");
                f3s2();
            }
        }
    }

    public static void f3s3() {
        int n1;
        try {
            System.out.print("			Select items (1-8): ");
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("			Invalid input. Please enter a number.");
            sc.nextLine(); // Clear invalid input
            f3s3(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*4299;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Puma Smash v2                   " + c1 + " * 4299", c1 * 4299);
                    bill += c1 * 4299;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s3();
                    }
                }
                break;
            }
            case 2: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2899;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Puma Flyer Runner               " + c1 + " * 2899", c1 * 2899);
                    bill += c1 * 2899;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s3();
                    }
                }
                break;
            }
            case 3: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*3489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Puma Rebound LayUp              " + c1 + " * 3489", c1 * 3489);
                    bill += c1 * 3489;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s3();
                    }
                }
                break;
            }
            case 4: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*3489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Puma RS-X Efekt                 " + c1 + " * 3489", c1 * 3489);
                    bill += c1 * 3489;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s3();
                    }
                }
                break;
            }
            case 5: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = sc.nextInt();
                int total = c1*2789;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Puma Softride Rift              " + c1 + " * 2789", c1 * 2789);
                    bill += c1 * 2789;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s3();
                    }
                }
                break;
            }
            case 6: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2179;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Puma Drift Cat 5                " + c1 + " * 2179", c1 * 2179);
                    bill += c1 * 2179;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s3();
                    }
                }
                break;
            }
            case 7: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2269;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Puma Carina Street              " + c1 + " * 2269", c1 * 2269);
                    bill += c1 * 2269;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s3();
                    }
                }
                break;
            }
            case 8: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2170;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Puma Slippers Leadcat           " + c1 + " * 2170", c1 * 2170);
                    bill += c1 * 2170;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s3();
                    }
                }
                break;
            }
            default: {
                System.out.println("			Invalid Selection, Please Select Again");
                f3s3();
            }
        }
    }

    public static void f3s4() {
        int n1;
        try {
            System.out.print("			Select items (1-8): ");
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("			Invalid input. Please enter a number.");
            sc.nextLine(); // Clear invalid input
            f3s4(); // Recursively call the method again
            return;
        }
        switch(n1){
            case 1: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*14299;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Nike Air Max 90                   " + c1 + " * 14299", c1 * 14299);
                    bill += c1 * 14299;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s4();
                    }
                }
                break;
            }
            case 2: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*1899;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Nike Revolution 6                " + c1 + " * 1899", c1 * 1899);
                    bill += c1 * 1899;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s4();
                    }
                }
                break;
            }
            case 3: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*1489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Nike Downshifter 12              " + c1 + " * 1489", c1 * 1489);
                    bill += c1 * 1489;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s4();
                    }
                }
                break;
            }
            case 4: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*3489;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Nike Air Zoom Pegasus 40         " + c1 + " * 3489", c1 * 3489);
                    bill += c1 * 3489;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s4();
                    }
                }
                break;
            }
            case 5: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*1789;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Nike Court Vision Low            " + c1 + " * 1789", c1 * 1789);
                    bill += c1 * 1789;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s4();
                    }
                }
                break;
            }
            case 6: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2179;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Nike Renew Ride 3                " + c1 + " * 2179", c1 * 2179);
                    bill += c1 * 2179;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s4();
                    }
                }
                break;
            }
            case 7: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2269;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Nike Flex Experience             " + c1 + " * 2269", c1 * 2269);
                    bill += c1 * 2269;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s4();
                    }
                }
                break;
            }
            case 8: {
                System.out.print("			SELECT QUANTITY: ");
                int c1 = getQuantity();
                int total = c1*2170;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Nike Victori One Slides          " + c1 + " * 2170", c1 * 2170);
                    bill += c1 * 2170;
                } else {
                    System.out.println("Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit");
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s4();
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                f3s4();
            }
        }
    }

    public static void f3s5() {
        int n1;
        try {
            System.out.print(Main.BG_YELLOW+"			Select items (1-8): "+Main.RESET);
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Main.RED+"			Invalid input. Please enter a number."+Main.RESET);
            sc.nextLine(); // Clear invalid input
            f3s5(); // Recursively call the method again
            return;
        }
        switch(n1) {
            case 1: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*18999;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Air Jordan 1 Retro High            " + c1 + " * 18999", c1 * 18999);
                    bill += c1 * 18999;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s5();
                    }
                }
                break;
            }
            case 2: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*22499;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Air Jordan 4 Retro                 " + c1 + " * 22499", c1 * 22499);
                    bill += c1 * 22499;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s5();
                    }
                }
                break;
            }
            case 3: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*27999;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Air Jordan 11 Retro                " + c1 + " * 27999", c1 * 27999);
                    bill += c1 * 27999;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s5();
                    }
                }
                break;
            }
            case 4: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*24599;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Air Jordan 3 Retro                 " + c1 + " * 24599", c1 * 24599);
                    bill += c1 * 24599;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s5();
                    }
                }
                break;
            }
            case 5: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*21299;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Air Jordan 5 Retro                 " + c1 + " * 21299", c1 * 21299);
                    bill += c1 * 21299;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s5();
                    }
                }
                break;
            }
            case 6: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*23499;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Air Jordan 6 Retro                 " + c1 + " * 23499", c1 * 23499);
                    bill += c1 * 23499;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s5();
                    }
                }
                break;
            }
            case 7: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*19799;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Air Jordan 7 Retro                 " + c1 + " * 19799", c1 * 19799);
                    bill += c1 * 19799;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2. Exit"+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s5();
                    }
                }
                break;
            }
            case 8: {
                System.out.print(Main.PURPLE+"			SELECT QUANTITY: "+Main.RESET);
                int c1 = getQuantity();
                int total = c1*25499;
                if (BankSession.user.getBalance() > total) {
                    hm.put("Air Jordan 12 Retro                " + c1 + " * 25499", c1 * 25499);
                    bill += c1 * 25499;
                } else {
                    System.out.println(Main.BLUE+"Amount is Not Sufficient");
                    System.out.println("1. Do you want to add money?");
                    System.out.println("2.Cancel Transaction"+Main.RESET);
                    System.out.print(Main.BG_YELLOW+"Enter your choice: "+Main.RESET);
                    int m = sc.nextInt();
                    if (m == 1) {
                        method();
                        f3s5();
                    }
                }
                break;
            }
            default: {
                System.out.println(Main.RED+"			Invalid Selection, Please Select Again"+Main.RESET);
                f3s5();
            }
        }
    }
}