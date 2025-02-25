public class reverse_string {
    public static void main(String args[]){
        String S = "Phani";
        String res = "";
        // char [] ch = S.toCharArray();
        for(int i=0;i<S.length();i++){
            res = S.charAt(i)+res;
        }
        System.out.println(res);
    }
}