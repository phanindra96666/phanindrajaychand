import java.util.*;
public class minmax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] minMaxArray = new int[size];

        for(int i=0;i<size;i++){
            minMaxArray[i]=in.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<minMaxArray.length;i++){
            if(minMaxArray[i]<min){
                min=minMaxArray[i];
            }
            if(minMaxArray[i]>max){
                max=minMaxArray[i];
            } 
            
        }
        System.out.println("its max number:"+ max);
        System.out.print("its min number:"+ min);
    }

}
