import java.util.*;
import java.lang.Math;  
public class Amstrong {
     public static boolean findAmstrong(int n){
        int total=0;
        int digit = 0;
        int temp = n;
        int last=0; 
        digit= (int) Math.log10(n)+1;
        while(temp>0){
        last= temp%10;
        total += (Math.pow(last, digit));
        temp/=10;
        }
        if(n==total){
            return true;
        }
        else{
            return false;
        } 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(findAmstrong(n)){
        System.out.print("True");
        }
        else{
            System.out.println("False");
        }
        in.close();
        }
    }