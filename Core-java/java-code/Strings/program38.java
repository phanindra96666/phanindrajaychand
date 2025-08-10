//38.	Write a program to find the count of a each and every character in a given String?

public class program38 {
	public static void main(String [] args)
	{
		String s="java programing class";
        char cu = 'j';
        
		for(int i=0;i<s.length();i++)
		{
            if(s.charAt(i)!= ' '){
                cu = s.charAt(i);
            }
			int c=0;
            
			for(int j=0;j<i;j++)
			{ 
				if(cu==s.charAt(j))
				{
					c++;
                    break;
				}
			}
			if(c==0)
			{
				for(int j=i;j<s.length();j++)
				{
					if(cu==s.charAt(j))
					{
						c++;
					}
				}
				   System.out.println(cu+" "+c);
			}
		}
	}
}
