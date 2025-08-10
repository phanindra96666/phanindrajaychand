//37.	Write a program to find the count of a each and every word in a given String?

public class program37 {

	public static void main(String[] args) {
		String s="hello world hello bye bye bye";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int c=0;
			for(int j=0;j<i;j++) //left check is the word repeat or not
			{
				if(s1[i].equals(s1[j]))
					   c++;
			}
			//System.out.print(s1[i]+" "+c);
			if(c==0)
			{
				for(int j=i;j<s1.length;j++)
				{
					if(s1[i].equals(s1[j]))
						 c++;
				}
				System.out.println(s1[i]+" "+c);
			}
		}
	}
}
