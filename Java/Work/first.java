
import java.util.*;
public class first {
    public static int numAvg(int a,int b,int c){
        int total=3;
        int av = a+b+c;
        int avg=av/total;
        return avg;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            int avg=numAvg(a,b,c);
            System.out.println(avg);

        }
    }

