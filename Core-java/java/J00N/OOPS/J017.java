class J017 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {
        J017 obj = new J017();
        System.out.println(obj.add(10, 20)); 
        System.out.println(obj.add(10.5, 20.5)); 
        System.out.println(obj.add(10, 20, 30));
    }
}
