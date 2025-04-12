public class NumberPattern {
        public static void main(String[] args) {
        int rows = 6;
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= r; c++) { 
                int n = r - c; 
                int value = c + 6*n-(n*(n-1))/2;
                System.out.print(value + " ");
            } 
            System.out.println(); 
        } 
    }
}