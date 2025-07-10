import java.util.*;

public class SockPairFinder { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] socks = new int[n];
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < n; i++) { 
            socks[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) { 
                if (socks[i] == socks[j] && socks[j] != -1) { 
                    al.add(socks[i] + " " + socks[j]);
                    socks[j] = -1; 
                    break;  
                } 
            } 
        } 

        for (String s : al) { 
            System.out.println(s);
        } 
        scanner.close();
    }
}

//15
// 8 3 5 16 7 3 8 8 2 5 8 16 3 9 10