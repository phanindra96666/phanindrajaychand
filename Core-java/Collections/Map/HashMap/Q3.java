import java.util.LinkedHashMap;

public class Q3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Red", 1);
        map1.put("Green", 2);

        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.putAll(map1); 
        map2.put("Blue", 3);
        map2.put("Yellow", 4);

        System.out.println("Keys in combined LinkedHashMap:");
        for (String key : map2.keySet()) {
            System.out.println(key);
        }
    }
}
