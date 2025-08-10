 //39.	Write a program to print most repeated character and word in a given String?
public class program39 {
	public static void main(String []args)
	{
		String s2="this is a test this is only a test";
		String s[]=s2.split(" ");
		String s1="";
		String s3="";
		int mc=0;int mc1=0;
		for(int i=0;i<s.length;i++)
		{
			int c=0;
			for(int j=i;j<s.length;j++)
			{
				if(s[i].equals(s[j])){
				    c++;
                }
			}
			if(c>mc)
			{
				mc=c;
				s1=s[i];
			}
		}
		s2=s2.replaceAll(" ","");
		char ch[]=s2.toCharArray();
		char mrch = 0;
		int mrc=0;
		for(int i=0;i<s2.length();i++)
		{
			int c=0;
			for(int j=i;j<s2.length();j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
			if(c>mrc)
			{
				mrc=c;
				mrch=ch[i];
			}
		}
		System.out.println(mrch+" "+mrc);
		System.out.print(s1+" "+mc);
		
	}
}