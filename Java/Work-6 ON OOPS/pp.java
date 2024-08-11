class Hog {
    String name;
    int age;
    public void lo() {
        System.out.println("Write somthing...");
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Hog(String name,int age) {
        this.name=name;
        this.age=age;
    }
}

public class pp {
    public static void main(String[] args) {
        Hog myObj = new Hog("phani",21);
        myObj.lo();
       
        
    }
}
