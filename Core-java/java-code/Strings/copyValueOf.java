public class copyValueOf {
    public static void main(String[] args) {
        char ch [] = {'M','O','N','K','E','Y'};
        String s = String.copyValueOf(ch);
        System.out.println(s);
    }
}