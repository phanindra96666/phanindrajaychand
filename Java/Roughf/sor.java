import java.util.*;
public class sor {
    public static void main(String[] args) {
        String [] strs = new String[3];
        Scanner in = new Scanner(System.in);
        strs[0]="Phani";
        strs[2]="Phani";
        strs[1]="Phanindra";
        Arrays.sort(strs);
        for(int i=0;i<3;i++){
            System.out.println(strs[i]);
        }
        
        in.close();
    }
}

