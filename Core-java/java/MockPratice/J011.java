import java.util.Scanner;
class Main{
	static Scanner sc = new Scanner(System.in);
	public int m1(){
		return sc.nextInt();
	}
	public int m2(){
		return sc.nextInt();
	}
	public int m3(){
		return m1()+m2();
	}
	public static void main(String[] args){
		Main obj = new Main();
		System.out.print(obj.m3());
	}
}