public class NumberIndexFinder {
    public static void main(String[] args) {
        String str = "abc12x4y9";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println("Digit: " + str.charAt(i) + ", Index: " + i);
            }
        }
    }
}
