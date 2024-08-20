public class bit {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1,4};
        int result=0;
        for(int num:arr){
            result^=num;
        }
        System.out.println(result);
    }
}
