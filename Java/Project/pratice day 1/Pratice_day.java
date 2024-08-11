import java.util.Scanner;
public class Pratice_day {
    public static String Myfun(String S){ 
        String arr[] = new String[10];
        arr =S.split(" ");
        String result="";
        for(int i=0;i<arr.length;i++){
            result=arr[i]+" "+result;    
        }
        return result;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String h = Myfun(S);
        System.out.print(h);
        in.close();
    }
}