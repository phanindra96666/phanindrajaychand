import java.util.*;
public class team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        String [] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i]=in.next();
        }

        HashMap <String,Integer> map = new HashMap<>();

        for (String team : arr) {
            map.put(team, map.getOrDefault(team, 0) + 1);
        }

        int max=0;
        String maxx = null;
        

        for (Map.Entry<String,Integer> entry : map.entrySet()){ 
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxx = entry.getKey();
            }
        }
        System.out.println("Team with the highest frequency: " + maxx + " with count " + max);
        in.close();
    }
}
