public class TrianglePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i <= n) ? i : (2 * n - i); 

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    // for (int i = 1,j=1; i <= 2 * n - 1; j++) {
    //     System.out.print("0");
    //     if(i==j || 2*n-j==i)
    //     {
    //         System.out.println();
    //         i++;
    //         j=0;
    //     }
    // }

    }
}