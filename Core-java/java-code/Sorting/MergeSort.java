import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		mergeSort(a,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void mergeSort(int a[],int s,int e) {
		if(s<e) {
			int m=(s+e)/2;
			mergeSort(a,s,m);
			mergeSort(a,m+1,e);
			merge(a,s,m,m+1,e);
		}
	}
	public static void merge(int a[],int ls,int le,int rs,int re) {
		int las=le-ls+1;
		int la[]=new int[las];
		int ras=re-rs+1;
		int ra[]=new int[ras];
		for(int i=0;i<las;i++) {
			la[i]=a[i+ls];
		}
		for(int i=0;i<ras;i++) {
			ra[i]=a[i+rs];
		}
		int i=0,j=0,k=ls;
		while(i<las && j<ras) {
			if(la[i]<ra[j]) {
				a[k]=la[i];
				i++;
				k++;
			}
			else {
				a[k]=ra[j];
				j++;
				k++;
			}
				
		}
		while(i<las) {
			a[k]=la[i];
			i++;
			k++;
		}
		while(j<ras) {
			a[k]=ra[j];
			j++;
			k++;
		}
	}
}