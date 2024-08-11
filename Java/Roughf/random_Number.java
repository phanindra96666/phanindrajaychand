import java.util.Random;
public class random_Number {
    public static void main(String[] args) {
        Random in = new Random();
        int n = in.nextInt(10);
        System.out.println(n);

    }
}
