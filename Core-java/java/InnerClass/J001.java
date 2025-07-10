// create java application where we have one class that contains one private
// variable and one method with parameter and return type, inside this class,
// we have two inner classes, which contain one method with parameter and return 
// type individually, these methods have to access the private variable and then 
// we need to invoke all these methods under main by providing dynamic inputs 

import java.util.Scanner;
public class J001{
    static Scanner sc = new Scanner(System.in);
    private static int n = sc.nextInt();
    public static int m1(int n){
        System.out.println(n);
        return sc.nextInt();
    }
    class J002{
        public static int m2(int a){
            System.out.println(a);
            System.out.println(n);
            return sc.nextInt();
        }
    }
    class J003{
        public static int m3(int a){
            System.out.println(a);
            System.out.println(n);
            return sc.nextInt();
        }
    }

}