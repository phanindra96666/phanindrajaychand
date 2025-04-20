import java.util.*;
class PowerNumber{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int power = in.nextInt();
        int pow = power;
        int result = 1;
        if(base<=0 || power<=0){
            System.out.print("Invalid Inputs");
        }
        else{
            while(power!=0){
                result*=base;
                power--;
            }
            System.out.print(base+" Power "+ pow+" value is "+result+".");
        }
    }
}