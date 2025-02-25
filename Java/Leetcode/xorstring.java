public class xorstring {
    public static void main(String[] args) {
        String s1 = "phanind";
        String s2 = "phanin";

        int result = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            result ^= s1.charAt(i);
        }

        for (int i = 0; i < s2.length(); i++) {
            result ^= s2.charAt(i);
        }

        char extra = (char) result;
        System.out.println(extra);
    }
}
