public class largest_element {
    public static int largest(int[] arr) { 
        int max = arr[0];
        for(int num : arr){
            if (num>max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] num = {10, 324, 45, 90, 9808 };
        System.out.println(largest(num));
    }
}
