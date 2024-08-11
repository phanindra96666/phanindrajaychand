import java.util.*;
public class mm {
  public static void main(String[] args) {
  Scanner in =new Scanner(System.in);
  int n = 5;
  int [] arr = new int [n];
  for(int i=0;i<n;i++){
  arr[i]= in.nextInt();
  }
  for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");  
    }
    in.close();
  }
}