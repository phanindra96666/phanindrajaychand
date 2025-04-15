/*Create a Java Application where we have one class A which contains a non static variable and a non static method m1 with parameter and return type, inherit this class into another class B where we have one non static variable and a non static method m2 with parameter and return type, then invoke m1 and variables under m2 and then invoke m2 under main method of class Test. (Test doesn’t have any relationship with A or B). Provide dynamic inputs.*/


import java.util.Scanner;

 class A{
    static Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();

    	int m1(int n){
	    System.out.println(n);
            return sc.nextInt();
    	}
 }

 class B extends A{
	int y = sc.nextInt();

	int m2(int n){
	    m1(sc.nextInt());
	    System.out.println(n);
	    System.out.println(x);
            return sc.nextInt();
        }
}

class test{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		B obj = new B();
		obj.m2(sc.nextInt());
	}
}