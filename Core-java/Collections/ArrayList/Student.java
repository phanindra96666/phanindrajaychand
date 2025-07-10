import java.util.*;
public class Student {
    private int id;
    private String name;
    private double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }


    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setMarks(double marks) {
        this.marks = marks;
    }
    int getId (){
        return id;
    }
    String getName(){
        return name;
    }

    double getMarks(){
        return marks;
    }
    @Override
    public String toString(){
        return getId() +" "+getName()+" "+getMarks();
    }
}

class A{
    public static void main(String[] args) {
        ArrayList <Student> al = new ArrayList<>();
        Student s1 = new Student(1, "phani", 100);
        Student s2 = new Student(2, "saii", 100);
        al.add(s1);
        al.add(s2);
        al.add(new Student(3, "sai sri", 100));
        al.add(new Student(4, "Phanindra", 100));
        for(Student x : al){
            System.out.println(x);
        }

        for(Student x : al){
            System.out.println(x.getId()+" "+x.getMarks()+" "+x.getName());
        }

    }
}

