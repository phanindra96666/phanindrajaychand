import java.util.Arrays;
public class middle {
    public static void main(String[] args) {
        int [] arr = {7,-3,8,2,-5,10,12};
        // for count how many postive number are in array
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                count++;
            }
        }
        //create a new array by the size of count(Postive numbers)
        int [] newarr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newarr[index++] = arr[i];
            }
        }
        Arrays.sort(newarr);
        int mid = newarr.length/2;
        System.out.println(newarr[mid]);
    }
}