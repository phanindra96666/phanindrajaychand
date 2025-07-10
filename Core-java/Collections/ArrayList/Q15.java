import java.util.*;
public class Q15 {
	static ArrayList<String> req (ArrayList<String> al ,int k){
        ArrayList<String> al1 = new ArrayList<>();
        for(int i=al.size()-1;k>0; i--){
            
            if (!al1.contains(al.get(i))) {
                al1.add(al.get(i));
                k--;
            }
            
        }
        return al1;
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("c1");
        al.add("c2");
        al.add("c3");
        al.add("c1");
        al.add("c1");
        al.add("c5");

        ArrayList<String> al2 = req(al,3);
        for(String x : al2){
            System.out.print(x);
        }
    }


}