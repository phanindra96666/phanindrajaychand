public class Word_ReverseInPlace{
    public static void main(String[] args){
        String s = " to print the all given words ";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                for (int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word = "";
            }
        }
        // for (int j = word.length() - 1; j >= 0; j--) {
        //     System.out.print(word.charAt(j));
        // }
    }
}