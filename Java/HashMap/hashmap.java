import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String , String> hm = new HashMap<String,String>();
        hm.put("Ap", "Eluru");
        hm.put("Maharastra", "Puna");
        hm.put("Delhi", "New Delhi");
        hm.put("Ts","HYD");
        hm.put("West Bengel", "Kolkata");

        for(String i : hm.values()){
            System.out.println(i);
        }
        System.out.println();
        for(String i : hm.keySet()){
            System.out.println(i);
        }
        

        // System.out.println(hm);
        // System.out.println(hm.get("Ts"));   
        // hm.remove("Ts");
        // System.out.println(hm);
        // System.out.println(hm.size());
        // hm.clear();
        // System.out.println(hm);
    }
}