import java.util.*;
public class Found { 
	public static void main(String[] args) { 
		Scanner obj = new Scanner(System.in);
		String s = obj.nextLine();
		String w = obj.nextLine();
		for(int i=0; i<s.length(); i++) { 
			if(s.charAt(i)==w.charAt(0)) {  
				Boolean b = true;
				for(int j=1; j<w.length(); j++) {
					if(w.charAt(j)!=s.charAt(i+j)) { 
						b= false;
						break;
					} 
				} 
				if(b){ 
					System.out.println("found");
                } 
			} 
		} 
	} 
}