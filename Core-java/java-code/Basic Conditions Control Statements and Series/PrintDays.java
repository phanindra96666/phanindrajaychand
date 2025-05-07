import java.time.*;
import java.util.Scanner;

public class PrintDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String input2 = sc.nextLine();

        String[] sDate = input.split(":");
        String[] eDate = input2.split(":");

        int startDay = Integer.parseInt(sDate[0]);
        int startMonth = Integer.parseInt(sDate[1]);
        int startYear = Integer.parseInt(sDate[2]);

        int endDay = Integer.parseInt(eDate[0]);
        int endMonth = Integer.parseInt(eDate[1]);
        int endYear = Integer.parseInt(eDate[2]);

        LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
        LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);

        Period period = Period.between(startDate, endDate);

        System.out.println("Difference is: " + period.getYears() + " years, " +period.getMonths() + " months, and " +period.getDays() + " days.");
        sc.close();
    }
}