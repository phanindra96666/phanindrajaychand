// Create a Java Application where we have one class it contains a 
// non static method m1 having parameter and return type, a static
// method m2 having parameter as class variable and returns nothing 
// then invoke m1 under m2 and m2 under main by providing dynamic inputs. 
// Constrains: use direct referencing for all objects 
// Donot use object creation syntax explicitly. 
// Donot create multiple object references for same class 
// Constrains applicable for both scanner and our class

import java.util.Scanner;
public class J018 {
    static Scanner sc = new Scanner(System.in);
    int m1(float a){
        System.out.println(a);
        return sc.nextInt();
    }
    static void m2(J018 obj){
       System.out.println(obj.m1(sc.nextFloat()));
    }
   public static void main(String[] args) {
        m2(new J018());
   }
}