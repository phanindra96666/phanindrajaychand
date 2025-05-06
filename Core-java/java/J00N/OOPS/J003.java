import java.util.Scanner;
class Software {
static Scanner sc = new Scanner(System.in);
    int empid = sc.nextInt();
    String empdes = sc.nextLine();
    int empsal = sc.nextInt();
    String empworkloc = sc.nextLine();
}

class emp1 extends Software {
	public void viewDetails() {
        System.out.println("EmpID: " + empid);
        System.out.println("Designation: " + empdes);
        System.out.println("Salary: " + empsal);
        System.out.println("Work Location: " + empworkloc);
        }
}

class Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        emp1 e1 = new emp1();
        emp1 e2 = new emp1();
        emp1 e3 = new emp1();
        emp1 e4 = new emp1();
        emp1 e5 = new emp1();
        

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
        sc.close();
    }
}
