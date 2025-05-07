import java.util.Scanner;

public class PrintDate {
    public static void main(String[] args) {
        int[] monthCodes = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int[] centuryCode = {5, 3, 1, 0};

        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(":");

        int day = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[2]);

        if (isLeapYear(year)) {
            if (month == 1) monthCodes[0] = 5; 
            if (month == 2) monthCodes[1] = 1;
        }

        int lastTwoDigits = year % 100;
        int century = year / 100;

        int yearCode = (lastTwoDigits + (lastTwoDigits / 4)) % 7;
        int centuryCodeValue = centuryCode[(century - 1) % 4];

        int total = day + monthCodes[month - 1] + yearCode + centuryCodeValue;
        int dayOfWeek = total % 7;

        String dayName = "";
        switch (dayOfWeek) {
            case 0: dayName = "Sunday"; break;
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
        }

        System.out.println("Day of the week: " + dayName);
        sc.close();
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
