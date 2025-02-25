package prepinsta;

public class antomorphic {
    public static void main(String[] args) {
        int n = 5;
        int pow = n*n;
        int temp = pow%10;
        if (temp == n) {
            System.out.print("True");
        }
        else{
            System.out.println("False");
        }
    }
}