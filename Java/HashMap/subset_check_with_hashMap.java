import java.util.HashMap;
public class subset_check_with_hashMap {
    public static boolean issubString(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr1){
            map.put(i, map.getOrDefault(i,0) +1);
        }
        for(int i:arr2){
            if (!map.containsKey(i) || map.get(i) == 0) {
                return false;
            }
            map.put(i,map.get(i)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr1 = {11,1,13,21,3,7,7,7};
        int [] arr2 = {11,3,7,7,1};
        System.out.println(issubString(arr1,arr2)?"Yes":"No");
    }
}
