/*
Create a java application where we need to create one object-parameterized constructor, it has to display a user-friendly message on the console when we invoke this constructor under the main method.
*/

public class J032{
	J032(){
	}

	J032(J032 obj){

		System.out.println("Hi");
	}

	public static void main(String[] args){
		J032 obj = new J032(new J032());
	}
}