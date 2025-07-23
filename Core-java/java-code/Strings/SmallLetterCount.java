public class SmallLetterCount {
    public static void main(String[] args) {
        String str = "JavaProgramming123";
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        System.out.println("Lowercase letters: " + count);
    }
}
