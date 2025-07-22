import java.util.InputMismatchException;
import java.util.Scanner;

abstract class ViewMap{
    static Scanner sc = new Scanner(System.in);
    static boolean game1,game2,game3,game4,game5;
    static boolean c1,c2,c3,c4,c5;
    static boolean food1,food2,food3,food4,food5;
    static boolean Footware1,Footware2,Footware3,Footware4,Footware5;
    static boolean Entertainment1,Entertainment2,Entertainment3,Entertainment4,Entertainment5;

    public static void gfShops(boolean game1,boolean game2,boolean game3,boolean game4,boolean game5){
        ViewMap.game1=game1;
        ViewMap.game2=game2;
        ViewMap.game3=game3;
        ViewMap.game4=game4;
        ViewMap.game5=game5;
    }
    public static void f1Shops(boolean game1,boolean game2,boolean game3,boolean game4,boolean game5){
        ViewMap.c1=game1;
        ViewMap.c2=game2;
        ViewMap.c3=game3;
        ViewMap.c4=game4;
        ViewMap.c5=game5;
    }
    public static void f2Shops(boolean game1,boolean game2,boolean game3,boolean game4,boolean game5){
        ViewMap.food1=game1;
        ViewMap.food2=game2;
        ViewMap.food3=game3;
        ViewMap.food4=game4;
        ViewMap.food5=game5;
    }
    public static void f3Shops(boolean game1,boolean game2,boolean game3,boolean game4,boolean game5){
        ViewMap.Footware1=game1;
        ViewMap.Footware2=game2;
        ViewMap.Footware3=game3;
        ViewMap.Footware4=game4;
        ViewMap.Footware5=game5;
    }
    public static void f4Shops(boolean game1,boolean game2,boolean game3,boolean game4,boolean game5){
        ViewMap.Entertainment1=game1;
        ViewMap.Entertainment2=game2;
        ViewMap.Entertainment3=game3;
        ViewMap.Entertainment4=game4;
        ViewMap.Entertainment5=game5;
    }

    abstract public void display();
    public static void Map(){
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
        System.out.printf(Main.BG_YELLOW+"Select the Floor : "+Main.RESET);
        System.out.println();
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            Map();
        }
        // Calling abstract class that will call override method
        ViewMap obj = null;
        switch (x) {
            case 0: obj = new fG(); break;
            case 1: obj = new f1(); break;
            case 2: obj = new f2(); break;
            case 3: obj = new f3(); break;
            case 4: obj = new f4(); break;
            case 5: SecurityLogin.afterSecurityLogin();
            break;
            default:
                System.out.println(Main.BG_YELLOW+"Please enter the floor from 0-4."+Main.RESET);
                ViewMap.Map();
        }
        if(obj!=null) {
            obj.display();//error
        }
    }
}

class fG extends ViewMap{
    @Override
    public void display(){
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
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
            Main.scanner.nextLine();  // clear leftover newline

        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            display();
        }
        System.out.println();
        switch(x){
            case 1 :
                if (game1){
                    Menu.gfs1();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 2 :
                if (game2){
                    Menu.gfs2();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 3 :
                if (game3){
                    Menu.gfs3();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 4 :
                if (game4){
                    Menu.gfs4();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 5 :
                if (game5){
                    Menu.gfs5();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 6 :System.out.println(Main.RED+"Exiting..."+Main.RESET);
                    fG.Map();
                break;
            default : System.out.println(Main.BG_YELLOW+"Please select the correct Shop!"+Main.RESET);
                    display();
        }
    }
}


class f1 extends ViewMap{
    public void display(){
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
        System.out.print(Main.BG_YELLOW+"Select your preference : "+Main.RESET);
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            display();
        }
        System.out.println();

        switch(x){
            case 1 :
                if (c1){
                    Menu.f1s1();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 2 :
                if (c2){
                    Menu.f1s2();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 3 :
                if (c3){
                    Menu.f1s3();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 4 :
                if (c4){
                    Menu.f1s4();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 5 :
                if (c5){
                    Menu.f1s5();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 6 :System.out.println(Main.RED+"Exiting..."+Main.RESET);
                fG.Map();
                break;
            default : System.out.println(Main.BG_YELLOW+"Please select the correct Shop!"+Main.RESET);
                display();
        }
    }
}



class f2 extends ViewMap{
    public void display(){
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
        System.out.print(Main.BG_YELLOW+"Select your preference : "+Main.RESET);
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            display();
        }
        System.out.println();
        switch(x){
            case 1 :
                if (food1){
                    Menu.f2s1();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 2 :
                if (food2){
                    Menu.f2s2();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 3 :
                if (food3){
                    Menu.f2s3();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 4 :
                if (food4){
                    Menu.f2s4();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 5 :
                if (food5){
                    Menu.f2s5();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 6 :System.out.println("Exiting...");
                fG.Map();
                break;
            default : System.out.println("Please select the correct Shop!");
                display();
        }
    }
}


class f3 extends ViewMap{
    public void display(){
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
        System.out.print(Main.BG_YELLOW+"Select your preference : "+Main.RESET);
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            display();
        }
        System.out.println();
        switch(x){
            case 1 :
                if (Footware1){
                    Menu.f3s1();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 2 :
                if (Footware2){
                    Menu.f3s2();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 3 :
                if (Footware3){
                    Menu.f3s3();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 4 :
                if (Footware4){
                    Menu.f3s4();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 5 :
                if (Footware5){
                    Menu.f3s5();
                }
                else{
                    System.out.println(Main.PURPLE+"Shop is closed, Visit again"+Main.RESET);
                    ViewMap.Map();
                }
                break;
            case 6 :System.out.println(Main.BRIGHT_RED+"Exiting..."+Main.RESET);
                fG.Map();
                break;
            default : System.out.println(Main.BG_YELLOW+"Please select the correct Shop!"+Main.RESET);
                display();
        }
    }
}


class f4 extends ViewMap {
    static Scanner sc = new Scanner(System.in);
    static boolean Entertainment1 = true, Entertainment2 = true, Entertainment3 = true, Entertainment4 = true;

    public void display() {
        System.out.println("\n**************** Entertainment Menu ****************");
        System.out.println("1 : Miraj Cinemas");
        System.out.println("2 : Music Concerts");
        System.out.println("3 : PVR Cinemas");
        System.out.println("4 : 4DX Cinemas");
        System.out.println("5 : Exit");
        System.out.print("Select your preference: ");
        String input = Main.scanner.next();
        int x = 0;
        if(Main.isNumeric(input)){
            x = Integer.parseInt(input);
        }
        else{
            System.out.println(Main.RED+"Invalid input please enter valid"+Main.RESET);
            display();
        }
        System.out.println();


        switch (x) {
            case 1:
                if (Entertainment1) {
                    System.out.println("Welcome to Miraj Cinemas!");
                    int genre = chooseGenre();

                    switch (genre) {
                        case 1: // Action
                            movieBooking(new String[]{"Saripodhaa Sanivaaram", "RRR", "Pushpa-2", "Salaar", "KGF", "Bageera", "Hit 3", "Maari 2"},
                                    new String[]{"10:00 AM", "1:00 PM", "6:00 PM"},
                                    new String[]{"Regular", "Premium", "VIP"});
                            break;
                        case 2: // Romantic
                            movieBooking(new String[]{"18 Pages", "Hi Nanna", "Nuv Vasthaanata Nanu Vadhu Antana", "Radha Shyama", "Sita Ramam", "Fidda", "Titanic", "Andala Rakshasi"},
                                    new String[]{"11:00 AM", "3:00 PM", "7:00 PM"},
                                    new String[]{"Regular", "Premium", "VIP"});
                            break;
                        case 3: // Comedy
                            movieBooking(new String[]{"Nuvvu Naaku Nachav", "Mathu Vadalara 2", "MAD", "Maryada Ramanna", "DJ Tillu", "Jamba Lakidi Pamba", "F2", "Deadpool & Wolverine"},
                                    new String[]{"12:00 PM", "4:00 PM", "8:00 PM"},
                                    new String[]{"Regular", "Premium", "VIP"});
                            break;
                        case 4: // Family
                            movieBooking(new String[]{"Seethamma Vakitlo Sirimalle Chettu", "Sankranthiki Vasthunam", "Srimanthudu", "Sathamanam Bhavathi", "Varasudu", "Manam", "Govindudu Andarivadele", "Hi Nanna"},
                                    new String[]{"9:00 AM", "2:00 PM", "5:00 PM"},
                                    new String[]{"Regular", "Premium", "VIP"});
                            break;
                    }
                } else {
                    System.out.println("Shop is closed, Visit again");
                }
                break;

            case 2:
                if (Entertainment2) {
                    System.out.println("Welcome to Music Concerts!");
                    movieBooking(new String[]{"Arijit Live", "Yo Yo Honey Singh", "Lofi Beats Night"},
                            new String[]{"5:00 PM", "7:30 PM", "9:00 PM"},
                            new String[]{"Standing", "Seated", "VIP"});
                } else {
                    System.out.println("Shop is closed, Visit again");
                }
                break;

            case 3:
                if (Entertainment3) {
                    System.out.println("Welcome to PVR Cinemas!");
                    int genre = chooseGenre();

                    switch (genre) {
                        case 1: // Action
                            movieBooking(new String[]{"Saripodhaa Sanivaaram", "RRR", "Pushpa-2", "Salaar", "KGF", "Bageera", "Hit 3", "Maari 2"},
                                    new String[]{"11:00 AM", "2:00 PM", "6:00 PM"},
                                    new String[]{"Regular", "Premium", "Recliner"});
                            break;
                        case 2: // Romantic
                            movieBooking(new String[]{"18 Pages", "Hi Nanna", "Nuv Vasthaanata Nanu Vadhu Antana", "Radha Shyama", "Sita Ramam", "Fidda", "Titanic", "Andala Rakshasi"},
                                    new String[]{"10:30 AM", "1:30 PM", "7:00 PM"},
                                    new String[]{"Regular", "Premium", "Recliner"});
                            break;
                        case 3: // Comedy
                            movieBooking(new String[]{"Nuvvu Naaku Nachav", "Mathu Vadalara 2", "MAD", "Maryada Ramanna", "DJ Tillu", "Jamba Lakidi Pamba", "F2", "Deadpool & Wolverine"},
                                    new String[]{"12:00 PM", "4:00 PM", "8:00 PM"},
                                    new String[]{"Regular", "Premium", "Recliner"});
                            break;
                        case 4: // Family
                            movieBooking(new String[]{"Seethamma Vakitlo Sirimalle Chettu", "Sankranthiki Vasthunam", "Srimanthudu", "Sathamanam Bhavathi", "Varasudu", "Manam", "Govindudu Andarivadele", "Hi Nanna"},
                                    new String[]{"9:30 AM", "3:00 PM", "6:30 PM"},
                                    new String[]{"Regular", "Premium", "Recliner"});
                            break;
                    }
                } else {
                    System.out.println("Shop is closed, Visit again");
                }
                break;

            case 4:
                if (Entertainment4) {
                    System.out.println("Welcome to 4DX Cinemas!");
                    int genre = chooseGenre();

                    switch (genre) {
                        case 1: // Action
                            movieBooking(new String[]{"Saripodhaa Sanivaaram", "RRR", "Pushpa-2", "Salaar", "KGF", "Bageera", "Hit 3", "Maari 2"},
                                    new String[]{"12:00 PM", "3:30 PM", "9:00 PM"},
                                    new String[]{"4DX Regular", "4DX Premium", "4DX VIP"});
                            break;
                        case 2: // Romantic
                            movieBooking(new String[]{"18 Pages", "Hi Nanna", "Nuv Vasthaanata Nanu Vadhu Antana", "Radha Shyama", "Sita Ramam", "Fidda", "Titanic", "Andala Rakshasi"},
                                    new String[]{"1:00 PM", "4:00 PM", "7:30 PM"},
                                    new String[]{"4DX Regular", "4DX Premium", "4DX VIP"});
                            break;
                        case 3: // Comedy
                            movieBooking(new String[]{"Nuvvu Naaku Nachav", "Mathu Vadalara 2", "MAD", "Maryada Ramanna", "DJ Tillu", "Jamba Lakidi Pamba", "F2", "Deadpool & Wolverine"},
                                    new String[]{"2:00 PM", "5:00 PM", "8:00 PM"},
                                    new String[]{"4DX Regular", "4DX Premium", "4DX VIP"});
                            break;
                        case 4: // Family
                            movieBooking(new String[]{"Seethamma Vakitlo Sirimalle Chettu", "Sankranthiki Vasthunam", "Srimanthudu", "Sathamanam Bhavathi", "Varasudu", "Manam", "Govindudu Andarivadele", "Hi Nanna"},
                                    new String[]{"10:00 AM", "1:00 PM", "6:00 PM"},
                                    new String[]{"4DX Regular", "4DX Premium", "4DX VIP"});
                            break;
                    }
                } else {
                    System.out.println("Shop is closed, Visit again");
                }
                break;

            case 5:
                System.out.println(Main.RED+"Exiting..."+Main.RESET);
                fG.Map();
                break;

            default:
                System.out.println(Main.RED+"Please select the correct option!"+Main.RESET);
                display();
        }
    }

    private int chooseGenre() {
        int choice = 0;
        while (true) {
            System.out.println("Choose Movie Genre:");
            System.out.println("1. Action");
            System.out.println("2. Romantic");
            System.out.println("3. Comedy");
            System.out.println("4. Family");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            }
            System.out.println("Invalid choice. Please try again.\n");
        }
        return choice;
    }

    private void movieBooking(String[] movies, String[] timings, String[] seatings) {
        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%d. %s\n", i + 1, movies[i]);
        }
        System.out.print("Choose a movie (1 to 8): ");
        int movieChoice;

        while (true) {
            try {
                movieChoice = sc.nextInt();
                if (movieChoice >= 1 && movieChoice <= 8) {
                    break; // valid input
                } else {
                    System.out.print(Main.RED+"Invalid choice. Please enter a number between 1 and 8: "+Main.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.print(Main.RED+"Invalid input! Please enter a valid number between 1 and 8: "+Main.RESET);
                sc.next(); // clear invalid token
            }
        }


        System.out.println("\nAvailable Timings:");
        for (int i = 0; i < timings.length; i++) {
            System.out.printf("%d. %s\n", i + 1, timings[i]);
        }
        System.out.print("Choose a timing: ");

        int timeChoice = 0;

        while (true) {
            System.out.print("Choose a time slot (1 to 3): ");
            try {
                timeChoice = sc.nextInt();
                if (timeChoice >= 1 && timeChoice <= 3) {
                    break;
                } else {
                    System.out.println(Main.RED + "Invalid choice. Please enter a number between 1 and 3." + Main.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Main.RED + "Invalid input! Please enter a valid number." + Main.RESET);
                sc.next(); // clear invalid input
            }
        }


        System.out.println("\nAvailable Seating:");
        for (int i = 0; i < seatings.length; i++) {
            System.out.printf("%d. %s\n", i + 1, seatings[i]);
        }
        System.out.print("Choose seating: ");

        int seatChoice = 0;

        while (true) {
            System.out.print("Choose a seating option (1 to 3): ");
            try {
                seatChoice = sc.nextInt();
                if (seatChoice >= 1 && seatChoice <= 3) {
                    break;
                } else {
                    System.out.println(Main.RED + "Invalid choice. Please enter a number between 1 and 3." + Main.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Main.RED + "Invalid input! Please enter a valid number." + Main.RESET);
                sc.next();
            }
        }


        int quantity = 0;
        while (true) {
            System.out.print("Enter number of tickets (max 20): ");
            try {
                quantity = sc.nextInt();
                if (quantity > 0 && quantity <= 20) {
                    break; // valid input
                } else {
                    System.out.println(Main.RED + "Please enter a number between 1 and 20." + Main.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Main.RED + "Invalid input! Please enter a valid number." + Main.RESET);
                sc.next();
            }
        }



        String selectedSeating = seatings[seatChoice - 1];
        int pricePerTicket = getPrice(selectedSeating);
        double priceBeforeGST = pricePerTicket * quantity;
        double gst = (priceBeforeGST * 28) / 100;
        double totalPrice = priceBeforeGST + gst;


        if (BankSession.user.buyItem((int)totalPrice)){
            System.out.println("\n=====================================================");
            System.out.println("                 🎟️  TICKET DETAILS 🎟️               ");
            System.out.println("=====================================================");
            System.out.printf(" 🎬 Movie/Event        : %s%n", movies[movieChoice-1]);
            System.out.printf(" ⏰ Timing             : %s%n", timings[timeChoice-1]);
            System.out.printf(" 💺 Seating            : %s%n", seatings[seatChoice-1]);
            System.out.printf(" 🎫 Number of Tickets  : %d%n", quantity);
            System.out.println("-----------------------------------------------------");
            System.out.printf(" 💰 Price (before GST) : ₹%.2f%n", priceBeforeGST);
            System.out.printf(" 🧾 GST (28%%)           : ₹%.2f%n", gst);
            System.out.printf(" 🧾 Total Price to Pay : ₹%.2f%n", totalPrice);
            System.out.println("=====================================================\n");




            while (true) {
                System.out.println("\nWhat would you like to do next?");
                System.out.println("1. Enter to Theater");
                System.out.println("2. Continue Shopping");
                System.out.print("Enter your choice (1 or 2): ");

                try {
                    int n = sc.nextInt();
                    if (n == 1) {
                        System.out.println("Enjoy your show!");
                        return;
                    } else if (n == 2) {
                        new f4().display();
                        return;
                    } else {
                        System.out.println(Main.RED + "Invalid choice. Please try again." + Main.RESET);
                    }
                } catch (InputMismatchException e) {
                    System.out.println(Main.RED + "Invalid input! Please enter 1 or 2." + Main.RESET);
                    sc.next();
                }
            }


        }
        else{
            System.out.println("Amount Not Sufficient");
            System.out.println("1. Do you want to add money ?"); //
            System.out.println("2. Exit");
            int n = sc.nextInt();

            if(n==1){
                BankSession.startBankSession();
                display();
            }
            else if(n==2){
                System.out.println("Exiting..");

            }
            else{
                System.out.print("Enter valid inputs");

            }
        }
    }

    private int getPrice(String seating) {
        seating = seating.toLowerCase();
        if (seating.contains("regular") || seating.contains("standing")) return 150;
        if (seating.contains("premium") || seating.contains("seated")) return 250;
        if (seating.contains("vip") || seating.contains("recliner")) return 400;
        return 200;
    }
}
