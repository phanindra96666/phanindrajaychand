// Create a java application where we have one class it contains a non static method m1 
// having parameter string returns Boolean , a static method m2 having parameter integer 
// returns our class then invoke both the methods under main method without creating our 
// class object and without using direct reference provide dynamic inputs without 
// using import keyword 

public class J017 {
    static java.util.Scanner in = new java.util.Scanner(System.in);

    public boolean m1(String s) {
        System.out.println("Calling M1");
        return in.nextBoolean();
    }

    public static J017 m2(int n) {
        System.out.println("Calling M2");
        return new J017();
    }

    public static void main(String[] args) {
        m2(in.nextInt()).m1(in.next());
    }
}