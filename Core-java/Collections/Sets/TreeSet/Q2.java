import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(30);
        set.add(5);
        set.add(19);
        System.out.println(set);

        Iterator itr = set.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
