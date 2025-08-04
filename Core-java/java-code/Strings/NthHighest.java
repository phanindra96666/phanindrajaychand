public class NthHighest { 
    public static void main(String[] args) { 
        String s = "9739469236";
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        int maxx = Integer.MAX_VALUE;

        for (int k = 0; k < n; k++) { 
            int cur = Integer.MIN_VALUE;
            for (int j = 0; j < s.length(); j++) { 
                int val = s.charAt(j) - '0';
                if (val < maxx && val > cur) { 
                    cur = val;
                } 
            } 
            maxx = cur;
        } 
        System.out.print(maxx);
    } 
} 