//40.	Write a program to print the words in give’n string to the count(Repetation) in decreasing order? 
public class program40 {
	public static void main(String[] args) {
		String s="red yellow blue pink red purple lavender violet green grey green lavender red yellow orange pink magenta blue blue green indigo magenta green grey yellow white red white blue red violet";
		s=" "+s+" ";
		int count=0;
		String s1[]=new String[s.split(" ").length];
		int f[]=new int[s1.length];
		int i=0;
		while(s.trim().length()>0)
		{
			int a=s.indexOf(' ',1); 
			String w=s.substring(0,a+1);
			int l1=s.length();
			while(s.contains(w))
            {
                s=s.replace(w, " ");
            }
			int l2=s.length();
			count=(l1-l2)/a;
			System.out.println(w.trim()+" "+count);
		}
	}
}