public class Solution {
    public static void main(String[] args) {
        String l ="A man, a plan, a canal: Panama";
        String s = l.toLowerCase();
        String str = "";
        
        // Build the filtered string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                str += c;
            }
        }
        System.out.println(str);
        
        // Reverse the filtered string
        String str1 = "";
        for (int i = 0; i <str.length(); i++) {
            str1 = str.charAt(i)+str1;
        }
        System.out.println(str1);
        
        // Check if the string is a palindrome
        if (str.equals(str1)) {
             System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
