import java.util.Scanner;
public class NumberSequence3 {
    public static void main(String[] args) {//6 7 12 14 18 21 24 28 30 35
        Scanner in = new Scanner(System.in);
        int n = 11;
        int j=1;
        for(int i=1;i<n;i++){
            if (i%2==0) {
                System.out.print((7*j)+" ");
                j++;
            }
            else if(i%2==1){
                System.out.print((6*j)+" ");
            }
        }
        in.close();
    }
}