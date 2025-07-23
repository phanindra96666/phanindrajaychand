public class SpecialCharCount {
    public static void main(String[] args) {
        String str = "Hello@123#World!";
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }
        System.out.println("Special characters: " + count);
    }
}
