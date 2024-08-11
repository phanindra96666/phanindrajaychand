class Shape{
    public void area(){
        System.out.println("First class");
    }
}
class Traingle extends Shape {
    public void hhh(){
        String N  = "jhwf";
        System.out.println(N);
    }
}
class Square extends Traingle{
    
}
public class classes {
    public static void main(String[] args) {
        Traingle myObj = new Traingle();
        Square mObj = new Square();
        mObj.hhh();
        myObj.area();
    }
}