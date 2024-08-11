class me{
    String name;
    int age;

    public void myinfo(String name){
        System.out.println(name);
    }
    public void myinfo(int age){
        System.out.println(age);
    }
    public void myinfo(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class poly {
    public static void main(String[] args) {
        me p1 = new me();
        p1.name = "phani";
        p1.age = 22;
        p1.myinfo(p1.name,p1.age);
    }
}
