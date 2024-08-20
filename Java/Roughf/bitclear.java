public class bitclear {
    public static void main(String[] args) {
        int n=5; // 1001
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask = ~(bitmask);
        int result =notbitmask & n;
        System.out.println(result);
    }
}
