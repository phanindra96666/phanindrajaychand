public class permitations_type {
    public static void printPermitations(String str,int idx,String perm){   
        if (str.length()==0) {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curChar = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            printPermitations(newString, idx+1, perm+curChar);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermitations(str, 0, "");
    }
}
