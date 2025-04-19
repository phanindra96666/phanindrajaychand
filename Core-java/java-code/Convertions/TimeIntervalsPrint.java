import java.util.Scanner;

public class TimeIntervalsPrint {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String end = sc.next();

        String[] startParts = start.split(":");
        String[] endParts = end.split(":");

        int startHours = Integer.parseInt(startParts[0]);
        int startMinutes = Integer.parseInt(startParts[1]);
        int startSeconds = Integer.parseInt(startParts[2]);

        int endHours = Integer.parseInt(endParts[0]);
        int endMinutes = Integer.parseInt(endParts[1]);
        int endSeconds = Integer.parseInt(endParts[2]);

        int startTotalSeconds = startHours * 3600 + startMinutes * 60 + startSeconds;
        int endTotalSeconds = endHours * 3600 + endMinutes * 60 + endSeconds;

            String s="**********Phanidra************";
        for (int current = startTotalSeconds;current<=endTotalSeconds;current++) {
            int hours = current/3600;
            int minutes = (current%3600)/60;
            int seconds = current%60;
            //System.out.printf("\r%d:%02d:%02d", hours, minutes, seconds);
                System.out.print("\r"+s);
                s=s.substring(1)+s.charAt(0);

                Thread.sleep(100);
        }
        sc.close();
    }
}

