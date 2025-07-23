public class CategoryPrinter {
    public static void main(String[] args) {
        String str = "aB1$cD2@eF3";
        StringBuilder small = new StringBuilder();
        StringBuilder capital = new StringBuilder();
        StringBuilder special = new StringBuilder();
        StringBuilder digit = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) small.append(ch);
            else if (Character.isUpperCase(ch)) capital.append(ch);
            else if (Character.isDigit(ch)) digit.append(ch);
            else special.append(ch);
        }

        System.out.println("Small: " + small);
        System.out.println("Capital: " + capital);
        System.out.println("Special: " + special);
        System.out.println("Digits: " + digit);
    }
}
