public class findTotalsum {
    public static void main(String[] args) {
        int n = 7;
        int [] arr = {11,22,12,24,13,26,14};
        int input = 5;
        System.out.println(find(n,arr,input));
    }

    public static int find(int n, int[] arr, int input) {
        int total = 0;
        int total1 = 0;
        total += arr[input]-arr[input+1];
        total1 +=arr[input]-arr[input-1];
        int result = total+total1;
        return result;
    }

}
