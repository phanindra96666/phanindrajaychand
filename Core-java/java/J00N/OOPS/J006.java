/*Create a Java Application where we have classes like A,B,C and D. all of them has one method each named as m1, m2, m3, m4 then implement method to method calling from main method of class Test by providing dynamic inputs.(Test doesn’t have any relationship with A or B)*/



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

class D extends C{

	int m4(int n){
	    m3(sc.nextInt());
	    System.out.println(n);
            return sc.nextInt();
        }
}


class test{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	D obj = new D();
	obj.m4(sc.nextInt());
	}
}