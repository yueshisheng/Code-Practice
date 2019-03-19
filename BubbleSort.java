package datastructure;
public class BubbleSort {
	public static void bubblesort(int [] a,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=0;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
		}
	}
	public static void main(String []args) {
		int [] b= {1,3,2,5,12,4};
		int n=6;
		bubblesort(b,6);
		for(int a:b) 
		System.out.println(a);
		}

}
