import java.util.*;
public class odd_balloons {
    public static void main(String args[]){
        String[] b = {"a", "b", "b", "b", "c", "c", "c", "a", "f", "c"};
       
        Map<String, Integer> countMap = new HashMap<>();
        for (String color : b) {
            countMap.put(color,countMap.getOrDefault(color, 0)+1);
        }
        for (Map.Entry<String,Integer> entry : countMap.entrySet()) {
            if (entry.getValue()%2!=0) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}