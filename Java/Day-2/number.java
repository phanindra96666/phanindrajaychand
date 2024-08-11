import java.util.*;
public class number {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int num = 1;
      int n = in.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }  
        System.out.println();
      }
      in.close();
    }
}