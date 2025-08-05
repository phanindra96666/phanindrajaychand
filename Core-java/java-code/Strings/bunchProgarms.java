public class bunchProgarms {

    // 51. Print common words in two strings (duplicates allowed)
    public static void commonWords(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        System.out.println("Common words :");
        for (int i = 0; i < arr1.length; i++) { 
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                    arr1[i] = "";
                    arr2[j] = "";
                    break; 
                }
            }
        }
    }

    // 52. Print common unique words in two strings
    public static void commonUniqueWords(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        // Use simple arrays + manual check for unique
        System.out.println("Common unique words:");
        for (int i = 0; i < arr1.length; i++) {
            boolean isCommon = false;
            boolean alreadyPrinted = false;

            // Check if arr1[i] is in arr2
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    isCommon = true;
                    break;
                }
            }

            if (isCommon) {
                // Check if printed before in arr1[0..i-1]
                for (int k = 0; k < i; k++) {
                    if (arr1[i].equals(arr1[k])) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    // 53. Print all words in two strings by one time only (unique combined)
    public static void allUniqueWords(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        System.out.println("All unique words combined:");
        // Print all unique from arr1
        for (int i = 0; i < arr1.length; i++) {
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i].equals(arr1[k])) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                System.out.println(arr1[i]);
            }
        }
        // Print all unique from arr2 but not in arr1
        for (int i = 0; i < arr2.length; i++) {
            boolean inArr1 = false;
            boolean alreadyPrinted = false;
            for (int k = 0; k < arr2.length; k++) {
                if (i != k && arr2[i].equals(arr2[k]) && k < i) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) continue;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i].equals(arr1[j])) {
                    inArr1 = true;
                    break;
                }
            }
            if (!inArr1) {
                System.out.println(arr2[i]);
            }
        }
    }

    // 54. Print all words in two strings in sorted order (simple lex sorting)
    public static void allWordsSorted(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        // Combine both arrays into one
        int n = arr1.length + arr2.length;
        String[] combined = new String[n];
        for (int i = 0; i < arr1.length; i++) combined[i] = arr1[i];
        for (int i = 0; i < arr2.length; i++) combined[arr1.length + i] = arr2[i];

        // Simple Bubble sort (lexicographical)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (combined[j].compareTo(combined[j + 1]) > 0) {
                    String temp = combined[j];
                    combined[j] = combined[j + 1];
                    combined[j + 1] = temp;
                }
            }
        }

        System.out.println("All words sorted:");
        for (int i = 0; i < n; i++) {
            System.out.println(combined[i]);
        }
    }

    // 55. Print given string 3 characters per line
    public static void printThreeCharsPerLine(String s) {
        int len = s.length();
        for (int i = 0; i < len; i += 3) {
            if (i + 3 <= len)
                System.out.println(s.substring(i, i + 3));
            else
                System.out.println(s.substring(i)); // remaining chars
        }
    }

    // 56. Print string characters as example
    /*
      Input: "I am preparing myself for MNC’s and Product based companies."
      Output:
      I
      am
      pre
      pari
      ngmys
      elffor
      MNC’san
      dProduct
      basedcomp
      anies.
    */
    public static void printCustomPattern(String s) {
        // Given output, lengths per line: 1, 2, 3, 4, 5, 6, 7, 8, 9, 6
        int[] lengths = {1, 2, 3, 4, 5, 6, 7, 8, 9, 6};
        int index = 0;
        for (int i = 0; i < lengths.length; i++) {
            int end = index + lengths[i];
            if (end > s.length()) end = s.length();
            System.out.println(s.substring(index, end));
            index = end;
            if (index >= s.length()) break;
        }
    }

    public static void main(String[] args) {
        String s1 = "green red red blue green yellow green yellow";
        String s2 = "red yellow red blue white red green";

        // 51
        commonWords(s1, s2);
        System.out.println();

        // // 52
        // commonUniqueWords(s1, s2);
        // System.out.println();

        // // 53
        // allUniqueWords(s1, s2);
        // System.out.println();

        // // 54
        // allWordsSorted(s1, s2);
        // System.out.println();

        // // 55
        // System.out.println("3 chars per line:");
        // printThreeCharsPerLine("HelloWorldThisIsJava");
        // System.out.println();

        // // 56
        // System.out.println("Custom pattern output:");
        // printCustomPattern("IampreparingmyselfforMNC’sandProductbasedcompanies.");
    }
}
