public class A {
    int a = 10;
    @Override
    public String toString(){
        return String.valueOf(a);
    }
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj);
    }
}
