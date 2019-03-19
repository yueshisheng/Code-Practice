package datastructure;

import java.util.Scanner;

public class Binary {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int [] a=new int[d];
		for(int i=0;i<d;i++) {
			a[i]=sc.nextInt();
		}
		//int [] a= {1,2,3,4,5};
		int s=sc.nextInt();
		bin(s,a,a.length);
	}
	public static void bin(int s,int [] a,int n) {
		int left=0;
		int right=a.length-1;
		while(left<=right) {
			int middle=(left+right)/2;
			
			if(a[middle]==s) {
				System.out.println(middle+1);
				break;
			}else if(s>a[middle]) {
				left=middle+1;
				
			}else if(s<a[middle]) {
				
				right=middle-1;
			}
		}
		if(left>right)
		System.out.println(0);
	}

}
