public class N5 {
    public static void main(String[] args) {
        char[] arr = {'c', 'v', 'c', 'o', 'r', 'r', 'p'};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowel count: " + count);
    }
}
