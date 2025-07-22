public class VehicleNumberValidator {
    public static void main(String[] args) { 
        // String[] inputs = {
        //     "KA01AB1234",
        //     "MH12DE1433",
        //     "DL8CAF5030",
        //     "AP02B2345",
        //     "1234AB5678"
        // };
        String inpu = "AP 37 DJ 6171";
        String input = inpu.replace(" ", "");

        // for (String input : inputs) {
            System.out.println("Input: " + input);
            if (isValidVehicleNumber(input)) {
                System.out.println("Valid Vehicle Registration Number\n");
            } else {
                System.out.println("Not a Valid Vehicle Registration Number\n");
            }
        }
    // }

    public static boolean isValidVehicleNumber(String number) {
        return number.matches("[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}");
    }
}
