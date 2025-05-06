public class J009 {
    J009(){
        System.out.println("Hello");
    }
    J009(J009 obj){
        obj.m1();
    }
    void m1(){
        System.out.println("Hii");
    }
    public static void main(String[] args) {
        J009 obj = new J009(new J009());
    }
}