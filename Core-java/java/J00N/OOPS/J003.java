import java.util.Scanner;
class Software {
static Scanner sc = new Scanner(System.in);
        int empid = sc.nextInt();
        String empdes = sc.next();
        int empsal = sc.nextInt();
        String empworkloc = sc.next();
}

class emp1 extends Software {
	public void viewDetails() {
        	System.out.println("EmpID: " + empid);
        	System.out.println("Designation: " + empdes);
        	System.out.println("Salary: " + empsal);
        	System.out.println("Work Location: " + empworkloc);
        }
}
class emp2 extends Software {
	public void viewDetails() {
        	System.out.println("EmpID: " + empid);
        	System.out.println("Designation: " + empdes);
        	System.out.println("Salary: " + empsal);
        	System.out.println("Work Location: " + empworkloc);
        }
}
class emp3 extends Software {
	public void viewDetails() {
        	System.out.println("EmpID: " + empid);
        	System.out.println("Designation: " + empdes);
        	System.out.println("Salary: " + empsal);
        	System.out.println("Work Location: " + empworkloc);
    	}
}
class emp4 extends Software {
	public void viewDetails() {
        	System.out.println("EmpID: " + empid);
        	System.out.println("Designation: " + empdes);
        	System.out.println("Salary: " + empsal);
        	System.out.println("Work Location: " + empworkloc);
    	}
}
class emp5 extends Software {
	public void viewDetails() {
        	System.out.println("EmpID: " + empid);
        	System.out.println("Designation: " + empdes);
        	System.out.println("Salary: " + empsal);
        	System.out.println("Work Location: " + empworkloc);
    	}
}
public class J003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        emp1 e1 = new emp1();
        emp2 e2 = new emp2();
        emp3 e3 = new emp3();
        emp4 e4 = new emp4();
        emp5 e5 = new emp5();

        System.out.print("Enter employee number ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                e1.viewDetails();
                break;
            case 2:
                e2.viewDetails();
                break;
            case 3:
                e3.viewDetails();
                break;
            case 4:
                e4.viewDetails();
                break;
            case 5:
                e5.viewDetails();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
