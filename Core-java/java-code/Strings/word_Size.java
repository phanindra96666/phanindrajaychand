import java.util.Scanner;
public class word_Size { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int w=0;
		for(int s=0, e=1; e<str.length(); e++) { 
			if(str.charAt(e)==' ') { 
				if(e-s > w) { 
					w= e-s;
                } 
				s= e+1;
			} 
		} 
		for(int i=w; i>=1; i--) { 
            for(int s=0, e=1; e<str.length(); e++) { 
                if(str.charAt(e)==' ') { 
                    if(e-s == i) { 
                        for(int j=s; j<e; j++) { 
                            System.out.print(str.charAt(j));
                        } 
                        System.out.println();
                    } 
                    s= e+1;
                } 
            } 
        } 
	} 
} 