public class one {
    public static void main (String args[]){
        int [] e = {7,0,5,1,3};
        int [] l = {1,2,1,3,4};
        int result = 0;
        int max = 0;
        for (int i = 0; i < l.length; i++) {
            result = (e[i]+result)-l[i];
            max = Math.max (result, max);
        }
        System.out.print(max);
    }
}