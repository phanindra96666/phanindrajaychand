import java.util.Scanner;
class Person {
    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        Person person = new Person();
        person.setName(sc.next());
        System.out.println("Person's name is: " + person.getName());
    }
}
