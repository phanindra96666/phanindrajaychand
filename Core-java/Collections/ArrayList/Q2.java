import java.util.*;
public class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());
		}
		System.out.println(al);
		al.remove(2);
		al.add(2,5);
		al.set(3,sc.nextInt());
		Iterator<Integer> iterator = al.iterator();

                System.out.println("Elements in ArrayList:");
       		while (iterator.hasNext()) {
            		System.out.println(iterator.next());
        	}
	}
}