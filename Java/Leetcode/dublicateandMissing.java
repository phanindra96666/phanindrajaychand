public class dublicateandMissing {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4};
        int n = arr.length;
        missingdublicate(arr,n);
    }

    public static void missingdublicate(int[] arr,int n) {
        int dub = 0;
        int mis = 0;
        int [] newArr = new int[n+1]; // 5 zeros becouse of +1;
        for(int i=0;i<arr.length;i++){
           newArr[arr[i]]++; //0 1 2 0 1
           System.out.print(newArr[i]);
        }
        System.out.println();
        for(int i=1;i<newArr.length;i++){
            System.out.print(newArr[i]);
            if (newArr[i]==2) {
                dub = newArr[i];
            }
            if (newArr[i]==0) {
                mis = i;
            }
        }
        System.out.println();
        System.out.println(dub +" "+mis);
    }
}
