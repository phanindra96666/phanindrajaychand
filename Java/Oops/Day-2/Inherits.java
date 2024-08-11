public class Inherits extends Vehicle {
    public String Names  = "happy";

    public static void main(String[] args) {
        Inherits myObj = new Inherits();
        myObj.mymethod();
        //if the setname is private then setname bottom is not needed 
        myObj.setName("PhaniSai");
        System.out.println(myObj.getName());
        System.out.println(myObj.Names);
    }
}
