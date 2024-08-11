import java.util.Scanner;
public class remove_whitespaces {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String result = "";
        result = S.replaceAll("\\s", "");
        System.out.print(result);
        in.close();
    }
}
