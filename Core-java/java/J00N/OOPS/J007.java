/*Create a Java Application where we have one class A which contains a non static method like M1 inherit this class into another class B where we have one non static method M2 with parameter and return type then inherit this class into two classes like C and D where we have on non static method each, invoke methods of super classes in both these methods and then invoke these two methods under main  of class test by providing dynamic inputs.(Test doesn’t have any relationship with A or B)*/

import java.util.Scanner;

 class A{
    static Scanner sc = new Scanner(System.in);

    	int m1(int n){
	    System.out.println(n);
            return sc.nextInt();
    	}
 }

 class B extends A{

	int m2(int n){
	    m1(sc.nextInt());
	    System.out.println(n);
            return sc.nextInt();
        }
}
class C extends B{

	int m3(int n){
	    m2(sc.nextInt());
	    System.out.println(n);
            return sc.nextInt();
        }
}

class D extends B{

	int m4(int n){
	    m2(sc.nextInt());
	    System.out.println(n);
            return sc.nextInt();
        }
}


class test{
	public static void main(String[] args){
	//Scanner sc = new Scanner(System.in);
	D obj = new D();
	C obj1 = new C();
	obj.m4(A.sc.nextInt());
	obj1.m3(A.sc.nextInt());
	
	}
}