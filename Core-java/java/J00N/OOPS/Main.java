import java.util.Scanner;
class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        Person person = new Person(sc.next());
        System.out.println(person.getName());
    }
}
