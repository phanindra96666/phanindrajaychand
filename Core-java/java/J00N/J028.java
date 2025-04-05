/*4.Create a java application where we have one employee, they have to display the details emp ID, name, salary, designation, and mobile number by using the parameterized constructor, then invoke the constructor under main by providing dynamic inputs. (Employee.java)
*/

import java.util.Scanner;
public class J028{
	
	J028(int empId,String name,int saraly,String designation,int mobileNumber ){
		System.out.print(empId+" "+name+" "+saraly+" "+designation+" "+mobileNumber);
	}

	public static void main(String[] args){ 
		Scanner in = new Scanner(System.in);
		J028 obj = new J028(in.nextInt(),in.next(),in.nextInt(),in.next(),in.nextInt());
	}
}
