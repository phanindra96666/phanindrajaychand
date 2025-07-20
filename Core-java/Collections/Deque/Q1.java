import java.util.*;
public class Q1 {
	public static void main(String[] args)
	{
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.offer(546);
		ad.offer(763);
		ad.offer(74);
		ad.offer(25);
		ad.offer(126);
		ad.offer(12);	
		ArrayDeque<Integer> ad1=new ArrayDeque<>(ad);
		while(!ad.isEmpty())
		{
			System.out.print(ad.pollFirst()+" ");
		}
		System.out.println();
		while(!ad1.isEmpty())
		{
			System.out.print(ad1.pollLast()+" ");
		}
	}
}