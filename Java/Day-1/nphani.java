import java.util.Scanner;

public class nphani {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%2==0){
            System.out.print("Its even");
        }
        else{
            System.out.print("its odd");
        }
        in.close();
    }
}
