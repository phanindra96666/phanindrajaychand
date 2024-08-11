import java.util.Scanner;

public class phani {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int total=0;
        for(int i=0;i<size;i++){
            int num = in.nextInt();
            total+=num;
        }
        System.out.println(total);
        in.close();
    }
}
