import java.util.LinkedHashSet;

public class Q2 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 40, 20, 50, 30};

        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
    
}
