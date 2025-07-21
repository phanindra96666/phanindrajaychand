import java.util.*;

public class Max_Characters {
    public static void main(String[] args) {
        String input = "phpaqutxp";
        System.out.println(reorderMaxCharFirst(input)); 
    }

    public static String reorderMaxCharFirst(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = 0;
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxFreq; i++) {
            result.append(maxChar);
        }

        for (char c : s.toCharArray()) {
            if (c != maxChar) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
