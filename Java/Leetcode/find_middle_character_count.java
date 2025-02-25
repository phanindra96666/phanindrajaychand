public class find_middle_character_count {
    public static void main(String[] args) {
        String s = "examination";
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        int midIndex = s.length()-2;
        System.out.println(first + "" + midIndex + "" + last);
    }
}