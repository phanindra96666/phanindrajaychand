public class right_largest {
    public static void main(String[] args) {
        int [] arr = {16,5,8,7,2};
        int count = 1;
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>0;i--){
           if (arr[i-1]>max){
                count+=1;
                max=arr[i-1];
           }
        }
        System.out.println(count);
    }
}