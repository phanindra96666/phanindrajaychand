import java.util.*;
public class second {
    public static int oddFun(int n){
        int su=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                su=su+i;
            }
        }
        return su; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=oddFun(n);
        System.out.println(a);
    }
}


