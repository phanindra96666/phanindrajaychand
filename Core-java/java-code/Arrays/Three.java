import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =  {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
        int [] unique = new int[arr.length];
        int [] freq = new int [arr.length];
        int uniqueCount = 0;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            int alreadyCount=0;
            for(int j=0;j<uniqueCount;j++){
                if (arr[i]==unique[j]){
                    alreadyCount ++;
                    break;
                }
            }
            if(alreadyCount == 0){
                unique[uniqueCount] = arr[i];
                for(int j=0;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                freq[uniqueCount] = count;
                uniqueCount++;
            }
        }
        for(int i=0;i<uniqueCount;i++){
            System.out.println(unique[i] +"->"+freq[i]);
        }
    }
}


// import java.util.HashMap;

// public class Three {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
//         HashMap<Integer, Integer> freqMap = new HashMap<>();

//         for (int num : arr) {
//             freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//         }

//         for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
//             System.out.println(entry.getKey() + "->" + entry.getValue());
//         }
//     }
// }
