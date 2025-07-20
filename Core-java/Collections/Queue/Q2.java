import java.util.*;

class Q2{
    public static void main(String[] args){ 
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(2);
        q.add(1);
        while (!q.isEmpty()) { 
            System.out.println(q.poll());
        }
    }
}