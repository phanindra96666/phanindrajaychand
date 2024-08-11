import java.util.Scanner;
public class accenture {
    public static int myfun(int x,int y){
        int clock = x*y;
        if (clock<=12){
            return clock;
        }
        else{
            clock=clock-12;
        }
        return clock;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int result = myfun(x, y);
        System.out.print(result);
        in.close();
    }
}