import java.util.*;
public class k_largest_factor {
    public static int checkfactor(int n, int k) {
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                factors.add(i);
            }
        }
        if (k <= 0 || k > factors.size()) {
            return -1; 
        }
        Collections.sort(factors,Collections.reverseOrder());
        return factors.get(k - 1);
    }
    public static void main(String[] args) {
        int n = 12;
        int k = 3;
       System.out.println(checkfactor(n,k));
    }   
}
