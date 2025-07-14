import java.util.*;
public class Q6 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> al = new LinkedList<>();
        LinkedList<Integer> al1 = new LinkedList<>();
        
        for(int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        for(int i = 0;i < n; i++){
            int c  = 0;
            if (al.get(i) == -1) {
                continue;
            }
            int current = al.get(i);
            for(int j = 0; j < n; j++){
                if (al.get(j) == current) {
                    c++;
                    al.set(j, -1);
                }
            }
            for(int j = 0;j < c; j++){
                al1.add(current);
            }
        }
        System.out.println(al1);
        sc.close();
    }
}