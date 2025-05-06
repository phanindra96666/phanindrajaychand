/*Create a java application where we have one abstract class which contains 2 abstract methods and one defined method, inherit this class into a concrete class and provide functionality for these abstract methods and invoke all the properties under the main method by providing Dynamic inputs.
*/

import java.util.Scanner;
abstract class A {
    abstract int m1(int input1);
    abstract String m2(String input2);

    int m3(int input1) {
	return input1;
    }

}
class B extends A {
    @Override
    int m1(int input1) {
	return input1;
    }
    @Override
    String m2(String input2) {
	return input2;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B obj = new B();
        System.out.print(obj.m1(sc.nextInt()));
	System.out.print(obj.m2(sc.next()));
	System.out.print(obj.m3(sc.nextInt()));

    }
}
