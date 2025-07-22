import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;

class ShopLogin extends LoginHandler {
    public ShopLogin(String password) {
        super(password);
    }

    @Override
    public boolean isLoginSuccessful(String inputPass) {

        return this.password.equals(inputPass); //check the entered password is correct or not
    }
}

abstract class ViewMapOfShop {


    static Scanner sc = new Scanner(System.in);
    abstract public void display();

    // Shop passwords (floor_shop -> password)
    static HashMap<String, String> shopPasswords = new HashMap<>();

    //It executes before the main method
    static {
        // FloorG
        shopPasswords.put("0_1", "cv");
        shopPasswords.put("0_2", "game2");
        shopPasswords.put("0_3", "lakme");
        shopPasswords.put("0_4", "ponds");
        shopPasswords.put("0_5", "beauty");

        // Floor1
        shopPasswords.put("1_1", "style");
        shopPasswords.put("1_2", "zudio");
        shopPasswords.put("1_3", "hm");
        shopPasswords.put("1_4", "max");
        shopPasswords.put("1_5", "pantaloons");

        // Floor2
        shopPasswords.put("2_1", "mcd");
        shopPasswords.put("2_2", "cream");
        shopPasswords.put("2_3", "kfc");
        shopPasswords.put("2_4", "pizza");
        shopPasswords.put("2_5", "desserts");

        // Floor3
        shopPasswords.put("3_1", "bata");
        shopPasswords.put("3_2", "adidas");
        shopPasswords.put("3_3", "puma");
        shopPasswords.put("3_4", "nike");

        // Floor4
        shopPasswords.put("4_1", "miraj");
        shopPasswords.put("4_2", "music");
        shopPasswords.put("4_3", "pvr");
        shopPasswords.put("4_4", "4dx");
    }

    public static void Map() {
        System.out.println();
        System.out.printf("%15s %15s\n", "", "*************************************************************");
        System.out.println();
        System.out.printf("%15s %1s %40s %18s\n", "", "*", "Welcome To Krishna Mall!!", "*");
        System.out.printf("%15s %1s %25s %-20s %5s\n", "", "*", "Floor 0 : ", "Children Gaming & Cosmetics", "*");
        System.out.printf("%15s %1s %25s %-20s %12s\n", "", "*", "Floor 1 : ", "Cloth Shopping", "*");
        System.out.printf("%15s %1s %25s %-20s %12s\n", "", "*", "Floor 2 : ", "Food", "*");
        System.out.printf("%15s %1s %25s %-20s %12s\n", "", "*", "Floor 3 : ", "Footwear", "*");
        System.out.printf("%15s %1s %25s %-20s %12s\n", "", "*", "Floor 4 : ", "Entertainment", "*");
        System.out.printf("%15s %1s %25s %-20s %12s\n", "", "*", "5. Back", "", "*");
        System.out.println();
        System.out.printf("%15s %15s\n", "", "*************************************************************");

        System.out.print(Main.BG_YELLOW+"Select the Floor : "+Main.RESET);
        //int x = sc.nextInt();
        System.out.println();
        String input = Main.scanner.next();
        int choice = 0;
        if(Main.isNumeric(input)){
            choice = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            Map();
        }

        ViewMapOfShop obj;
        switch (choice) { //upcasting of respective floors to ViewMapOfShop
            case 0: obj = new FloorG(); break;
            case 1: obj = new Floor1(); break;
            case 2: obj = new Floor2(); break;
            case 3: obj = new Floor3(); break;
            case 4: obj = new Floor4(); break;
            case 5: Main.Main();
            default:
                System.out.println(Main.BG_YELLOW+"Please enter the floor from 0-4."+Main.RESET);
                Map();
                return;
        }
        obj.display(); // invokes the abstract method and calls the respective overridden method (floor's)
    }

    // Password check method
    protected boolean checkPassword(int floor, int shop) {
        String key = floor + "_" + shop;
        String actualPassword = shopPasswords.get(key); //to get the actual password from HashMap

        System.out.print(Main.PURPLE+"Enter password for the shop: "+Main.RESET);
        String entered = sc.next(); //the shopOwner entered password

        ShopLogin login = new ShopLogin(actualPassword); //to send the actual password to LoginHandler Protected password through constructor of ShopLogin Class
        if (login.isLoginSuccessful(entered)) { // the isloginSuccessfull method in Shop login class is invoked
            System.out.println(Main.GREEN+"Access granted."+Main.RESET);
            return true;
        } else { // if the shopOwner entered password is incorrect
            System.out.println(Main.RED+"Wrong password. Access denied."+Main.RESET);
            return false;
        }
    }

    public static void openAllShops(){
        ViewMap.gfShops(true,true,true,true,true);
        ViewMap.f1Shops(true,true,true,true,true);
        ViewMap.f2Shops(true,true,true,true,true);
        ViewMap.f3Shops(true,true,true,true,true);
        ViewMap.f4Shops(true,true,true,true,true);
    }
}
class FloorG extends ViewMapOfShop {
    static boolean game1,game2,game3,game4,game5;
    @Override
    public void display() { //G floor map
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.println();
        System.out.printf("%15s %1s %40s  %18s\n",		"", "*", "Children Games and Cosmetics !!", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",		"", "*", "Shop 1 : ", "CV Gaming Zone", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",		"", "*", "Shop 2 : ", "E-sports", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",		"", "*", "Shop 3 : ", "Lakme", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",		"", "*", "Shop 4 : ",  "Ponds", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",		"", "*", "Shop 5 : ", "Beauty & Nature", "*");
        System.out.printf("%15s %1s %20s %-20s  %17s\n",	"", "*", "6 : ", "Exit", "*");
        System.out.println();
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.print(Main.BG_YELLOW+"Select the Shop : "+Main.RESET);
        System.out.println();
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            display();
        }
        boolean isLoggedIn;
        switch(x) {
            case 1:
                while (true) {
                    isLoggedIn = checkPassword(0, x);
                    if (isLoggedIn) {
                        game1 = true;
                        ViewMap.gfShops(game1, game2, game3, game4, game5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println(Main.RED+"Incorrect password. Try again ("+Main.RESET+Main.CYAN + attempts + Main.RESET+Main.RESET+" attempt(s) left):"+Main.RESET);
                            isLoggedIn = checkPassword(0, x);
                            if (isLoggedIn) {
                                game1 = true;
                                ViewMap.gfShops(game1, game2, game3, game4, game5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println(Main.RED+"Maximum attempts reached. Access denied."+Main.RESET);
                        return; // Exit after 3 failed attempts
                    }
                }
                break;
            case 2:
                while (true) {
                    isLoggedIn = checkPassword(0, x);
                    if (isLoggedIn) {
                        game2 = true;
                        ViewMap.gfShops(game1, game2, game3, game4, game5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println(Main.RED+"Incorrect password. Try again (" +Main.CYAN + attempts + Main.RESET+" attempt(s) left):"+Main.RESET);
                            isLoggedIn = checkPassword(0, x);
                            if (isLoggedIn) {
                                game2 = true;
                                ViewMap.gfShops(game1, game2, game3, game4, game5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println(Main.RED+"Maximum attempts reached. Access denied."+Main.RESET);
                        return; // Exit after 3 failed attempts
                    }
                }

                break;
            case 3:
                while (true) {
                    isLoggedIn = checkPassword(0, x);
                    if (isLoggedIn) {
                        game3 = true;
                        ViewMap.gfShops(game1, game2, game3, game4, game5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println(Main.RED+"Incorrect password. Try again (" +Main.CYAN+ attempts +Main.RESET+ " attempt(s) left):"+Main.RESET);
                            isLoggedIn = checkPassword(0, x);
                            if (isLoggedIn) {
                                game3 = true;
                                ViewMap.gfShops(game1, game2, game3, game4, game5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println(Main.RED+"Maximum attempts reached. Access denied."+Main.RESET);
                        return; // Exit after 3 failed attempts
                    }
                }
                break;
            case 4:
                while (true) {
                isLoggedIn = checkPassword(0, x);
                if (isLoggedIn) {
                    game4 = true;
                    ViewMap.gfShops(game1, game2, game3, game4, game5);
                    AfterShopLogin.afterShopLogin();
                    break; // exit loop on success
                } else {
                    int attempts = 2; // Already failed once
                    while (attempts > 0) {
                        System.out.println(Main.RED+"Incorrect password. Try again ("+Main.CYAN + attempts +Main.RESET+ " attempt(s) left):"+Main.RESET);
                        isLoggedIn = checkPassword(0, x);
                        if (isLoggedIn) {
                            game4 = true;
                            ViewMap.gfShops(game1, game2, game3, game4, game5);
                            AfterShopLogin.afterShopLogin();
                            return; // Successful login, exit
                        }
                        attempts--;
                    }
                    System.out.println(Main.RED+"Maximum attempts reached. Access denied."+Main.RESET);
                    return; // Exit after 3 failed attempts
                }
            }
                break;
            case 5:
                while (true) {
                    isLoggedIn = checkPassword(0, x);
                    if (isLoggedIn) {
                        game5 = true;
                        ViewMap.gfShops(game1, game2, game3, game4, game5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println(Main.RED+"Incorrect password. Try again ("+Main.CYAN + attempts +Main.RESET+ " attempt(s) left):"+Main.RESET);
                            isLoggedIn = checkPassword(0, x);
                            if (isLoggedIn) {
                                game5 = true;
                                ViewMap.gfShops(game1, game2, game3, game4, game5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println(Main.RED+"Maximum attempts reached. Access denied."+Main.RESET);
                        return; // Exit after 3 failed attempts
                    }
                }
                break;
            case 6: ViewMapOfShop.Map(); break;
            default: System.out.println(Main.BG_YELLOW+"Please select the correct Shop!"+Main.RESET);
                if (counter.count==0) {
                    ViewMap.Map();
                    counter.count++;
                }
        }
    }
}
class Floor1 extends ViewMapOfShop {
    boolean cloth1,cloth2,cloth3,cloth4,cloth5;
    @Override
    public void display() {
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.println();
        System.out.printf("%15s %1s %40s %19s\n",		"", "*", "Cloth Shopping !!", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 1 : ", "Style Union", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 2 : ", "Zudio", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 3 : ", "H&M", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 4 : ",  "Max", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 5 : ", "Pantaloons", "*");
        System.out.printf("%15s %1s %20s %-18s %20s\n",	"", "*", "6 : ", "Exit", "*");
        System.out.println();
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.print("Select the Shop : ");
        System.out.println();
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println("Invalid input please enter valid");
            display();
        }

        boolean isLoggedIn;
        switch(x) {
            case 1:
                while (true) {
                    isLoggedIn = checkPassword(1, x);
                    if (isLoggedIn) {
                        cloth1 = true;
                        ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(1, x);
                            if (isLoggedIn) {
                                cloth1 = true;
                                ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
                break;
            case 2:
                while (true) {
                    isLoggedIn = checkPassword(1, x);
                    if (isLoggedIn) {
                        cloth2 = true;
                        ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(1, x);
                            if (isLoggedIn) {
                                cloth2 = true;
                                ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
                break;
            case 3:
                while (true) {
                    isLoggedIn = checkPassword(1, x);
                    if (isLoggedIn) {
                        cloth3 = true;
                        ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(1, x);
                            if (isLoggedIn) {
                                cloth3 = true;
                                ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
                break;
            case 4:
                while (true) {
                    isLoggedIn = checkPassword(1, x);
                    if (isLoggedIn) {
                        cloth4 = true;
                        ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(1, x);
                            if (isLoggedIn) {
                                cloth4 = true;
                                ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
                break;
            case 5:
                while (true) {
                    isLoggedIn = checkPassword(1, x);
                    if (isLoggedIn) {
                        cloth5 = true;
                        ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(1, x);
                            if (isLoggedIn) {
                                cloth5 = true;
                                ViewMap.f1Shops(cloth1, cloth2, cloth3, cloth4, cloth5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
                break;
            case 6: ViewMapOfShop.Map(); break;
            default: System.out.println("Please select the correct Shop!");
        }
    }
}
class Floor2 extends ViewMapOfShop {
    boolean food1,food2,food3,food4,food5;
    @Override
    public void display() {
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.println();
        System.out.printf("%15s %1s %35s %24s\n",		"", "*", "Food !!", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 1 : ", "McDonalds", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 2 : ", "Cream Stone", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 3 : ", "KFC", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 4 : ",  "Pizza Hut", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 5 : ", "Desserts", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "6 : ", "Exit", "*");
        System.out.println();
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.print("Select the Shop : ");
        System.out.println();
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println("Invalid input please enter valid");
            display();
        }

        boolean isLoggedIn;
        switch(x) {
            case 1:
                while (true) {
                    isLoggedIn = checkPassword(2, x);
                    if (isLoggedIn) {
                        food1 = true;
                        ViewMap.f2Shops(food1, food2, food3, food4, food5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(2, x);
                            if (isLoggedIn) {
                                food1 = true;
                                ViewMap.f2Shops(food1, food2, food3, food4, food5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 2:
                while (true) {
                    isLoggedIn = checkPassword(2, x);
                    if (isLoggedIn) {
                        food2 = true;
                        ViewMap.f2Shops(food1, food2, food3, food4, food5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(2, x);
                            if (isLoggedIn) {
                                food2 = true;
                                ViewMap.f2Shops(food1, food2, food3, food4, food5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 3:
                while (true) {
                    isLoggedIn = checkPassword(2, x);
                    if (isLoggedIn) {
                        food3 = true;
                        ViewMap.f2Shops(food1, food2, food3, food4, food5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(2, x);
                            if (isLoggedIn) {
                                food3 = true;
                                ViewMap.f2Shops(food1, food2, food3, food4, food5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 4:
                while (true) {
                    isLoggedIn = checkPassword(2, x);
                    if (isLoggedIn) {
                        food4 = true;
                        ViewMap.f2Shops(food1, food2, food3, food4, food5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }  else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(2, x);
                            if (isLoggedIn) {
                                food4 = true;
                                ViewMap.f2Shops(food1, food2, food3, food4, food5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 5:
                while (true) {
                    isLoggedIn = checkPassword(2, x);
                    if (isLoggedIn) {
                        food5 = true;
                        ViewMap.f2Shops(food1, food2, food3, food4, food5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }  else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(2, x);
                            if (isLoggedIn) {
                                food5 = true;
                                ViewMap.f2Shops(food1, food2, food3, food4, food5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }

            case 6:ViewMapOfShop.Map(); break;
            default: System.out.println("Please select the correct Shop!");
        }
    }
}
class Floor3 extends ViewMapOfShop {
    boolean footware1,footware2,footware3,footware4,footware5;
    @Override
    public void display() {
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.println();
        System.out.printf("%15s %1s %40s %19s\n",		"", "*", "Footware !!", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 1 : ", "Bata", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 2 : ", "Adidas", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 3 : ", "Puma", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 4 : ",  "Nike", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "Shop 5 : ",  "Air Jorden", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "6 : ", "Exit", "*");
        System.out.println();
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.print("Select the Shop : ");
        System.out.println();
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println("Invalid input please enter valid");
            display();
        }

        boolean isLoggedIn;
        switch(x) {
            case 1:
                while (true) {
                    isLoggedIn = checkPassword(3, x);
                    if (isLoggedIn) {
                        footware1 = true;
                        ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(3, x);
                            if (isLoggedIn) {
                                footware1 = true;
                                ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 2:
                while (true) {
                    isLoggedIn = checkPassword(3, x);
                    if (isLoggedIn) {
                        footware2 = true;
                        ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(3, x);
                            if (isLoggedIn) {
                                footware2 = true;
                                ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 3:
                while (true) {
                    isLoggedIn = checkPassword(3, x);
                    if (isLoggedIn) {
                        footware3 = true;
                        ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    }
                    else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(3, x);
                            if (isLoggedIn) {
                                footware3 = true;
                                ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 4:
                while (true) {
                    isLoggedIn = checkPassword(3, x);
                    if (isLoggedIn) {
                        footware4 = true;
                        ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(3, x);
                            if (isLoggedIn) {
                                footware4 = true;
                                ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 5:
                while (true) {
                    isLoggedIn = checkPassword(3, x);
                    if (isLoggedIn) {
                        footware5 = true;
                        ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(3, x);
                            if (isLoggedIn) {
                                footware5 = true;
                                ViewMap.f3Shops(footware1, footware2, footware3, footware4, footware5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 6: ViewMapOfShop.Map();
            break;
            default: System.out.println("Please select the correct Shop!");
        }
    }
}
class Floor4 extends ViewMapOfShop {
    boolean movie1,movie2,movie3,movie4,movie5;
    @Override
    public void display() {
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.println();
        System.out.printf("%15s %1s %40s %19s\n",		"", "*", "Entertainment !!", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "1 : ", "Miraj Cinemas", "*");//->movie->timings->seating->price
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "2 : ", "Music Concerts", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "3 : ", "PVR Cinemas", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "4 : ",  "4DX Cinemas", "*");
        System.out.printf("%15s %1s %20s %-20s %18s\n",	"", "*", "5 : ", "Exit", "*");
        System.out.println();
        System.out.printf("%15s %15s\n","", "*************************************************************");
        System.out.print("Select the Shop : ");
        System.out.println();
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println("Invalid input please enter valid");
            display();
        }

        boolean isLoggedIn;
        switch(x) {
            case 1:
                while (true) {
                    isLoggedIn = checkPassword(4, x);
                    if (isLoggedIn) {
                        movie1 = true;
                        ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(4, x);
                            if (isLoggedIn) {
                                movie1 = true;
                                ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 2:
                while (true) {
                    isLoggedIn = checkPassword(4, x);
                    if (isLoggedIn) {
                        movie2 = true;
                        ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(4, x);
                            if (isLoggedIn) {
                                movie2 = true;
                                ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 3:
                while (true) {
                    isLoggedIn = checkPassword(4, x);
                    if (isLoggedIn) {
                        movie3 = true;
                        ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(4, x);
                            if (isLoggedIn) {
                                movie3 = true;
                                ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 4:
                while (true) {
                    isLoggedIn = checkPassword(4, x);
                    if (isLoggedIn) {
                        movie4 = true;
                        ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println("Incorrect password. Try again (" + attempts + " attempt(s) left):");
                            isLoggedIn = checkPassword(4, x);
                            if (isLoggedIn) {
                                movie4 = true;
                                ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 5:
                while (true) {
                    isLoggedIn = checkPassword(4, x);
                    if (isLoggedIn) {
                        movie5 = true;
                        ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                        AfterShopLogin.afterShopLogin();
                        break; // exit loop on success
                    } else {
                        int attempts = 2; // Already failed once
                        while (attempts > 0) {
                            System.out.println(Main.RED+"Incorrect password. Try again (" + attempts + " attempt(s) left):"+Main.RESET);
                            isLoggedIn = checkPassword(4, x);
                            if (isLoggedIn) {
                                movie5 = true;
                                ViewMap.f4Shops(movie1, movie2, movie3, movie4, movie5);
                                AfterShopLogin.afterShopLogin();
                                return; // Successful login, exit
                            }
                            attempts--;
                        }
                        System.out.println("Maximum attempts reached. Access denied.");
                        return; // Exit after 3 failed attempts
                    }
                }
            case 6:
                System.out.println("Exiting...");
                ViewMapOfShop.Map();
                break;
            default: System.out.println("Please select the correct Shop!");

        }
    }
}