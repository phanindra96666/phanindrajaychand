import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int a = in.nextInt();
            int result1 =0;  
            for(int i=1;i<=a;i++){
                 System.out.print(i);
                 if(i<a){
                      System.out.print("+");
                 }
                  result1+=i;
        }
        System.out.print("="+result1);
        System.out.println();
        }
        
        in.close();
    }
}
