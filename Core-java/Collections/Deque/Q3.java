import java.util.*;
class Dat implements Comparable<Dat>
{
   int year;
   int month;
   int date;
   Dat(int year,int month,int date)
   {
       this.year=year;
       this.month=month;
       this.date=date;
   }
   public String toString()
   {
       return ""+year+"-"+month+"-"+date;
   }
   public int compareTo(Dat x)
   {
       if(year==x.year)
       {
            if(month==x.month)
            {
                return date-x.date;
                // if(date==x.date)
                // return 0;
                // if(date >x.date)
                // return 1;
                
                // return -1;
            }
            return month-x.month;
            // if(month>x.month)
            //     return 1;
                
            //     return -1;
       }
    //   if(year>x.year)
    //       return 1;
           
    //       return -1;
    
    return year-x.year;
   }
}
public class Q3
{
	public static void main(String[] args) {
		String x="2015-10-12,2015-10-11,2015-5-07,2013-12-31,2025-05-24";
		ArrayList<Dat> al=new ArrayList<>();
		String a[]=x.split(",");
		for(int i=0;i<a.length;i++)
		{
		   // System.out.println(a[i]);
		    String a1[]=a[i].split("-");
		    //System.out.println(a1[0]+" "+a1[1]+" "+a1[2]);
		    al.add(new Dat(Integer.parseInt(a1[0]),Integer.parseInt(a1[1]),Integer.parseInt(a1[2])));
		}
		Collections.sort(al);
		for(Dat y: al)
		{
		    System.out.println(y);
		}
		
	}
}