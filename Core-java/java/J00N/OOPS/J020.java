class Parent {
    int M1(int x) {
        System.out.println("Parent M1: " + x);
        return x;
    }

    String M2(String str) {
        System.out.println("Parent M2: " + str);
        return str;
    }
}

class J020 extends Parent {
    @Override
    int M1(int x) {
        System.out.println("Child M1: " + (x * 2));
        return x * 2;
    }

    @Override
    String M2(String str) {
        System.out.println("Child M2: " + str.toUpperCase());
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        J020 obj = new J020();
        obj.M1(10);
        obj.M2("hello");
    }
}
