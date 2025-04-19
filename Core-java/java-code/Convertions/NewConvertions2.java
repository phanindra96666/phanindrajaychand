import java.util.Scanner;
class NewConvertion2{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res=0,p=0; 
		if(n<0){
		    n = n*-1;
		 }
		 else{
		     n = n;
		 }
		 if(n==0){
		     System.out.print(0);
		 }
		String s = Integer.toString(n);
		if(s.matches("[0-4]+")){
		    for(int i =s.length()-1;i>=0;i--){
		        res=res+(s.charAt(i)-48)*(int)Math.pow(3,p);
		        p++;
		    }
            String hd = "";
            while(res>0){
                int r = res%5;
                if(r<10){
                    hd = r+hd;
                }
                else{
                    hd = (char)(r+55)+hd;
                }
                res/=5;
            }
            System.out.print(hd);
		 }
		else{
		    System.out.print("InvalId Input");
		}
	}
}