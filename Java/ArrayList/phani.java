import java.util.ArrayList;
import java.util.Collections;

public class phani {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Add list//
        list.add(3);
        list.add(2);
        list.add(0);
        System.out.println(list);

        //get list//
        int ele = list.get(0);
        System.out.println(ele);

        //adding element in between //
        list.add(1,1);
        System.out.println(list);

        //set element//
        list.set(0,5);
        System.out.println(list);

        //delete element//
        list.remove(0);
        System.out.println(list);

        //size of list//
        int size = list.size();
        System.out.println("size : "+size);

        //loop//
        for(int i=0;i<size;i++){
            System.out.print(list.get(i));
        }

        System.out.println();
        //sort list//
        Collections.sort(list);
        System.out.println(list);
    }
}