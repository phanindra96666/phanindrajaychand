public class rev {
    public static void main(String[] args) {
        int n =1234;
        String result="";
        int a = 0;
        int digits = (int) Math.log10(n)+1;
        for(int i=0;i<digits;i++){
            a=n%10;
            result=result+a;
            n=n/10;
        }
        System.out.println(result);
    }
}