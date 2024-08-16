public class stringbuilder {
    public static void main(String[] args) {
        String S = "1.1.1.1.1";
        StringBuffer sb = new StringBuffer(S.length());
        for(int i=0;i<S.length();i++){
            if (S.charAt(i)!='.') {
                sb.append(S.charAt(i)+"");
            }
            else{
                sb.append("[.]");
            }
        }
        System.out.print(sb);
    }
}
