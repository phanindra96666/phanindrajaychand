import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Parking {
    static Scanner sc = new Scanner(System.in);
    private static int parkingAvailable = 100;
    static int vehicleType = 0; // 1: Self, 2: Bike, 3: Car
    static LocalDateTime entryTime;
    static LocalDateTime exitTime;

    public static void display() {
        while (true) {
            System.out.println(Main.BLUE + "1 : Self");
            System.out.println("2 : Two - Wheeler");
            System.out.println("3 : Four - Wheeler" + Main.RESET);

            String input = Main.scanner.next();
            int choice = 0;

            if (Main.isNumeric(input)) {
                choice = Integer.parseInt(input);
            } else {
                System.out.println(Main.RED + "Invalid input. Please enter a valid number." + Main.RESET);
                continue;
            }

            switch (choice) {
                case 1:
                    vehicleType = 1;
                    System.out.println(Main.PURPLE + "Self park selected. No slot used." + Main.RESET);
                    return;
                case 2:
                    vehicleType = 2;
                    break;
                case 3:
                    vehicleType = 3;
                    break;
                default:
                    System.out.println(Main.BG_YELLOW + "Please select a valid parking type." + Main.RESET);
                    continue;
            }

            if (parkingAvailable > 0) {
                parkingAvailable--;
                entryTime = LocalDateTime.now();
                System.out.println(Main.PURPLE + "Parking successful." + Main.RESET);
                System.out.println(Main.GREEN + "Timer started at: " + entryTime + Main.RESET);
                return;
            } else {
                System.out.println(Main.CYAN + "Parking Full." + Main.RESET);
                return;
            }
        }
    }

    // Admin-only access method
    static int getParkingAvailableForAdmin() {
        return parkingAvailable;
    }

    public static void okParking() {
        if (Buy.getBill() >= 100) {
            System.out.println(Main.GREEN + "No Money For Parking." + Main.RESET);
            System.out.println(Main.BRIGHT_PURPLE + "THANK YOU VISIT AGAIN" + Main.RESET);
            return;
        }

        exitTime = LocalDateTime.now();
        System.out.println(Main.GREEN + "Exit time: " + exitTime + Main.RESET);

        if (vehicleType == 2 || vehicleType == 3) {
            Duration duration = Duration.between(entryTime, exitTime);
            long minutes = duration.toMinutes();
            double hours = Math.ceil(minutes / 60.0);

            int rate = (vehicleType == 2) ? 50 : 100;
            int totalCost = (int) (hours * rate);

            System.out.println(Main.GREEN + "Parking Duration: " + minutes + " minutes (~" + (int) hours + " hour(s))" + Main.RESET);
            System.out.println(Main.GREEN + "Please pay ₹" + totalCost + " for parking." + Main.RESET);
        } else {
            System.out.println(Main.GREEN + "No Money For Parking." + Main.RESET);
        }

        System.out.println(Main.BOLD + Main.BRIGHT_PURPLE + "THANK YOU VISIT AGAIN" + Main.RESET);
    }
}
