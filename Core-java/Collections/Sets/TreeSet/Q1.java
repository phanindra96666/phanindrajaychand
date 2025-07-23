import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();

        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }

        if (set1.equals(set2)) {
            System.out.println("anagrams ");
        } else {
            System.out.println("Not anagrams");
        }
    }
}
