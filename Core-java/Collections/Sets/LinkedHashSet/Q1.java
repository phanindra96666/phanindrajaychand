import java.util.Iterator;
import java.util.LinkedHashSet;

public class Q1 { 

    public static void main(String[] args) { 
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(set1);
        set2.add(40);
        set2.add(50);

        Iterator<Integer> iterator = set2.iterator();
        int sum = 0;
        System.out.println("Values in LinkedHashSet:");
        while (iterator.hasNext()) { 
            int value = iterator.next();
            System.out.print(value + " ");
            sum += value;
        } 

        System.out.println("\nSum of values: " + sum);
    } 
} 