import java.util.*;
class Q1{
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int a [] = {10,5,4,6,7,5,4,5,10,7,7};
        for(int i=0;i<a.length;i++){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        


        // Set<Integer> s = map.keySet();
        // System.out.println(s);

        // Set<Map.Entry<Integer,Integer>> p = map.entrySet();

        // for(Map.Entry<Integer,Integer> mp : map.entrySet()) {
        //     System.out.print(mp.getValue()+" ");
        //     //System.out.println(mp);
        // }
        System.out.println(map);
    }
}