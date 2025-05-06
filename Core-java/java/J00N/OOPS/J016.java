import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private String department;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getDepartment() {
        return department;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        
        employee.setName(sc.next());
        employee.setAge(sc.nextInt());
        employee.setDepartment(sc.next());

        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getDepartment());
    }
}
