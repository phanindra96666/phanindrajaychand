import java.util.*;
public class Q4{
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Boolean print = true;
		ArrayList<Integer> al = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		Iterator<Integer> iterator = al.iterator();
        System.out.println("Elements in ArrayList:");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			if(iterator.hasNext()){
				iterator.next();
			}
		}
	}
}