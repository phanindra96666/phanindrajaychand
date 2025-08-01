public class subStrings {
    public static void isValid(String s){ 
        int i = 0;
        for(i=0;i<s.length();i++){
            if (s.indexOf(s.charAt(i),(i+1))!=-1) {
                break;
            }
        }
        if (i == s.length()) {
            System.out.println(s);
        }
    } 
    public static void main(String[] args) {
        String s = "java";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
               isValid(s.substring(i, j));
            }
        }
    }
}