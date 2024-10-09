public class findCurtains {
    public static void main(String[] args) {
        int n = 5;
        int [] arr = {3,42,60,6,14};
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=12) {
              count += arr[i] / 12;
            }
        }
        System.out.println(count);
    }
}