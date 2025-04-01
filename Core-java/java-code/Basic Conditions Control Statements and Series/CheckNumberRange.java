import java.util.Scanner;
public class CheckNumberRange {
    public void checkNumber(int n){
        if (n>0 && n<100) {
            if (n>=90 && n<=100) {
                System.out.print("Super Smart");
            }
            else if (n>=80 && n<90) {
                System.out.print("Smart");
            }
            else if (n>=70 && n<80) {
                System.out.print("smart enough");
            }
            else if (n>=60 && n<70) {
                System.out.print("just smart");
            }
            else if (n>=35 && n<60) {
                System.out.print("no smart");
            }
            else{
                System.out.print("dump");
            }
        }
        else{
            System.out.print("invalid input");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        CheckNumberRange obj = new CheckNumberRange();
        obj.checkNumber(n);
        in.close();
    }
}
