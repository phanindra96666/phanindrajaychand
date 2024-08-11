import java.util.*;
public class ne {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String A = in.next();
        // String B = in.next();
        // Convert a string into a character array.
        String str = "Hello, world!";
        char[] chars = str.toCharArray();
        System.out.println(chars);
        // Convert a collection into an array.
        List<String> list = Arrays.asList("Hello", "world!");
        String[] strings = list.toArray(new String[0]);
        System.out.print(Arrays.toString(strings));
    }
}
