import java.util.HashSet;
import java.util.Iterator;

public class Q3 {
    public static void main(String[] args) { 
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");     
        set.add(null);
        set.add(null); 

        System.out.println("HashSet elements using iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
