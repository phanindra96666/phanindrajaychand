public class Main {
    public static int [] minmax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if (i<min) {
                min=i;
            }
            if (i>max){
                max=i;
            }
        }
        return new int [] {min,max};
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,3,1,9};
        int [] result = minmax(arr);
        System.out.println(result[0]+" "+result[1]);
    }
}