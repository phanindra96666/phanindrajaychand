import java.util.Scanner;
class SingleLineCall{
    static Scanner sc = new Scanner(System.in);
    SingleLineCall(char c){

    }
    void m1(int a , double d){
        
    }
    static double m2(String s){
       return sc.nextDouble(); 
    }

    static String m3(byte b){
        return sc.next();
    }
    int m4(float f){
        return sc.nextInt();
    }
    public static void main(String[] args) {
        SingleLineCall obj = new SingleLineCall(sc.next().charAt(0));
        obj.m1(obj.m4(sc.nextFloat()),m2(m3(sc.nextByte())));
    }
}