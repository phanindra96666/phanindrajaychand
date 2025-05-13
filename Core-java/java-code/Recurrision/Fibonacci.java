public class Fibonacci{

    public static void fibonacci(int a, int b,int i){
        if(i>0){
            System.out.println(a);
            fibonacci(b, a+b, i-1);
        }
    }
    public static void main(String[] args) {
        fibonacci(0,1,10); 
    }

    
}
