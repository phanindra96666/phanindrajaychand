public class remove_whitespaces {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "Phan  i ndra";
        char [] charArray = s.toCharArray();
        for (char c : charArray) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}