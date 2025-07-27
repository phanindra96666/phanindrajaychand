import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Q4 {
    public static void main(String[] args) { 
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(4, "D");
        map.put(2, "B");

        System.out.println("Ascending order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\nDescending order:");
        NavigableMap<Integer, String> descendingMap = map.descendingMap();
        for (Map.Entry<Integer, String> entry : descendingMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
