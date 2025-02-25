import java.util.Scanner;
public class fun {
        static int pos_count=0;
        static int neg_count=0;
        static int count=0;
     public static void myfun(int n){        
            if(n>0){
                pos_count++;
                System.out.println("Positive ="+pos_count);
            }
            else if(n<0){
                neg_count++;
                System.out.println("Negative ="+neg_count);
            }
            else{
                count++;
                System.out.println("Zero ="+count);
            }
        return;
       
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            myfun(n);
        }
        in.close();
    }
}
