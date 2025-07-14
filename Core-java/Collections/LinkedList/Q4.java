import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll =  new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        for(int i=0;i<ll.size();i++){
            for(int j=i+1;j<ll.size();j++) { 
                if (ll.get(i) > ll.get(j)) { 
                    int t = ll.get(i);
                    ll.set(i, ll.get(j));
                    ll.set(j, t);
                }
            }
        }

        ListIterator <Integer> lit = ll.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next()+" ");
        }
        sc.close();
    } 
}