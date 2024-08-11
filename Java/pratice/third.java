import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int m = Integer.MIN_VALUE; 
        while (num > 0){
            num--;
        
            int a = sc.nextInt();
            if (a > m){
                m = a; 
                count++;
            }
        }
        System.out.println("The count:"+count);
        sc.close();
    }
}
