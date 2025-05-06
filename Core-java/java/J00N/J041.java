import java.util.*;
 public class J041 {
    static Scanner sc=new Scanner(System.in);

    void m1(int i,double d){
        System.out.println(i);
    }

    static double m2(String s){
        System.out.println(s);
        return sc.nextDouble();
    }

    static String m3(byte b){
        System.out.println(b);
        return sc.next();
    }

    int m4(float f){
        System.out.println(f);
        return sc.nextInt();
    }

    J041(char c){
        System.out.println(c);
    }

    public static void main(String [] args){
        new J041(sc.next().charAt(0)).m1(new J041(sc.next().charAt(0)).m4(sc.nextFloat()),m2(m3(sc.nextByte())));
    }
}//m1(m4(f),m2(m3(b)));