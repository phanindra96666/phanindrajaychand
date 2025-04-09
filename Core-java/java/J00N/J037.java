import java.util.Scanner;
public class J037{
        static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	J037 (int a){
		System.out.println(a);
		System.out.print(this.a);
	}

	J037 (){
		this(sc.nextInt());
	}

	J037(String s){
		this();
	}
	public static void main(String[] args){
		J037 obj = new J037(sc.next());
	}
}
