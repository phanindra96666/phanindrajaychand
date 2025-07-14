import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll =  new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        ll.remove(ll.size()/2);
        if(ll.size()%2==1){
            ll.remove(ll.size()/2);
        }
        ListIterator <Integer> lit = ll.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next()+" ");
        }
        sc.close();
    }
}