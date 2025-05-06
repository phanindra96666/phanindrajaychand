/* create a java application having static m1 method with single parameter and return type 
and non static method m2 with single parameter and return type and static method m3 and 
return type with two parameters without return type invoke m1,m2 and m3 under main method 
providing main method condition m1 parameter and m2 return must be the parameters of m3 method 
parameters  */

import java.util.Scanner;
public class J022 {
static Scanner in = new Scanner(System.in);
    public static int m1(int a) {
        return a;
    }

    public int m2(int b) {
        return b * b;
    }

    public static void m3(int m1Result, int m2Result) {
        System.out.println("m1 Result: " + m1Result);
        System.out.println("m2 Result: " + m2Result);
    }

    public static void main(String[] args) {
        int m1Result = m1(in.nextInt()); 
        J022 obj = new J022();
        int m2Result = obj.m2(in.nextInt()); 
        m3(m1Result, m2Result); 
    }
}