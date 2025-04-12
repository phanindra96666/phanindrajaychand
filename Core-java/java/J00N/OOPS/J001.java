/*create a java application where we have a bank, it will provide customer details like account number, IFSC Code, and ATM Pin No. and available balance to the customer then, the customer has to display all these values with respect to one user-defined method and then invoke that method under the main method.*/

import java.util.Scanner;
 class Bank{
    static Scanner sc = new Scanner(System.in);
    int accountNo = sc.nextInt();
    String IFSCCode = sc.next();
    int  ATMPin = sc.nextInt();
    int balance = sc.nextInt();
}
 class costumer extends Bank{
	void viewDetails(){
		System.out.println(accountNo);
		System.out.println(IFSCCode);
		System.out.println(ATMPin);
		System.out.println(balance);
	}

	public static void main(String[] args){
		costumer obj = new costumer();
		obj.viewDetails();
	}
}