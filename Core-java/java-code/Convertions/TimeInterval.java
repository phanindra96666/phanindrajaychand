public class TimeInterval {
    public static void main(String[] args) {
        int[] teachers = {4, 3, 5, 2, 6};
        int[] intervals1 = {1, 2, 3, 2, 6};
        int[] intervals2 = {1, 2, 4, 7, 8};

        int totalTime = 20;
        int totalInterval = 0;

        for (int i = 0; i < intervals1.length; i++){
            totalInterval += intervals1[i];
        }

        int result = totalTime - totalInterval;

        //System.out.println( totalInterval);
        System.out.println(result);
    }
}
