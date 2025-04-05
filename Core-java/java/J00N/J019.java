import java.util.Scanner;

public class J019 {
    static Scanner in = new Scanner(System.in);
    static String OrgName =  in.next();

    int EmpId = in.nextInt();
    String EmpName = in.next();
    double EmpSalary = in.nextDouble();
    String EmpDesignation  = in.next();
    String EmpWorkLocation =  in.next();
    

    public static void EmployeeDetails(J019 emp) {
	System.out.println("Employee Details:");
        System.out.println("Organization: " + emp.OrgName);
        System.out.println("ID: " + emp.EmpId);
        System.out.println("Name: " + emp.EmpName);
        System.out.println("Salary: " + emp.EmpSalary);
        System.out.println("Designation: " + emp.EmpDesignation);
        System.out.println("Work Location: " + emp.EmpWorkLocation);
    }

    public static void main(String[] args) {
        J019 emp1 = new J019();
        J019 emp2 = new J019();
        J019 emp3 = new J019();
        J019 emp4 = new J019();
        J019 emp5 = new J019();
	
	int i = 0;
        while (i==0) {
		i++;
            System.out.println("Enter Emp ID to display details:");
            int choice = in.nextInt();

            if (choice == 0) {
                System.out.println("Exiting program");
                break;
            }
            if (choice == emp1.EmpId) {
                EmployeeDetails(emp1);
            } else if (choice == emp2.EmpId) {
                EmployeeDetails(emp2);
            } else if (choice == emp3.EmpId) {
                EmployeeDetails(emp3);
            } else if (choice == emp4.EmpId) {
                EmployeeDetails(emp4);
            } else if (choice == emp5.EmpId) {
                EmployeeDetails(emp5);
            } else {
                System.out.println("Emp with ID " + choice + " not found");
            }
        }
    }
}