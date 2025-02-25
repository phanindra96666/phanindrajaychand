import java.util.HashMap;
public class print_single_emelents {
    public static void main(String[] args) {
        int [] arr = {99,45,77,34,77,45};
        //int [] sum = new int[arr.length];
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
       // int index=0;
       int sum=0;
        for (int key : map.keySet()){
            if (map.get(key)==1) {
                sum+= key;
            }
        }
        System.out.println(sum);
        // for (int i = 0; i < index; i++) {
        //     System.out.println(sum[i]);
        // }
    }
}