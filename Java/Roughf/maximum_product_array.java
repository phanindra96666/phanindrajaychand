public class maximum_product_array {
    public static void main(String[] args) {
        int x = 0, y = 0;
        int max = Integer.MIN_VALUE;
        int[] arr = { 4,1,-2,5,2 };
        int n = arr.length;
    
        for (int i = 0; i < n - 1; i++) {
            int fst = arr[i];
            int nxt = arr[i + 1];
            int val = fst * nxt;
    
            if (val > max) {
                max = val;
                x = fst;
                y = nxt;
            }
        }
    
        System.out.println("[" + x + ", " + y + "]");
        System.out.println(max);
    }
}
