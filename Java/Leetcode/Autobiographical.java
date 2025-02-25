import java.util.HashSet;
public class Autobiographical {
    public static void main(String[] args) {
        String number = "1210";
        System.out.println(check(number));
    }
    private static int check(String number) {
        HashSet <Character> set = new HashSet<>();
        for (char c : number.toCharArray()) {
            set.add(c); 
        }
        int uniqueCount = set.size();
        if(isAutobiographical(number)){
           return uniqueCount;
        }
        else{
            return 0;
        }
    }
    
    private static boolean isAutobiographical(String number) {
        int len = number.length();
        int [] count = new int[len];
        for (char c : number.toCharArray()) {
            int digit = c - '0';
            if (digit<len) {
                count[digit]++;
            }
        }
        for(int i = 0; i < len; i++){
            int expected = number.charAt(i)-'0';
            if(expected!=count[i]){
                return false;
            }
        }
        return true;
    }
}
