public class subStrings1 {
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
        for(int i=s.length()-1;i>=0;i--){
            for(int j=0;j+i<=s.length();j++){
                System.out.println(s.substring(j,i+j));
            }
        }
    }
}