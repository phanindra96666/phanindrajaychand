public class TimeDifference {
    public static String getTimeDifference(String start, String end) {
        String[] startParts = start.split(":");
        String[] endParts = end.split(":");

        int startHours = Integer.parseInt(startParts[0]);
        int startMinutes = Integer.parseInt(startParts[1]);


        int endHours = Integer.parseInt(endParts[0]);
        int endMinutes = Integer.parseInt(endParts[1]);

        
        int startTotalMinutes = startHours * 60 + startMinutes;
        int endTotalMinutes = endHours * 60 + endMinutes;

        int diffMinutes = endTotalMinutes - startTotalMinutes;
        int hours = diffMinutes / 60;
        int minutes = diffMinutes % 60;

        return hours + " hours " + minutes + " minutes";
    }

    public static void main(String[] args) {
        String start = "14:35";
        String end = "18:20";
        System.out.println(getTimeDifference(start, end));
    }
}