import java.util.*;
public class program49 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=" "+s+" ";
		
		String ans="";
		int max=Integer.MIN_VALUE;
		while(s.trim().length()>0)
		{
			int a=s.indexOf(' ',1);
			String  w=s.substring(0,a+1);
			int l1=s.length();
			while(s.contains(w))
			    s=s.replace(w," ");
			int l2=s.length();
			int count=(l1-l2)/a;
			if(max<count)
			{
				max=count;
				ans=ans+w.trim();
			}
		}
		System.out.print(max+" "+ans);
	}

}