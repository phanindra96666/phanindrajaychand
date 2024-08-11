import java.util.*;
public class func{
    public static void printMyName(String name){
        System.out.print("My name is:"+name);
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        printMyName(name);
        in.close();
    }

}