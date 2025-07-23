
import java.util.LinkedList;

public class Q18 {
    public static void main(String[] args) {
        int a [] = {10,5,4,10,4,5,7,7,9,11,9,7};
        LinkedList ll = new LinkedList<>();
        for(int i=0; i < a.length; i++) {
            int t = ll.indexOf(a[i]);
            if (t == -1) {
                ll.add(a[i]);
            }
            else{
                ll.add(t,a[i]);
            }

        }
        System.out.println(ll);
    }
}
