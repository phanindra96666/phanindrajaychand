public class score_of_a_string {
    public static void main(String[] args) {
        int result=0;
        String S = "hello";
        for(int i=1;i<S.length();i++){
            int dif = S.charAt(i)-S.charAt(i-1);
            result += Math.abs(dif);
        }
        System.out.print(result);
    }
}