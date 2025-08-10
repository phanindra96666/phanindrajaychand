// public class countWordsOnBoard {
//     public static void main(String[] args) {
//         String s = "I   am   the  Programmer   ";
//         int count = 0;
//         boolean inWord = false;

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) != ' ') {
//                 if (!inWord) {
//                     count++;
//                     inWord = true;
//                 }
//             } else {
//                 inWord = false;
//             }
//         }

//         System.out.print(count);
//     }
// }

public class countWordsOnBoard {
    public static void main(String[] args) {
        String s = "Sh#C15c10qh$i";
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } 
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        String result = new String(arr);
        System.out.println(result); 
    }
}
