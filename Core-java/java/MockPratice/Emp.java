import java.util.Scanner;
class Software {
    static Scanner sc = new Scanner(System.in);
    int empid;
    String empdes;
    int empsal;
    String empworkloc;

    public void M1(int empid, String empdes, int empsal, String empworkloc) {
        this.empid = empid;
        this.empdes = empdes;
        this.empsal = empsal;
        this.empworkloc = empworkloc;
    }
}

class emp extends Software {
    public void viewDetails() {
        System.out.println("EmpID: " + empid);
        System.out.println("Designation: " + empdes);
        System.out.println("Salary: " + empsal);
        System.out.println("Work Location: " + empworkloc);
    }
}

public class Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        emp e1 = new emp();
        emp e2 = new emp();
        emp e3 = new emp();
        emp e4 = new emp();
        emp e5 = new emp();

        e1.M1(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
        e2.M1(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
        e3.M1(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
        e4.M1(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
        e5.M1(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());

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

        sc.close();
    }
}
