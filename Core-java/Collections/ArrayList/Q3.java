import java.util.*;
public class Q3{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());
		}
		System.out.println(al);
		 ListIterator<Integer> iterator = al.listIterator();
                 System.out.println("Elements in ArrayList:");
       		 while (iterator.hasNext()) {
            	 	System.out.print(iterator.next()+" ");
        	 }
			
		 System.out.println("Elements in ArrayList:");
       		 while (iterator.hasPrevious()) {
            	 	System.out.print(iterator.previous()+" ");
        	 }


	}
}