

public class PanValidator {
    public static void main(String[] args) {
        String[] inputs = {
            "ABCDE1234F",
            "abcde1234f",
            "AB1234567C",
            "GEIPP0156L",
            "ABCDE1234FZ"
        };
        
        String name = "Phani";
        for (String input : inputs) {
            System.out.println("Input: " + input);
            if (isValidPAN(input) && input.charAt(4)==name.charAt(0)) {
                System.out.println("Valid PAN Number\n");
            } 
            else { 
                System.out.println("Not a Valid PAN Number\n");
            }
        }
    }

    public static boolean isValidPAN(String pan) {
        return pan.matches("[A-Z]{3}[CHATPE]{1}[A-Z]{1}[0-9]{4}[A-Z]");
    }

}
