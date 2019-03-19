package datastructure;

import java.util.Scanner;

public class Swap {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int [] n2=new int[n1];
		for(int i=0;i<n1;i++) {
			if(sc.hasNext()) {
				n2[i]=sc.nextInt();
			}
		}
		bubblesort(n2,n1);
		
		
			}
	public static void bubblesort(int [] a,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=0;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
				}
			}
		}
		System.out.println(count); 
	}

}
