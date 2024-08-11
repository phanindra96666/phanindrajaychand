interface First {
    void mywife();
}
interface Second {
    void mywife();
}
public class naga implements First,Second{
    public  void mywife(){
    System.out.println("sam");
   }
public static void main(String[] args) {
naga obj = new naga();
obj.mywife(); 
}
}