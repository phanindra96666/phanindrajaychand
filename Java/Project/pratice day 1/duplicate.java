import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        char[] ch = S.toCharArray();
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<S.length();j++){
                if(ch[i]==ch[j]){
                    System.out.println(ch[i]);
                }
            }
        }
        in.close();
    }
}