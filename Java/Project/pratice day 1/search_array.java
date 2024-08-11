import java.util.Scanner;
public class search_array {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Give the size : ");
        int n = in.nextInt();
        int[] myarr = new int [n];
        for(int i=0;i<n;i++){
            myarr[i]=in.nextInt();
        }
        System.out.print("Give the number to find : ");
        int a = in.nextInt();
        for(int i=0;i<n;i++){
            if(myarr[i]==a){
                System.out.println("index of the number is : " +i);
            }
        }
        in.close();
    }
}
