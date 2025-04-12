import java.util.Scanner;

class Software {
    static Scanner sc = new Scanner(System.in);
    int empid;
    String empdes;
    int empsal;
    String empworkloc;

    public void getFromUser() {
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Designation: ");
        empdes = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        empsal = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Work Location: ");
        empworkloc = sc.nextLine();
    }

    public void viewDetails() {
        System.out.println("EmpID: " + empid);
        System.out.println("Designation: " + empdes);
        System.out.println("Salary: " + empsal);
        System.out.println("Work Location: " + empworkloc);
    }
}
public class J003 extends Software {
    public static void main(String[] args) {
        Software emp1 = new Software();
        emp1.getFromUser();
        Software emp2 = new Software();
        emp2.getFromUser();
        Software emp3 = new Software();
        emp3.getFromUser();
        Software emp4 = new Software();
        emp4.getFromUser();
        Software emp5 = new Software();
        emp5.getFromUser();

        emp1.viewDetails();
        emp2.viewDetails();
        emp3.viewDetails();
        emp4.viewDetails();
        emp5.viewDetails();
    }
}