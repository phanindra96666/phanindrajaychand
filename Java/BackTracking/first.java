public class first {
    public static void helper(String str, String perm, int idx) {
        if (str.length()==0) {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curchar = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            helper(newstr, perm+curchar, idx+1);
        }
    }
    
    public static void main(String[] args) {
        String str = "ABC";
        helper(str,"",0);
    }
}