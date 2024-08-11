public class Check_Amstrong {
    public static void main(String [] args){
        int n = 153;
        int result = 0;
        int temp = 0;
        int original = n;
        int digit = (int)Math.log10(n)+1;
        while (n!=0){
            temp = n%10;
            result += (int)Math.pow(temp, digit);
            n=n/10;
        }
        System.out.println(result);
        if (result==original) {
            System.out.print("True");
        }
        else{
            System.out.println("False");
        }
    }
}
