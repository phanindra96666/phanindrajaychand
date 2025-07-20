import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q2 {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("2023-08-15");
        queue.add("2021-05-22");
        queue.add("2022-02-10");
        queue.add("2023-01-01");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        List<LocalDate> dateList = new ArrayList<>();

        for (String dateStr : queue) {
            LocalDate date = LocalDate.parse(dateStr, formatter);
            dateList.add(date);
        }

        Collections.sort(dateList);

        queue.clear();
        for (LocalDate date : dateList) {
            queue.add(date.toString());
        }

        System.out.println("Sorted queue: " + queue);
    }
}