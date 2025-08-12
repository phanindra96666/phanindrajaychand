//48.	Write a program to sort the words in a given String according to alphabetically (lexigrophically)?
import java.util.*;
public class program48 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s[]=s1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			for(int  j=i+1;j<s.length;j++)
			{
				if(isGreater(s[i],s[j]))
				{
					String t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
		// int c=0;
		// for(int i=0;i<s.length();i++)
		// {
			
		// }
			
	}
    public static boolean isGreater(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        for (int k = 0; k < minLen; k++) {
            if (a.charAt(k) > b.charAt(k)) {
                return true; 
            } 
            else if (a.charAt(k) < b.charAt(k)) {
                return false; 
            }
        }
        return a.length() > b.length();
    }

}
