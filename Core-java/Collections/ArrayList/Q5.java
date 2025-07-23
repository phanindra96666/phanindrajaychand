import java.util.*;
public class Q5{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		Boolean print = true;
		ArrayList<Integer> alM2 = new ArrayList<>();
		ArrayList<Integer> alM3 = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			alM2.add(2*i);
		}
		for(int i=1;i<=n;i++){
			alM3.add(3*i);
		}

		Iterator<Integer> iterator = alM2.iterator();
		Iterator<Integer> iterator1 = alM3.iterator();

        System.out.println("Elements in ArrayList:");

		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		System.out.println("Elements in ArrayList:");
		
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next()+" ");
		}

		System.out.println("common ele");
		ArrayList<Integer> commonElements = new ArrayList<>(alM2);
		commonElements.retainAll(alM3);
		System.out.print(commonElements);
	}
}