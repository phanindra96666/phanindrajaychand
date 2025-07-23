import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // a. Add elements
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(40);

        System.out.println("Initial TreeSet: " + treeSet);

        // b. Values less than 35 and greater than 15
        System.out.println("Values less than 35: " + treeSet.headSet(35));
        System.out.println("Values greater than 15: " + treeSet.tailSet(15, false));

        // c. Values between 15 and 45
        System.out.println("Values between 15 and 45: " + treeSet.subSet(15, 45));

        // d. First and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // e. Remove first and last
        treeSet.pollFirst();
        treeSet.pollLast();
        System.out.println("After removing first and last: " + treeSet);

        // f. Convert to descending set and add two elements
        TreeSet<Integer> descendingSet = new TreeSet<>(Collections.reverseOrder());
        descendingSet.addAll(treeSet);
        descendingSet.add(25);
        descendingSet.add(60);
        System.out.println("Descending set with new elements: " + descendingSet);

        // g. Print with descending iterator
        System.out.print("Descending order using iterator: ");
        Iterator<Integer> descItr = descendingSet.iterator();
        while (descItr.hasNext()) {
            System.out.print(descItr.next() + " ");
        }
        System.out.println();

        // h. Next greater than 25
        System.out.println("Next greater than 25: " + treeSet.higher(25));

        // i. Next lesser than 25
        System.out.println("Next lesser than 25: " + treeSet.lower(25));
    }
}
