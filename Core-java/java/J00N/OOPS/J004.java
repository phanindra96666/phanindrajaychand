import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in);
    static int a1;
    int a2;
    

    void inputA() {
        System.out.print("Enter a1 (static): ");
        a1 = sc.nextInt();
        System.out.print("Enter a2: ");
        a2 = sc.nextInt();
    }

    void displayA() {
        System.out.println("A: " + a1);
        System.out.println("A: " + a2);
    }
}

class B extends A {
    void displayB() {
        System.out.println("B: " + a1);
        System.out.println("B: " + a2);
    }
}

class C extends A {
    static int c1;
    int c2;

    void inputC() {
        System.out.print("Enter c1 (static): ");
        c1 = sc.nextInt();
        System.out.print("Enter c2: ");
        c2 = sc.nextInt();
    }

    void displayC() {
        System.out.println("C: " + c1);
        System.out.println("C: " + c2);
        System.out.println("C: " + a1);
        System.out.println("C: " + a2);
    }
}

class D extends C {
    void displayD() {
        System.out.println("D: " + c1);
        System.out.println("D: " + c2);
        System.out.println("D: " + a1);
        System.out.println("D: " + a2);
    }
}

class E extends D {
    int e1;
    static int e2;

    void inputE() {
        System.out.print("Enter e1: ");
        e1 = sc.nextInt();
        System.out.print("Enter e2 (static): ");
        e2 = sc.nextInt();
    }

    void displayE() {
        System.out.println("E: " + e1);
        System.out.println("E: " + e2);
    }
}

class G extends E {
    void displayG() {
        System.out.println("G: " + e1);
        System.out.println("G: " + e2);
    }
}

class F extends E {
    void displayF() {
        System.out.println("F: " + e1);
        System.out.println("F: " + e2);
    }
}

class H extends E {
    void displayH() {
        System.out.println("H: " + e1);
        System.out.println("H: " + e2);
        System.out.println("H: " + a1);
    }
}

class test {
    public static void main(String[] args) {
        G obj1 = new G();
        obj1.inputA();
        obj1.inputC();
        obj1.inputE();
        obj1.displayA();
        obj1.displayC();
        obj1.displayE();
        obj1.displayG();

        F obj2 = new F();
        obj2.displayF();

        H obj3 = new H();
        obj3.displayH();

        A obj4 = new A();
        obj4.inputA();
        obj4.displayA();
    }
}
