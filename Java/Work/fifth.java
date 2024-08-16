import java.util.*;
public class fifth {
    public static void agaCheck(int n){
        if(n>=18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            agaCheck(n);
        in.close();
    }
}
