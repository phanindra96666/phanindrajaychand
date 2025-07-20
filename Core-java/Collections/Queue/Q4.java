
import java.util.Collections;
import java.util.PriorityQueue;

public class Q4 {
    public static void main(String[] args) {
        int a [] = {10,20,5,7,8,10,11,5,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1;i<a.length-1;i++){
            pq.offer(a[i-1]);
            pq.offer(a[i]);
            pq.offer(a[i+1]);
            System.out.print(pq.poll()+" ");
            pq.clear();
        }
    }
}
