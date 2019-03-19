package datastructure;

public class dfs {
	int [] a=new int[10];
	int [] note=new int[10];
	static int count=0;
	public void dfs(int x) {
		if(x>9&&judge(a)==true) {
			count++;
		}
		for(int i=0;i<10;i++) {
			if(note[i]==0) {
				a[x]=i;
				note[i]=1;
				dfs(x+1);
				note[i]=0;
			}
		}
		
	}
	public boolean judge(int [] a) {
		 if(a[0]<a[1]&&a[0]<a[2]&&a[1]<a[3]&&a[1]<a[4]&&a[1]<a[5]&&a[2]<a[3]&&a[2]<a[4]&&a[2]<a[5]&&a[3]<a[6]
				 &&a[3]<a[7]&&a[3]<a[8]&&a[3]<a[9]&&a[4]<a[6]&&a[4]<a[7]&&a[4]<a[8]&&a[4]<a[9]
						 &&a[5]<a[6]&&a[5]<a[7]&&a[5]<a[8]&&a[5]<a[9]) {
			 return true;
		 }else {
			 return false;
		 }
	}
   public static void main(String [] args) {
	   dfs d=new dfs();
	   d.dfs(0);
	   System.out.println(count);
   }
   
}
