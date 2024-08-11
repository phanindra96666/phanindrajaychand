import java.util.Scanner;
public class reverse_char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = "12345";
        String result = "";
        for(int i=0;i<S.length();i++){
            result = S.charAt(i)+result;
        }
        System.out.print(result);
        in.close();
    }
}
