import java.util.*;
public class Q8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());
		}

		System.out.println(al);//1

		Iterator<Integer> iterator = al.iterator();
       		while (iterator.hasNext()) {
            	System.out.print(iterator.next()+" ");//2
        	}
			
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+" ");//3
		}
		
		for(int x : al){
			System.out.print(x+" ");//4
		}
		
		
		
		Iterator <Integer> itr = al.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");//6
		}
		
		al.forEach((x)->System.out.print("7 "+x+" "));//7


		while(!al.isEmpty()){
			System.out.print(al.remove(0)+" ");//5
		}
	}
}