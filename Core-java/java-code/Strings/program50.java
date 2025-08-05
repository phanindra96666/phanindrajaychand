//50.	Write a program to print all characters in alphabetical order in a given string with repetition?
import java.util.*;
public class program50 {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replace(" ","");
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=0;j<ch.length-i-1;j++)
			{
				if (ch[j] > ch[j + 1]) { 
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
			}
		}
		for(char c:ch)
		{
			System.out.print(c+" ");
		}
	}

}