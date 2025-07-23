import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        TreeSet<Double> salaries = new TreeSet<>();

        // Add multiple employee salaries
        salaries.add(45000.0);
        salaries.add(60000.0);
        salaries.add(52000.0);
        salaries.add(70000.0);
        salaries.add(30000.0);

        System.out.println("Employee Salaries: " + salaries);

        // Display highest and lowest salary
        System.out.println("Lowest Salary: " + salaries.first());
        System.out.println("Highest Salary: " + salaries.last());

        // Display range of salaries
        System.out.println("Salary Range: " + salaries.first() + " - " + salaries.last());

        // Salaries less than 55000
        System.out.println("Salaries less than 55000: " + salaries.headSet(55000.0));

        // Salaries greater than 50000
        System.out.println("Salaries greater than 50000: " + salaries.tailSet(50000.0, false));
    }
}
