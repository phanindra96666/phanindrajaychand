public class ProductSmallestPair {
    public static void main (String [] args){
        int sum = 9 , n = 7 , min = Integer.MAX_VALUE ,secondMin=0;
        int [] arr = {5,2,4,3,9,7,1};
        for (int i = 0; i < n; i++) {
            if (min>arr[i]){
                secondMin = min;
                min = arr[i];
            }
            else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i]; 
            }
        }
        int result = 0;
        if (min+secondMin<sum) {
            result=min*secondMin;
        }
        System.out.println(result);
    }
}
