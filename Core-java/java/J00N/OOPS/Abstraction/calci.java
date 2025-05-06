import java.util.Scanner;

abstract class Mathop{
    abstract int cal(int a, int b);
}
class add extends Mathop{
    @Override
    int cal(int a,int b){
        return a+b;
    }
}
class sub extends Mathop{
    @Override
    int cal(int a,int b){
        return a-b;
    }
}
class div extends Mathop{
    @Override
    int cal(int a,int b){
        return a/b;
    }
}
class mod extends Mathop{
    @Override
    int cal(int a,int b){
        return a%b;
    }
}
class mul extends Mathop{
    @Override
    int cal(int a,int b){
        return a*b;
    }
}
public class calci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Operations");
    int x = sc.nextInt();
    char ch = sc.next().charAt(0);
    int y = sc.nextInt();
    Mathop obj = null;
    switch (ch) {
        case '+':  obj = new add();break;
        case '-':  obj = new sub();break;
        case '*':  obj = new mul();break;
        case '/':  obj = new div();break;
        case '%':  obj = new mod();break;
    
        default:
        System.out.println("Enter again");break;
    }
    System.out.println(obj.cal(x,y)); 
    }
}
