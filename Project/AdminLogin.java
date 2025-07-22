public class AdminLogin extends LoginHandler{
    public AdminLogin() {
        super("admin123"); // Set a specific password for admin

    }
    @Override
    public boolean isLoginSuccessful(String pass) {
        return password.equals(pass);
    }
    public static int adminCheckParking() {
        int slots = Parking.getParkingAvailableForAdmin();
        System.out.println(Main.PURPLE+"Remaining parking slots: " +Main.RESET+Main.CYAN+ slots+Main.RESET);
        return slots;
    }
}