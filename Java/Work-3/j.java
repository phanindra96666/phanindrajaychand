import java.util.*;
public class j {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
            while(in.hasNext()){ 
                int sum = 0;
                StringBuilder equ = new StringBuilder();
                for(int i=1;i<=N;i++){
                    int currentNum = in.nextInt();
                    sum+=currentNum;
                    equ.append(currentNum);
                    if(i<N){
                        equ.append("+");
                    }
                }
                System.out.print(equ + "=" + sum);
        }
        in.close();
    }
}
