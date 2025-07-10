public class N8 {
    public static void main(String[] args) {
        String input = "CVCORP";

        while (input.length() >= 2) {
            System.out.println(input);
            input = input.substring(0, input.length() - 1);
        }
    }
}