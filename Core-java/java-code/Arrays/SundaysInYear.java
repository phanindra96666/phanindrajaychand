import java.time.DayOfWeek;
import java.time.LocalDate;

public class SundaysInYear {
    public static int countSundays(int year) {
        int sundayCount = 0;
        LocalDate date = LocalDate.of(year, 1, 1);
        while (date.getYear() == year) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
            }
            date = date.plusDays(1);
        }
        return sundayCount;
    }
    public static boolean isLeapYear(int n){
        if ((n%4==0 && n%100!=0) ||n%400 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int year = 2025;
        int totalSundays = countSundays(year);
        int days = isLeapYear(year) ? 366 : 365;
        double total = ((double) totalSundays / days) * 100;
        System.out.printf("%.2f",total);
    }
}
