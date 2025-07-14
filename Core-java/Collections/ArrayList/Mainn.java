//Create a java application where we have class employee it contains private fileds
//like emp_id , emp_name,emp_salary,emp_des without insilaization then provide setter 
//and getters for this variables and create an arrayList object having emp as generic then add 
//5 emp details to it, display the employes who is getting salary greater then the avg salary and 
//again display the emp in decs order based on salary
import java.util.*;

class Employee {
    private int emp_id;
    private String emp_name;
    private double emp_salary;
    private String emp_des;

    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public String getEmp_des() {
        return emp_des;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public void setEmp_des(String emp_des) {
        this.emp_des = emp_des;
    }

    public void display() {
        System.out.println("ID: " + emp_id + ", Name: " + emp_name + ", Salary: " + emp_salary + ", Designation: " + emp_des);
    }
}

class SalaryComparator implements Comparator<Employee>
{
    public int compare(Employee x,Employee y)
    {
        // if(x.getEmp_salary()==y.getEmp_salary())
        // return 0;
        // if(x.getEmp_salary()<y.getEmp_salary())
        // return 1;
        
        // return -1;
        return - Double.compare(x.getEmp_salary(),y.getEmp_salary());
    }
}
class IdComparator implements Comparator<Employee>
{
    public int compare(Employee x, Employee y) { 
        return  Integer.compare(x.getEmp_id(), y.getEmp_id());
    }


    // public int compare(Employee x , Employee y){
    //     return  x.getEmp_name().compareTo(y.getEmp_name()); 
    // }

}


public class Mainn {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setEmp_id(101);
        e1.setEmp_name("phani");
        e1.setEmp_salary(50000);
        e1.setEmp_des("Developer");

        Employee e2 = new Employee();
        e2.setEmp_id(102);
        e2.setEmp_name("saii");
        e2.setEmp_salary(60000);
        e2.setEmp_des("Manager");

        Employee e3 = new Employee();
        e3.setEmp_id(103);
        e3.setEmp_name("mahesh");
        e3.setEmp_salary(45000);
        e3.setEmp_des("Analyst");

        Employee e4 = new Employee();
        e4.setEmp_id(104);
        e4.setEmp_name("sirr");
        e4.setEmp_salary(70000);
        e4.setEmp_des("Architect");

        Employee e5 = new Employee();
        e5.setEmp_id(105);
        e5.setEmp_name("kkkk");
        e5.setEmp_salary(40000);
        e5.setEmp_des("Intern");

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        double totalSalary = 0;
        for (Employee e : empList) {
            totalSalary += e.getEmp_salary();
        }
        double avgSalary = totalSalary / empList.size();
        System.out.println(avgSalary);

        for (Employee e : empList) {
            if (e.getEmp_salary() > avgSalary) {
                e.display();
            }
        }
        System.out.println();
        
        // for(int i=0;i<empList.size();i++){
        //     for(int j=i+1;j<empList.size();j++){
        //         if (empList.get(i).getEmp_salary()  <  empList.get(j).getEmp_salary()) {
        //             Employee t = empList.get(i);
        //             empList.set(i, empList.get(j));
        //             empList.set(j, t);
        //         }
        //     }
        // }

         Collections.sort(empList,new SalaryComparator());

        for (Employee e : empList) {
            e.display();
        }
    }
}