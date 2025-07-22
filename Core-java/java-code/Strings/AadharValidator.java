public class AadharValidator {

    public static String validateAadhar(String input) {
        if (input.matches("\\d{4} \\d{4} \\d{4}")) {
            return "Valid Aadhar Number";
        } 
        else {
            return "Not a Valid Aadhar Number";
        }
    }

    public static void main(String[] args) {
        String input = "0123 3456 7891";
        System.out.println("Input: " + input);
        System.out.println("Output: " + validateAadhar(input));
    }
}
