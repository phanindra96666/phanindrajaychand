import java.util.*;
public class mail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mail = in.next();
        String name = "";
        
        for(int i=0;i<=mail.length();i++){
            if(mail.charAt(i)=='@'){
                break;
            }
            else{
                name+=mail.charAt(i);
            }
        }
        System.out.println(name);
    }
}
