import java.util.*;

class Q1{
    public static void main(String[] args){ 
        Queue<Integer> q = new LinkedList<>();
        q.offer(2);
        q.add(1);
        while (!q.isEmpty()) { 
            System.out.println(q.poll());
        }
    }
}