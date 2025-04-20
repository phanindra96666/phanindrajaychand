import java.util.Scanner;
class SingleLineCall{
    static Scanner sc = new Scanner(System.in);
    SingleLineCall(char c){

    }
    void m1(int a , double d){

    }
    static double m2(String s){
       return sc.nextDouble(); //6
    }

    static String m3(byte b){//4
        return sc.next();//5
    }
    int m4(float f){//2
        return sc.nextInt();//3
    }
    public static void main(String[] args) {
        SingleLineCall obj = new SingleLineCall(sc.next().charAt(0));//1
        obj.m1(obj.m4(sc.nextFloat()),m2(m3(sc.nextByte())));
    }
}