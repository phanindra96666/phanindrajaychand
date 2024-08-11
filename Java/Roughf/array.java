import java.util.Scanner;
public class array {

    public static void checkVowel(String [] arr){
        for(String words : arr){
            boolean cv = false;
            for(int i=0;i<words.length();i++){
                char c = words.charAt(i);
                if (Character.toString(c).matches("[aeiouAEIOU]")) {
                    cv = true;
                    break;
                }
            }
            if (cv) {
                System.out.println("Alex");
            }
            else{
                System.out.println("Chris");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String [] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = in.next();
        }
        checkVowel(arr);
        in.close();
    }
}