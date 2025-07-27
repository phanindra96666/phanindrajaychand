public class StringPrograms {

    public static void main(String[] args) {
        alternativeCharacters();
        alternativeVowels();
        longestWord();
        asciiValues();
        firstIndexOfChar();
        lastIndexOfChar();
        allIndexesOfChar();
        lowerAndUpperCase();
        substringFromIndex();
        substringBetweenIndexes();
        storeInCharArray();
        containsSubstring();
        replaceCommas();
        replaceWord();
        splitIntoWords();
        trimExample();
        stringComparison();
        equalsIgnoreCaseExample();
        dictionaryOrder();
        dictionaryOrderIgnoreCase();
    }

    // 1
    public static void alternativeCharacters() {
        System.out.println("\n1. Alternative Characters:");
        String input = "HelloWorld";
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }

    // 2
    public static void alternativeVowels() {
        System.out.println("\n2. Alternative Vowels:");
        String input = "HelloBeautifulWorld";
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                if (count % 2 == 0)
                    System.out.print(ch);
                count++;
            }
        }
        System.out.println();
    }

    // 3
    public static void longestWord() {
        System.out.println("\n3. Longest Word:");
        String input = "Java is a powerful programming language";
        String[] words = input.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word: " + longest);
    }

    // 4
    public static void asciiValues() {
        System.out.println("\n4. ASCII Values:");
        String input = "Java";
        for (char ch : input.toCharArray()) {
            System.out.println(ch + " : " + (int) ch);
        }
    }

    // 5
    public static void firstIndexOfChar() {
        System.out.println("\n5. First Index of 'a':");
        String input = "Java Programming";
        char target = 'a';
        System.out.println("First Index: " + input.indexOf(target));
    }

    // 6
    public static void lastIndexOfChar() {
        System.out.println("\n6. Last Index of 'a':");
        String input = "Java Programming";
        char target = 'a';
        System.out.println("Last Index: " + input.lastIndexOf(target));
    }

    // 7
    public static void allIndexesOfChar() {
        System.out.println("\n7. All Indexes of 'a':");
        String input = "Java Programming";
        char target = 'a';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                System.out.println("Index: " + i);
            }
        }
    }

    // 8
    public static void lowerAndUpperCase() {
        System.out.println("\n8. Lowercase and Uppercase:");
        String input = "Java Programming";
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Uppercase: " + input.toUpperCase());
    }

    // 9
    public static void substringFromIndex() {
        System.out.println("\n9. Substring from index 5:");
        String input = "Java Programming";
        int index = 5;
        System.out.println("Substring: " + input.substring(index));
    }

    // 10
    public static void substringBetweenIndexes() {
        System.out.println("\n10. Substring from index 5 to 16:");
        String input = "Java Programming";
        int start = 5, end = 16;
        System.out.println("Substring: " + input.substring(start, end));
    }

    // 11
    public static void storeInCharArray() {
        System.out.println("\n11. Character Array:");
        String input = "Java";
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            System.out.print(ch+" ");
        }
        System.out.println();
    }

    // 12
    public static void containsSubstring() {
        System.out.println("\n12. Contains Substring:");
        String input = "Java Programming";
        String search = "Program";
        System.out.println("Contains? " + input.contains(search));
        
    }

    // 13
    public static void replaceCommas() {
        System.out.println("\n13. Replace Commas with Space:");
        String input = "Java,Python,C++,C#";
        String result = input.replace(",", " ");
        System.out.println(result);
    }

    // 14
    public static void replaceWord() { 
        System.out.println("\n14. Replace Word:");
        String input = "I like Java";
        String result = input.replace("Java", "Python");
        System.out.println(result);
    }

    // 15
    public static void splitIntoWords() {
        System.out.println("\n15. Split into Words:");
        String input = "Java is fun";
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // 16
    public static void trimExample() {
        System.out.println("\n16. Trim Example:");
        String input = "   Java Programming   ";
        System.out.println("Before Trim: '" + input + "'");
        System.out.println("After Trim: '" + input.trim() + "'");
    }

    // 17
    @SuppressWarnings("StringEquality")
    public static void stringComparison() {
        System.out.println("\n17. == vs equals():");
        String s1 = "Java";
        @SuppressWarnings("RedundantStringConstructorCall")
        String s2 = new String("Java");
        System.out.println("Using == : " + (s1 == s2)); // false
        System.out.println("Using equals : " + s1.equals(s2)); // true
    }

    // 18
    public static void equalsIgnoreCaseExample() {
        System.out.println("\n18. equalsIgnoreCase:");
        String s1 = "java";
        String s2 = "JAVA";
        System.out.println("EqualsIgnoreCase: " + s1.equalsIgnoreCase(s2)); // true
    }

    // 19
    public static void dictionaryOrder() {
        System.out.println("\n19. Dictionary Order:");
        String word1 = "Apple";
        String word2 = "Banana";
        if (word1.compareTo(word2) < 0)
            System.out.println(word1 + " comes first");
        else
            System.out.println(word2 + " comes first");
    }

    // 20
    public static void dictionaryOrderIgnoreCase() {
        System.out.println("\n20. Dictionary Order (Ignore Case):");
        String word1 = "apple";
        String word2 = "Banana";
        if (word1.compareToIgnoreCase(word2) < 0)
            System.out.println(word1 + " comes first");
        else
            System.out.println(word2 + " comes first");
    }
}