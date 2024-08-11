import java.util.*;
public class arr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size= in.nextInt();
        int[] arrName= new int[size];
        //For input
        for(int i=0;i<size;i++){
             arrName[i]=in.nextInt();
        }
        //For output
        for(int i=0;i<size;i++){
            System.out.print(arrName[i]+" ");
        }
        in.close();
    }
}
