public class farctrial {
    public static void main(String[] args){
		int n=521;
		while (n!=0){
			int temp=n%10;
			int fact=1;
            n/=10;
			for (int i=1;i<=temp;i++){
				fact=fact*i;
			}
			System.out.println(fact);
		}
	}
}