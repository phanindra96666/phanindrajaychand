import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		quicksort(a,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void quicksort(int a[],int s,int e) {
		if(s<e) {
			int j=partition(a,s,e);
			quicksort(a,s,j-1);
			quicksort(a,j+1,e);
		}
	}
	public static int partition(int a[],int s,int e) {
		int p=s,i=s+1,j=e;
		while(i<=j) {
			while(i<=e && a[p]>a[i]) {
				i++;
			}
			while(a[p]<a[j]) {
				j--;
			}
			if(i<j) {
				a[i]+=a[j]-(a[j]=a[i]);
			}
		}
		a[p]+=a[j]-(a[j]=a[p]);
		return j;
	}

}