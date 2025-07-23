import java.util.*;
public class Q7{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(6);
	//Collections.sort(al);//asc
	//Collections.reverse(al);//des
	for(int i=0;i<al.size();i++){
		for(int j=i+1;j<al.size();j++){
			if(al.get(i) >al.get(j)){
				int t = al.get(i);
				al.set(i,al.get(j));
				al.set(j,t);
			}
		}
	}
	for(int num : al){
		System.out.print(num+" ");
	}
    }
}