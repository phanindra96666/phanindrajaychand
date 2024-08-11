import java.util.*;
public class s {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ro= 3;
        int co= 4;

        for(int i=1;i<=ro;i++){
            for(int j=1;j<=co;j++){
                if(i==1||j==1||i==ro){
                    System.out.print("*");
                }
                else{ 
                    System.out.print(" ");
                }
                
        }
        System.out.println();
      }
      //Second part//
      for(int i=1;i<ro;i++){
        for(int j=1;j<=co;j++){
            if(j==co||i==2){
                System.out.print("*");
            }
            else{ 
                System.out.print(" ");
            }
            
    }
    System.out.println();
    in.close();
  }
    }
}
