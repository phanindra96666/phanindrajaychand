import java.util.*;
class Q17 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int p1 = 0;
        int p2 = 0;
        int c  = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){ 
            al.add(sc.nextInt());
        } 
        while (!al.isEmpty()) { 
            int t = al.remove(0);
            if (c%2==0) { 
                p1 += t;
            } 
            else{ 
                p2 += t;
            } 
            c++;
            if (t%2==0) { 
                Collections.reverse(al);
            } 
        } 
        System.out.print(Math.abs(p1-p2));
        sc.close();
    } 
} 