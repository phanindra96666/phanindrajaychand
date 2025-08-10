import java.util.Scanner;

public class commonUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = sc.nextLine();
        
        String[] s1 = s.split(" ");
        String[] s2 = ss.split(" ");
        
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];

            if (countOccurrences(s1, word) == 1) {

                if (countOccurrences(s2, word) == 1) {

                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (s1[k].equals(word)) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (!alreadyPrinted) {
                        System.out.println(word);
                    }
                }
            }
        }
    }

    public static int countOccurrences(String[] arr, String target) {
        int count = 0;
        for (String str : arr) {
            if (str.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
