import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll =  new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        // ll.remove(0);
        // ll.remove(n-1);
        ll.removeFirst();
        ll.removeLast(); 
        
        ListIterator <Integer> lit = ll.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next()+" ");
        }
        sc.close();
    }
} 
