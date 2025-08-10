import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("Character counts:");

        // Loop through string to find each unique character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Skip already counted characters
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            // Count occurrences of this character
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(k) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + ": " + count);
            }
        }

        sc.close();
    }
}
