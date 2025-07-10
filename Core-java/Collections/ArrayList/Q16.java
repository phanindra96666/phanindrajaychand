import java.util.*;
import java.util.Scanner;

public class Q16 {
    public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<> ();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int num = sc.nextInt();
			al.add(num);
		}
		// Iterator<Integer> itr = al.iterator();
		// while(itr.hasNext()){
		// 	int x = itr.next();
		// 	if(x%4==0){
		// 		itr.remove();
		// 	}
		// }

		al.removeIf((x)->x%4==0);
	
        // for(int i=0;i<al.size();i++){
        //     if(al.get(i)%4==0){
        //         al.remove(i);
        //         i--;//to prevent for index skips becouse ArrayList is Dynamic when we remove it adject 
        //     }
        // }
		System.out.print(al);	
        sc.close();
	}
}