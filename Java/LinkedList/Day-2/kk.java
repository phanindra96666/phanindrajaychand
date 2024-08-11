import java.util.Collections;
import java.util.LinkedList;

public class kk {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i : list){
            System.out.print(i+"==>");
        }
        System.out.println("Null");
        Collections.reverse(list);
        for(int i : list){
            System.out.print(i+"==>");
        }
        System.out.println("Null");
    }
}
