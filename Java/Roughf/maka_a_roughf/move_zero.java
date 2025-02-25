public class move_zero {
    public static void main(String[] args){
        int [] arr = {0,1,0,3,12};
        int xx = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                arr[xx]=arr[i];
                xx++;
            }
        }
        for(int i=xx;i<arr.length;i++){
            arr[i]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}