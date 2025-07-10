import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        
        while (true) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                al.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        
        System.out.println(al);
    }
}
