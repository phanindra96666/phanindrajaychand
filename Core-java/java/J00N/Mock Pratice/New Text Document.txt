import java.util.Scanner;
public class J002 {
    static Scanner sc = new Scanner(System.in);
    J002(){//1
        System.out.println("deafult calling");
    }
    J002(int n){//3
        System.out.println("Single parameter");
    }
    J002(J002 obj,int b){//4 //7
        System.out.println("Double parameter");
    }
    J002(J002 obj){//2
        System.out.println("object parameter");
    }
    static int m1(int n){//6
        System.out.println("m1 is calling");
        return n;
    }
    int m2(int n){//5
        System.out.println("m2 is calling");
        return n;
    }
    public static void main(String[] args){
        new J002(new J002(new J002()),m1(new J002(sc.nextInt()).m2(sc.nextInt())));
    }
}