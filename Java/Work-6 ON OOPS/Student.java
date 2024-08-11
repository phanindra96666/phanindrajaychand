class Person {
    String name;
    int age;

    public void studentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Student {
    public static void main(String[] args) {
        Person pen1 = new Person();
        pen1.name = "phani";
        pen1.age = 21;

        pen1.studentInfo();
    }
}