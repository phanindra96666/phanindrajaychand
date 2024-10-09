public class Fibonacci_series {
    // public static void checkFibonacci(int num, int a, int b) {
    //     if (a > num) {
    //         return;
    //     }
    //     System.out.print(a + " ");
    //     int c = a+b;
    //     checkFibonacci(num, b, c);
    // }
    public static void main(String[] args) {
        int num = 15;
        int a = 0, b = 1;
    
        // Here we are printing 0th and 1st terms
        System.out.print(a + "," + b + ",");
    
        int nextTerm;
    
        // printing the rest of the terms here
        for (int i = 2; i < num; i++) {
          nextTerm = a + b;
          a = b;
          b = nextTerm;
          System.out.print(nextTerm);
          if (i!=num-1) {
            System.out.print(',');
          }
        }
    }

    
}
