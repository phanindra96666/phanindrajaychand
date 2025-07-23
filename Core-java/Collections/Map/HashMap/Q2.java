import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");

        String searchKey = "B";
        if (map.containsKey(searchKey)) {
            System.out.println("Key '" + searchKey + "' is present in the map.");
        } 
        else {
            System.out.println("Key '" + searchKey + "' is NOT present in the map.");
        }

        System.out.println("\nAll key-value pairs (using entrySet):");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\nOnly keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
