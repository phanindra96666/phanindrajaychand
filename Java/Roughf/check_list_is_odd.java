import java.util.Scanner;
public class check_list_is_odd {
    public static boolean checkOdd(int arr){
        if(arr%2==0){
            return  false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//size
        int [] arr = new int[a];
        for(int i=1;i<a;i++){
            arr[i]=in.nextInt();
        
        if(checkOdd(arr[i])){
            System.out.println(i+" Its odd");
        }
        else{
            System.out.println(i+" Its not odd");
        }
    }
    in.close();
    }
}
