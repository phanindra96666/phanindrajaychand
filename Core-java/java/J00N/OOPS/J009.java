/*create a Java application where we have one class it contains one method m1 having parameter String and it is going to return a boolean value and then inherit this class into another class which also has the same method name, same parameter, and same return type then inherit this class into one more class there also we have same method, parameter and return type. then if we invoke the bottommost derived class method under the main method from there it has to invoke the intermediate base class method and from there it has to invoke top most base class method by providing Dynamic inputs with respect to the super keyword. (sm.java)*/

import java.util.Scanner;

 class A{
    static Scanner sc = new Scanner(System.in);

    	boolean m1(String s){
	    System.out.println(s);
            return sc.nextBoolean();
    	}
 }

 class B extends A{

	boolean m1(String s){
	    super.m1(sc.next());
	    System.out.println(s);
            return sc.nextBoolean();
    	}

}
class C extends B{

	boolean m1(String s){
	    super.m1(sc.next());
	    System.out.println(s);
            return sc.nextBoolean();
    	}

}

class test{
	public static void main(String[] args){
	C obj = new C();	
	obj.m1(C.sc.next());
	}
}