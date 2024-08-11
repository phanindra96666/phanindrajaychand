import java.util.Scanner;
public class minmaxmaxmin {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Give the size :");
    int n = in.nextInt();
    int[] myarr = new int [n];
    for(int i=0;i<n;i++){
        myarr[i]=in.nextInt();
    }
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(myarr[i]>max){
            max=myarr[i];
        }
        if(myarr[i]<min){
            min=myarr[i];
        }
    }
    System.out.println("max :"+max);
    System.out.println("min :"+min);
    in.close();
}
}


