public class maxsubarray {
    public static void main(String[] args) {
        int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
        int max=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if (temp<0){
                temp=arr[i];
            }
            else{
                temp+=arr[i];
            }
            if (temp>max) {
                max=temp;
            }                
        }
        System.out.println(max);
    }
}
