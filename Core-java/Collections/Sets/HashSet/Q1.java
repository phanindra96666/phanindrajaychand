import java.util.HashSet;
import java.util.Scanner;
public class Q1 { 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0;i < 10; i++) { 
            map.add(sc.nextInt());
        } 
        for(int n : map) { 
            System.out.print(n+" ");
        } 
        sc.close();
    } 
} 