import java.util.HashMap;
import java.util.Scanner;

public class numbers {
    public static int hashing(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(int i:map.keySet()){
           if (map.get(i)>n/3) {
                return i;
           }
        }
           return -1;
        }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=5;
        int nums [] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }

       System.out.println("result = "+hashing(nums));
        in.close();
    }
}