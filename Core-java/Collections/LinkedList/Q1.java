import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll =  new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        ll.remove(2);
        ll.add(2,5);
        ll.set(3, 15);
        ListIterator <Integer> lit = ll.listIterator();
        
        while (lit.hasNext()) {
            System.out.print(lit.next()+" ");
        }

        while (lit.hasPrevious()) {
            System.out.print(lit.previous()+" ");
        }
        sc.close();
    }
}