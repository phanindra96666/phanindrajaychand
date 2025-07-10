import java.util.*;
public class Q14 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<> ();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int num = sc.nextInt();
			al.add(num);
		}
		ArrayList<Integer> al2 = new ArrayList<> ();
		int m = sc.nextInt();
		for(int i=0;i<m;i++){
			int num1 = sc.nextInt();
			al2.add(num1);
		}
		for(int i=0;i<al.size();i++){
			if (al2.contains(al.get(i))){
                System.out.print(al.get(i)+" ");
                al2.remove(al.get(i));
            }
		}
        sc.close();
	}
}
