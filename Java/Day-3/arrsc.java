import java.util.*;
public class arrsc {
    //Find the index
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arraySearch = new int[size];
        
        for(int i=0;i<size;i++){
            arraySearch[i]=in.nextInt();
        }

        // for(int i=0;i<size;i++){
        //     System.out.print(arraySearch[i]+" ");
        // }
        System.out.print("Enter the number : ");
        int x= in.nextInt();
        for(int i=0;i<arraySearch.length;i++){
            if(arraySearch[i]==x){
                System.out.print("The Number is present: "+ i);
            }
        }
        in.close();
    }
}
