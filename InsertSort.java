package datastructure;

public class InsertSort {
	public static void insertSort(int [] a,int n) {
		for(int i=1;i<n;i++) {
			int insertnode=a[i];
			while(insertnode<a[i-1]) {
				int temp=0;
				temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
			}
			
		}
	}
	public static void main(String [] args) {
		int [] b= {3,1,2,25,12,39,25};
		int c=7;
		insertSort(b,c);
		for(int d:b)
			System.out.println(d);
	}
}
